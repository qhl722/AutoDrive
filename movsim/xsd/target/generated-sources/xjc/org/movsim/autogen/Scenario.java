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
 *         &lt;element ref="{}Simulation"/>
 *         &lt;element ref="{}TrafficLights" minOccurs="0"/>
 *         &lt;element name="Regulators" type="{}RegulatorsType" minOccurs="0"/>
 *         &lt;element ref="{}Routes" minOccurs="0"/>
 *         &lt;element ref="{}OutputConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="network_filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initial_conditions_filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="micro_boundary_conditions_filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="external_vehicle_control_filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simulation",
    "trafficLights",
    "regulators",
    "routes",
    "outputConfiguration"
})
@XmlRootElement(name = "Scenario")
public class Scenario
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Simulation", required = true)
    protected Simulation simulation;
    @XmlElement(name = "TrafficLights")
    protected TrafficLights trafficLights;
    @XmlElement(name = "Regulators")
    protected RegulatorsType regulators;
    @XmlElement(name = "Routes")
    protected Routes routes;
    @XmlElement(name = "OutputConfiguration")
    protected OutputConfiguration outputConfiguration;
    @XmlAttribute(name = "network_filename", required = true)
    protected String networkFilename;
    @XmlAttribute(name = "initial_conditions_filename")
    protected String initialConditionsFilename;
    @XmlAttribute(name = "micro_boundary_conditions_filename")
    protected String microBoundaryConditionsFilename;
    @XmlAttribute(name = "external_vehicle_control_filename")
    protected String externalVehicleControlFilename;

    /**
     * Gets the value of the simulation property.
     * 
     * @return
     *     possible object is
     *     {@link Simulation }
     *     
     */
    public Simulation getSimulation() {
        return simulation;
    }

    /**
     * Sets the value of the simulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Simulation }
     *     
     */
    public void setSimulation(Simulation value) {
        this.simulation = value;
    }

    public boolean isSetSimulation() {
        return (this.simulation!= null);
    }

    /**
     * Gets the value of the trafficLights property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficLights }
     *     
     */
    public TrafficLights getTrafficLights() {
        return trafficLights;
    }

    /**
     * Sets the value of the trafficLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficLights }
     *     
     */
    public void setTrafficLights(TrafficLights value) {
        this.trafficLights = value;
    }

    public boolean isSetTrafficLights() {
        return (this.trafficLights!= null);
    }

    /**
     * Gets the value of the regulators property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorsType }
     *     
     */
    public RegulatorsType getRegulators() {
        return regulators;
    }

    /**
     * Sets the value of the regulators property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorsType }
     *     
     */
    public void setRegulators(RegulatorsType value) {
        this.regulators = value;
    }

    public boolean isSetRegulators() {
        return (this.regulators!= null);
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link Routes }
     *     
     */
    public Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routes }
     *     
     */
    public void setRoutes(Routes value) {
        this.routes = value;
    }

    public boolean isSetRoutes() {
        return (this.routes!= null);
    }

    /**
     * Gets the value of the outputConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link OutputConfiguration }
     *     
     */
    public OutputConfiguration getOutputConfiguration() {
        return outputConfiguration;
    }

    /**
     * Sets the value of the outputConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputConfiguration }
     *     
     */
    public void setOutputConfiguration(OutputConfiguration value) {
        this.outputConfiguration = value;
    }

    public boolean isSetOutputConfiguration() {
        return (this.outputConfiguration!= null);
    }

    /**
     * Gets the value of the networkFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkFilename() {
        return networkFilename;
    }

    /**
     * Sets the value of the networkFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkFilename(String value) {
        this.networkFilename = value;
    }

    public boolean isSetNetworkFilename() {
        return (this.networkFilename!= null);
    }

    /**
     * Gets the value of the initialConditionsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialConditionsFilename() {
        return initialConditionsFilename;
    }

    /**
     * Sets the value of the initialConditionsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialConditionsFilename(String value) {
        this.initialConditionsFilename = value;
    }

    public boolean isSetInitialConditionsFilename() {
        return (this.initialConditionsFilename!= null);
    }

    /**
     * Gets the value of the microBoundaryConditionsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicroBoundaryConditionsFilename() {
        return microBoundaryConditionsFilename;
    }

    /**
     * Sets the value of the microBoundaryConditionsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicroBoundaryConditionsFilename(String value) {
        this.microBoundaryConditionsFilename = value;
    }

    public boolean isSetMicroBoundaryConditionsFilename() {
        return (this.microBoundaryConditionsFilename!= null);
    }

    /**
     * Gets the value of the externalVehicleControlFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalVehicleControlFilename() {
        return externalVehicleControlFilename;
    }

    /**
     * Sets the value of the externalVehicleControlFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalVehicleControlFilename(String value) {
        this.externalVehicleControlFilename = value;
    }

    public boolean isSetExternalVehicleControlFilename() {
        return (this.externalVehicleControlFilename!= null);
    }

}