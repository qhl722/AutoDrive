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
 *       &lt;attribute name="max_power_kW" type="{}nonNegativeDouble" default="90" />
 *       &lt;attribute name="cylinder_vol_l" type="{}nonNegativeDouble" default="1.4" />
 *       &lt;attribute name="idle_cons_rate_linvh" type="{}nonNegativeDouble" default="0.6" />
 *       &lt;attribute name="cspec_min_g_per_kwh" type="{}nonNegativeDouble" default="212" />
 *       &lt;attribute name="pe_min_bar" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="pe_max_bar" type="{}nonNegativeDouble" default="19" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EngineCombustionMap")
public class EngineCombustionMap
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "max_power_kW")
    protected Double maxPowerKW;
    @XmlAttribute(name = "cylinder_vol_l")
    protected Double cylinderVolL;
    @XmlAttribute(name = "idle_cons_rate_linvh")
    protected Double idleConsRateLinvh;
    @XmlAttribute(name = "cspec_min_g_per_kwh")
    protected Double cspecMinGPerKwh;
    @XmlAttribute(name = "pe_min_bar")
    protected Double peMinBar;
    @XmlAttribute(name = "pe_max_bar")
    protected Double peMaxBar;

    /**
     * Gets the value of the maxPowerKW property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMaxPowerKW() {
        if (maxPowerKW == null) {
            return  90.0D;
        } else {
            return maxPowerKW;
        }
    }

    /**
     * Sets the value of the maxPowerKW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPowerKW(double value) {
        this.maxPowerKW = value;
    }

    public boolean isSetMaxPowerKW() {
        return (this.maxPowerKW!= null);
    }

    public void unsetMaxPowerKW() {
        this.maxPowerKW = null;
    }

    /**
     * Gets the value of the cylinderVolL property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCylinderVolL() {
        if (cylinderVolL == null) {
            return  1.4D;
        } else {
            return cylinderVolL;
        }
    }

    /**
     * Sets the value of the cylinderVolL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCylinderVolL(double value) {
        this.cylinderVolL = value;
    }

    public boolean isSetCylinderVolL() {
        return (this.cylinderVolL!= null);
    }

    public void unsetCylinderVolL() {
        this.cylinderVolL = null;
    }

    /**
     * Gets the value of the idleConsRateLinvh property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getIdleConsRateLinvh() {
        if (idleConsRateLinvh == null) {
            return  0.6D;
        } else {
            return idleConsRateLinvh;
        }
    }

    /**
     * Sets the value of the idleConsRateLinvh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIdleConsRateLinvh(double value) {
        this.idleConsRateLinvh = value;
    }

    public boolean isSetIdleConsRateLinvh() {
        return (this.idleConsRateLinvh!= null);
    }

    public void unsetIdleConsRateLinvh() {
        this.idleConsRateLinvh = null;
    }

    /**
     * Gets the value of the cspecMinGPerKwh property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCspecMinGPerKwh() {
        if (cspecMinGPerKwh == null) {
            return  212.0D;
        } else {
            return cspecMinGPerKwh;
        }
    }

    /**
     * Sets the value of the cspecMinGPerKwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCspecMinGPerKwh(double value) {
        this.cspecMinGPerKwh = value;
    }

    public boolean isSetCspecMinGPerKwh() {
        return (this.cspecMinGPerKwh!= null);
    }

    public void unsetCspecMinGPerKwh() {
        this.cspecMinGPerKwh = null;
    }

    /**
     * Gets the value of the peMinBar property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPeMinBar() {
        if (peMinBar == null) {
            return  1.0D;
        } else {
            return peMinBar;
        }
    }

    /**
     * Sets the value of the peMinBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeMinBar(double value) {
        this.peMinBar = value;
    }

    public boolean isSetPeMinBar() {
        return (this.peMinBar!= null);
    }

    public void unsetPeMinBar() {
        this.peMinBar = null;
    }

    /**
     * Gets the value of the peMaxBar property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPeMaxBar() {
        if (peMaxBar == null) {
            return  19.0D;
        } else {
            return peMaxBar;
        }
    }

    /**
     * Sets the value of the peMaxBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeMaxBar(double value) {
        this.peMaxBar = value;
    }

    public boolean isSetPeMaxBar() {
        return (this.peMaxBar!= null);
    }

    public void unsetPeMaxBar() {
        this.peMaxBar = null;
    }

}
