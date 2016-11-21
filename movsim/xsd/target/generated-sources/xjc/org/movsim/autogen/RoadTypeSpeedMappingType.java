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
import javax.xml.bind.annotation.XmlType;


/**
 * Mapping of road type to the maximum speed that is allowed for the road type.
 * 
 * <p>Java class for RoadTypeSpeedMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadTypeSpeedMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="road_type" type="{}RoadTypeEnum" />
 *       &lt;attribute name="default_speed_kmh" type="{}positiveDouble" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadTypeSpeedMappingType")
public class RoadTypeSpeedMappingType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "road_type")
    protected RoadTypeEnum roadType;
    @XmlAttribute(name = "default_speed_kmh")
    protected Double defaultSpeedKmh;

    /**
     * Gets the value of the roadType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadTypeEnum }
     *     
     */
    public RoadTypeEnum getRoadType() {
        return roadType;
    }

    /**
     * Sets the value of the roadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTypeEnum }
     *     
     */
    public void setRoadType(RoadTypeEnum value) {
        this.roadType = value;
    }

    public boolean isSetRoadType() {
        return (this.roadType!= null);
    }

    /**
     * Gets the value of the defaultSpeedKmh property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDefaultSpeedKmh() {
        return defaultSpeedKmh;
    }

    /**
     * Sets the value of the defaultSpeedKmh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultSpeedKmh(double value) {
        this.defaultSpeedKmh = value;
    }

    public boolean isSetDefaultSpeedKmh() {
        return (this.defaultSpeedKmh!= null);
    }

    public void unsetDefaultSpeedKmh() {
        this.defaultSpeedKmh = null;
    }

}