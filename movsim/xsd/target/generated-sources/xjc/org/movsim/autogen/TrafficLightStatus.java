//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:48 PM PDT 
//


package org.movsim.autogen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficLightStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficLightStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="RedGreen"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="GreenRed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficLightStatus")
@XmlEnum
public enum TrafficLightStatus {

    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("RedGreen")
    RED_GREEN("RedGreen"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("GreenRed")
    GREEN_RED("GreenRed");
    private final String value;

    TrafficLightStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficLightStatus fromValue(String v) {
        for (TrafficLightStatus c: TrafficLightStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
