
package com.customer.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ordersDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ordersDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemsList" type="{http://impl.service.customer.com/}items" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="o_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://impl.service.customer.com/}payment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordersDetails", propOrder = {
    "cId",
    "itemsList",
    "oId",
    "payment"
})
public class OrdersDetails {

    @XmlElement(name = "c_Id")
    protected String cId;
    @XmlElement(nillable = true)
    protected List<Items> itemsList;
    @XmlElement(name = "o_Id")
    protected String oId;
    @XmlSchemaType(name = "string")
    protected Payment payment;

    /**
     * Gets the value of the cId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCId() {
        return cId;
    }

    /**
     * Sets the value of the cId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCId(String value) {
        this.cId = value;
    }

    /**
     * Gets the value of the itemsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Items }
     * 
     * 
     */
    public List<Items> getItemsList() {
        if (itemsList == null) {
            itemsList = new ArrayList<Items>();
        }
        return this.itemsList;
    }

    /**
     * Gets the value of the oId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOId() {
        return oId;
    }

    /**
     * Sets the value of the oId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOId(String value) {
        this.oId = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

}
