//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 09:23:50 AM CET 
//


package net.atos.schemas.pizzeria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pizza" type="{http://www.atos.net/xml/pizzeria}Pizza"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pizza"
})
@XmlRootElement(name = "PizzaDetailsResponse")
public class PizzaDetailsResponse {

    @XmlElement(name = "Pizza", required = true)
    protected Pizza pizza;

    /**
     * Gets the value of the pizza property.
     * 
     * @return
     *     possible object is
     *     {@link Pizza }
     *     
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * Sets the value of the pizza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pizza }
     *     
     */
    public void setPizza(Pizza value) {
        this.pizza = value;
    }

}