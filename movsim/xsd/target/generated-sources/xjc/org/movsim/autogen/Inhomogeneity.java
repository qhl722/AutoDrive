//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:48 PM PDT 
//


package org.movsim.autogen;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="position" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="valid_length" type="{}nonNegativeDouble" />
 *       &lt;attribute name="adaptation_length" type="{}nonNegativeDouble" default="0" />
 *       &lt;attribute name="start_alpha_T" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="start_alpha_v0" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="target_alpha_T" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="target_alpha_v0" type="{}nonNegativeDouble" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Inhomogeneity")
public class Inhomogeneity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "position", required = true)
    protected double position;
    @XmlAttribute(name = "valid_length")
    protected Double validLength;
    @XmlAttribute(name = "adaptation_length")
    protected Double adaptationLength;
    @XmlAttribute(name = "start_alpha_T")
    protected Double startAlphaT;
    @XmlAttribute(name = "start_alpha_v0")
    protected Double startAlphaV0;
    @XmlAttribute(name = "target_alpha_T")
    protected Double targetAlphaT;
    @XmlAttribute(name = "target_alpha_v0")
    protected Double targetAlphaV0;

    /**
     * Gets the value of the position property.
     * 
     */
    public double getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(double value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return true;
    }

    /**
     * Gets the value of the validLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getValidLength() {
        return validLength;
    }

    /**
     * Sets the value of the validLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValidLength(double value) {
        this.validLength = value;
    }

    public boolean isSetValidLength() {
        return (this.validLength!= null);
    }

    public void unsetValidLength() {
        this.validLength = null;
    }

    /**
     * Gets the value of the adaptationLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAdaptationLength() {
        if (adaptationLength == null) {
            return  0.0D;
        } else {
            return adaptationLength;
        }
    }

    /**
     * Sets the value of the adaptationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdaptationLength(double value) {
        this.adaptationLength = value;
    }

    public boolean isSetAdaptationLength() {
        return (this.adaptationLength!= null);
    }

    public void unsetAdaptationLength() {
        this.adaptationLength = null;
    }

    /**
     * Gets the value of the startAlphaT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getStartAlphaT() {
        if (startAlphaT == null) {
            return  1.0D;
        } else {
            return startAlphaT;
        }
    }

    /**
     * Sets the value of the startAlphaT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartAlphaT(double value) {
        this.startAlphaT = value;
    }

    public boolean isSetStartAlphaT() {
        return (this.startAlphaT!= null);
    }

    public void unsetStartAlphaT() {
        this.startAlphaT = null;
    }

    /**
     * Gets the value of the startAlphaV0 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getStartAlphaV0() {
        if (startAlphaV0 == null) {
            return  1.0D;
        } else {
            return startAlphaV0;
        }
    }

    /**
     * Sets the value of the startAlphaV0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartAlphaV0(double value) {
        this.startAlphaV0 = value;
    }

    public boolean isSetStartAlphaV0() {
        return (this.startAlphaV0 != null);
    }

    public void unsetStartAlphaV0() {
        this.startAlphaV0 = null;
    }

    /**
     * Gets the value of the targetAlphaT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTargetAlphaT() {
        if (targetAlphaT == null) {
            return  1.0D;
        } else {
            return targetAlphaT;
        }
    }

    /**
     * Sets the value of the targetAlphaT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetAlphaT(double value) {
        this.targetAlphaT = value;
    }

    public boolean isSetTargetAlphaT() {
        return (this.targetAlphaT!= null);
    }

    public void unsetTargetAlphaT() {
        this.targetAlphaT = null;
    }

    /**
     * Gets the value of the targetAlphaV0 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTargetAlphaV0() {
        if (targetAlphaV0 == null) {
            return  1.0D;
        } else {
            return targetAlphaV0;
        }
    }

    /**
     * Sets the value of the targetAlphaV0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetAlphaV0(double value) {
        this.targetAlphaV0 = value;
    }

    public boolean isSetTargetAlphaV0() {
        return (this.targetAlphaV0 != null);
    }

    public void unsetTargetAlphaV0() {
        this.targetAlphaV0 = null;
    }

}
