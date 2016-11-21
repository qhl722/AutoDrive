//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:48 PM PDT 
//


package org.movsim.autogen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}ControllerGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="n_timestep" type="{}positiveInteger" default="1" />
 *       &lt;attribute name="logging" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "controllerGroup"
})
@XmlRootElement(name = "TrafficLights")
public class TrafficLights
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ControllerGroup")
    protected List<ControllerGroup> controllerGroup;
    @XmlAttribute(name = "n_timestep")
    protected Integer nTimestep;
    @XmlAttribute(name = "logging")
    protected Boolean logging;

    /**
     * Gets the value of the controllerGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllerGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllerGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControllerGroup }
     * 
     * 
     */
    public List<ControllerGroup> getControllerGroup() {
        if (controllerGroup == null) {
            controllerGroup = new ArrayList<ControllerGroup>();
        }
        return this.controllerGroup;
    }

    public boolean isSetControllerGroup() {
        return ((this.controllerGroup!= null)&&(!this.controllerGroup.isEmpty()));
    }

    public void unsetControllerGroup() {
        this.controllerGroup = null;
    }

    /**
     * Gets the value of the nTimestep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNTimestep() {
        if (nTimestep == null) {
            return  1;
        } else {
            return nTimestep;
        }
    }

    /**
     * Sets the value of the nTimestep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTimestep(int value) {
        this.nTimestep = value;
    }

    public boolean isSetNTimestep() {
        return (this.nTimestep!= null);
    }

    public void unsetNTimestep() {
        this.nTimestep = null;
    }

    /**
     * Gets the value of the logging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLogging() {
        if (logging == null) {
            return false;
        } else {
            return logging;
        }
    }

    /**
     * Sets the value of the logging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogging(boolean value) {
        this.logging = value;
    }

    public boolean isSetLogging() {
        return (this.logging!= null);
    }

    public void unsetLogging() {
        this.logging = null;
    }

}