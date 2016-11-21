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
 *         &lt;element ref="{}Consumption" minOccurs="0"/>
 *         &lt;element ref="{}VehiclePrototypes" minOccurs="0"/>
 *         &lt;element name="ServiceProviders" type="{}ServiceProvidersType" minOccurs="0"/>
 *         &lt;element name="RoadTypeSpeedMappings" type="{}RoadTypeSpeedMappingsType" minOccurs="0"/>
 *         &lt;element ref="{}Scenario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consumption",
    "vehiclePrototypes",
    "serviceProviders",
    "roadTypeSpeedMappings",
    "scenario"
})
@XmlRootElement(name = "Movsim")
public class Movsim
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Consumption")
    protected Consumption consumption;
    @XmlElement(name = "VehiclePrototypes")
    protected VehiclePrototypes vehiclePrototypes;
    @XmlElement(name = "ServiceProviders")
    protected ServiceProvidersType serviceProviders;
    @XmlElement(name = "RoadTypeSpeedMappings")
    protected RoadTypeSpeedMappingsType roadTypeSpeedMappings;
    @XmlElement(name = "Scenario")
    protected Scenario scenario;

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link Consumption }
     *     
     */
    public Consumption getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumption }
     *     
     */
    public void setConsumption(Consumption value) {
        this.consumption = value;
    }

    public boolean isSetConsumption() {
        return (this.consumption!= null);
    }

    /**
     * Gets the value of the vehiclePrototypes property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrototypes }
     *     
     */
    public VehiclePrototypes getVehiclePrototypes() {
        return vehiclePrototypes;
    }

    /**
     * Sets the value of the vehiclePrototypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrototypes }
     *     
     */
    public void setVehiclePrototypes(VehiclePrototypes value) {
        this.vehiclePrototypes = value;
    }

    public boolean isSetVehiclePrototypes() {
        return (this.vehiclePrototypes!= null);
    }

    /**
     * Gets the value of the serviceProviders property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProvidersType }
     *     
     */
    public ServiceProvidersType getServiceProviders() {
        return serviceProviders;
    }

    /**
     * Sets the value of the serviceProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProvidersType }
     *     
     */
    public void setServiceProviders(ServiceProvidersType value) {
        this.serviceProviders = value;
    }

    public boolean isSetServiceProviders() {
        return (this.serviceProviders!= null);
    }

    /**
     * Gets the value of the roadTypeSpeedMappings property.
     * 
     * @return
     *     possible object is
     *     {@link RoadTypeSpeedMappingsType }
     *     
     */
    public RoadTypeSpeedMappingsType getRoadTypeSpeedMappings() {
        return roadTypeSpeedMappings;
    }

    /**
     * Sets the value of the roadTypeSpeedMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTypeSpeedMappingsType }
     *     
     */
    public void setRoadTypeSpeedMappings(RoadTypeSpeedMappingsType value) {
        this.roadTypeSpeedMappings = value;
    }

    public boolean isSetRoadTypeSpeedMappings() {
        return (this.roadTypeSpeedMappings!= null);
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link Scenario }
     *     
     */
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scenario }
     *     
     */
    public void setScenario(Scenario value) {
        this.scenario = value;
    }

    public boolean isSetScenario() {
        return (this.scenario!= null);
    }

}