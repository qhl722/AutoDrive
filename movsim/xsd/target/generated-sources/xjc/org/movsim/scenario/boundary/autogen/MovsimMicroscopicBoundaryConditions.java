//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:49 PM PDT 
//


package org.movsim.scenario.boundary.autogen;

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
 *         &lt;element name="RoadMicroscopicBoundaryConditions" type="{}RoadMicroscopicBoundaryConditionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="time_format" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roadMicroscopicBoundaryConditions"
})
@XmlRootElement(name = "MovsimMicroscopicBoundaryConditions")
public class MovsimMicroscopicBoundaryConditions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RoadMicroscopicBoundaryConditions")
    protected List<RoadMicroscopicBoundaryConditionsType> roadMicroscopicBoundaryConditions;
    @XmlAttribute(name = "time_format")
    protected String timeFormat;

    /**
     * Gets the value of the roadMicroscopicBoundaryConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadMicroscopicBoundaryConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadMicroscopicBoundaryConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadMicroscopicBoundaryConditionsType }
     * 
     * 
     */
    public List<RoadMicroscopicBoundaryConditionsType> getRoadMicroscopicBoundaryConditions() {
        if (roadMicroscopicBoundaryConditions == null) {
            roadMicroscopicBoundaryConditions = new ArrayList<RoadMicroscopicBoundaryConditionsType>();
        }
        return this.roadMicroscopicBoundaryConditions;
    }

    public boolean isSetRoadMicroscopicBoundaryConditions() {
        return ((this.roadMicroscopicBoundaryConditions!= null)&&(!this.roadMicroscopicBoundaryConditions.isEmpty()));
    }

    public void unsetRoadMicroscopicBoundaryConditions() {
        this.roadMicroscopicBoundaryConditions = null;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        if (timeFormat == null) {
            return "";
        } else {
            return timeFormat;
        }
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    public boolean isSetTimeFormat() {
        return (this.timeFormat!= null);
    }

}
