package net.atos.springsoapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller1 = new Jaxb2Marshaller();
        marshaller1.setContextPath("net.atos.schemas.pizzeria");
        return marshaller1;
    }

    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://localhost:8080/service/pizza-details");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;

    }
}
