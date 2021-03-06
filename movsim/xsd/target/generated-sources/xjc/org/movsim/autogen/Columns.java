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
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="acceleration" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="gradient" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Columns")
public class Columns
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "time", required = true)
    protected int time;
    @XmlAttribute(name = "speed")
    protected Integer speed;
    @XmlAttribute(name = "acceleration")
    protected Integer acceleration;
    @XmlAttribute(name = "gradient")
    protected Integer gradient;
    @XmlAttribute(name = "position")
    protected Integer position;

    /**
     * Gets the value of the time property.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    public boolean isSetTime() {
        return true;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSpeed() {
        if (speed == null) {
            return -1;
        } else {
            return speed;
        }
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    public void unsetSpeed() {
        this.speed = null;
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAcceleration() {
        if (acceleration == null) {
            return -1;
        } else {
            return acceleration;
        }
    }

    /**
     * Sets the value of the acceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceleration(int value) {
        this.acceleration = value;
    }

    public boolean isSetAcceleration() {
        return (this.acceleration!= null);
    }

    public void unsetAcceleration() {
        this.acceleration = null;
    }

    /**
     * Gets the value of the gradient property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getGradient() {
        if (gradient == null) {
            return -1;
        } else {
            return gradient;
        }
    }

    /**
     * Sets the value of the gradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradient(int value) {
        this.gradient = value;
    }

    public boolean isSetGradient() {
        return (this.gradient!= null);
    }

    public void unsetGradient() {
        this.gradient = null;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPosition() {
        if (position == null) {
            return -1;
        } else {
            return position;
        }
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(int value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

    public void unsetPosition() {
        this.position = null;
    }

}
