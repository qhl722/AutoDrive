//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:49 PM PDT 
//


package org.movsim.scenario.boundary.autogen;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadMicroscopicBoundaryConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadMicroscopicBoundaryConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundaryConditions" type="{}BoundaryConditionsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadMicroscopicBoundaryConditionsType", propOrder = {
    "boundaryConditions"
})
public class RoadMicroscopicBoundaryConditionsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BoundaryConditions", required = true)
    protected BoundaryConditionsType boundaryConditions;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the boundaryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link BoundaryConditionsType }
     *     
     */
    public BoundaryConditionsType getBoundaryConditions() {
        return boundaryConditions;
    }

    /**
     * Sets the value of the boundaryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundaryConditionsType }
     *     
     */
    public void setBoundaryConditions(BoundaryConditionsType value) {
        this.boundaryConditions = value;
    }

    public boolean isSetBoundaryConditions() {
        return (this.boundaryConditions!= null);
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
