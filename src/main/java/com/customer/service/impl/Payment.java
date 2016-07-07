
package com.customer.service.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash_On_Delivery"/>
 *     &lt;enumeration value="Debit_Card"/>
 *     &lt;enumeration value="Credit_Card"/>
 *     &lt;enumeration value="PayTm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payment")
@XmlEnum
public enum Payment {

    @XmlEnumValue("Cash_On_Delivery")
    CASH_ON_DELIVERY("Cash_On_Delivery"),
    @XmlEnumValue("Debit_Card")
    DEBIT_CARD("Debit_Card"),
    @XmlEnumValue("Credit_Card")
    CREDIT_CARD("Credit_Card"),
    @XmlEnumValue("PayTm")
    PAY_TM("PayTm");
    private final String value;

    Payment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Payment fromValue(String v) {
        for (Payment c: Payment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
