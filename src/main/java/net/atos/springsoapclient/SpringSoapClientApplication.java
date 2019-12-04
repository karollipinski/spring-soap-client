package net.atos.springsoapclient;

import lombok.extern.slf4j.Slf4j;
import net.atos.schemas.pizzeria.PizzaDetailsRequest;
import net.atos.schemas.pizzeria.PizzaDetailsResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringSoapClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringSoapClientApplication.class, args);

        SOAPConnector soapConnector = context.getBean(SOAPConnector.class);

        PizzaDetailsRequest request = new PizzaDetailsRequest();
        request.setName("Peperoni");

        PizzaDetailsResponse response = (PizzaDetailsResponse) soapConnector.callWebService("http://localhost:8080/service/pizza-details", request);
        log.info("Response from SOAP \n {}", response);

    }

}
