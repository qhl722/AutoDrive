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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteAlternativesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteAlternativesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouteAlternative" type="{}RouteAlternativeType" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roadSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteAlternativesType", propOrder = {
    "routeAlternative"
})
public class RouteAlternativesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RouteAlternative", required = true)
    protected List<RouteAlternativeType> routeAlternative;
    @XmlAttribute(name = "roadSegment")
    protected String roadSegment;

    /**
     * Gets the value of the routeAlternative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeAlternative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteAlternative().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteAlternativeType }
     * 
     * 
     */
    public List<RouteAlternativeType> getRouteAlternative() {
        if (routeAlternative == null) {
            routeAlternative = new ArrayList<RouteAlternativeType>();
        }
        return this.routeAlternative;
    }

    public boolean isSetRouteAlternative() {
        return ((this.routeAlternative!= null)&&(!this.routeAlternative.isEmpty()));
    }

    public void unsetRouteAlternative() {
        this.routeAlternative = null;
    }

    /**
     * Gets the value of the roadSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadSegment() {
        return roadSegment;
    }

    /**
     * Sets the value of the roadSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadSegment(String value) {
        this.roadSegment = value;
    }

    public boolean isSetRoadSegment() {
        return (this.roadSegment!= null);
    }

}
