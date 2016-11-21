//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:49 PM PDT 
//


package org.movsim.scenario.initial.autogen;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadInitialConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadInitialConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MacroscopicInitialConditions" type="{}MacroscopicInitialConditionsType"/>
 *         &lt;element name="MicroscopicInitialConditions" type="{}MicroscopicInitialConditionsType"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadInitialConditionsType", propOrder = {
    "macroscopicInitialConditions",
    "microscopicInitialConditions"
})
public class RoadInitialConditionsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MacroscopicInitialConditions")
    protected MacroscopicInitialConditionsType macroscopicInitialConditions;
    @XmlElement(name = "MicroscopicInitialConditions")
    protected MicroscopicInitialConditionsType microscopicInitialConditions;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the macroscopicInitialConditions property.
     * 
     * @return
     *     possible object is
     *     {@link MacroscopicInitialConditionsType }
     *     
     */
    public MacroscopicInitialConditionsType getMacroscopicInitialConditions() {
        return macroscopicInitialConditions;
    }

    /**
     * Sets the value of the macroscopicInitialConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacroscopicInitialConditionsType }
     *     
     */
    public void setMacroscopicInitialConditions(MacroscopicInitialConditionsType value) {
        this.macroscopicInitialConditions = value;
    }

    public boolean isSetMacroscopicInitialConditions() {
        return (this.macroscopicInitialConditions!= null);
    }

    /**
     * Gets the value of the microscopicInitialConditions property.
     * 
     * @return
     *     possible object is
     *     {@link MicroscopicInitialConditionsType }
     *     
     */
    public MicroscopicInitialConditionsType getMicroscopicInitialConditions() {
        return microscopicInitialConditions;
    }

    /**
     * Sets the value of the microscopicInitialConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicroscopicInitialConditionsType }
     *     
     */
    public void setMicroscopicInitialConditions(MicroscopicInitialConditionsType value) {
        this.microscopicInitialConditions = value;
    }

    public boolean isSetMicroscopicInitialConditions() {
        return (this.microscopicInitialConditions!= null);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
