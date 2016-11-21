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
 *         &lt;element ref="{}TrafficComposition" minOccurs="0"/>
 *         &lt;element name="TrafficSource" type="{}TrafficSourceType" minOccurs="0"/>
 *         &lt;element name="TrafficSink" type="{}TrafficSinkType" minOccurs="0"/>
 *         &lt;element ref="{}FlowConservingInhomogeneities" minOccurs="0"/>
 *         &lt;element ref="{}VariableMessageSignDiversions" minOccurs="0"/>
 *         &lt;element ref="{}SimpleRamp" minOccurs="0"/>
 *         &lt;element ref="{}Detectors" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "trafficComposition",
    "trafficSource",
    "trafficSink",
    "flowConservingInhomogeneities",
    "variableMessageSignDiversions",
    "simpleRamp",
    "detectors"
})
@XmlRootElement(name = "Road")
public class Road
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrafficComposition")
    protected TrafficComposition trafficComposition;
    @XmlElement(name = "TrafficSource")
    protected TrafficSourceType trafficSource;
    @XmlElement(name = "TrafficSink")
    protected TrafficSinkType trafficSink;
    @XmlElement(name = "FlowConservingInhomogeneities")
    protected FlowConservingInhomogeneities flowConservingInhomogeneities;
    @XmlElement(name = "VariableMessageSignDiversions")
    protected VariableMessageSignDiversions variableMessageSignDiversions;
    @XmlElement(name = "SimpleRamp")
    protected SimpleRamp simpleRamp;
    @XmlElement(name = "Detectors")
    protected Detectors detectors;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "logging")
    protected Boolean logging;

    /**
     * Gets the value of the trafficComposition property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficComposition }
     *     
     */
    public TrafficComposition getTrafficComposition() {
        return trafficComposition;
    }

    /**
     * Sets the value of the trafficComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficComposition }
     *     
     */
    public void setTrafficComposition(TrafficComposition value) {
        this.trafficComposition = value;
    }

    public boolean isSetTrafficComposition() {
        return (this.trafficComposition!= null);
    }

    /**
     * Gets the value of the trafficSource property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficSourceType }
     *     
     */
    public TrafficSourceType getTrafficSource() {
        return trafficSource;
    }

    /**
     * Sets the value of the trafficSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficSourceType }
     *     
     */
    public void setTrafficSource(TrafficSourceType value) {
        this.trafficSource = value;
    }

    public boolean isSetTrafficSource() {
        return (this.trafficSource!= null);
    }

    /**
     * Gets the value of the trafficSink property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficSinkType }
     *     
     */
    public TrafficSinkType getTrafficSink() {
        return trafficSink;
    }

    /**
     * Sets the value of the trafficSink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficSinkType }
     *     
     */
    public void setTrafficSink(TrafficSinkType value) {
        this.trafficSink = value;
    }

    public boolean isSetTrafficSink() {
        return (this.trafficSink!= null);
    }

    /**
     * Gets the value of the flowConservingInhomogeneities property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConservingInhomogeneities }
     *     
     */
    public FlowConservingInhomogeneities getFlowConservingInhomogeneities() {
        return flowConservingInhomogeneities;
    }

    /**
     * Sets the value of the flowConservingInhomogeneities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConservingInhomogeneities }
     *     
     */
    public void setFlowConservingInhomogeneities(FlowConservingInhomogeneities value) {
        this.flowConservingInhomogeneities = value;
    }

    public boolean isSetFlowConservingInhomogeneities() {
        return (this.flowConservingInhomogeneities!= null);
    }

    /**
     * Gets the value of the variableMessageSignDiversions property.
     * 
     * @return
     *     possible object is
     *     {@link VariableMessageSignDiversions }
     *     
     */
    public VariableMessageSignDiversions getVariableMessageSignDiversions() {
        return variableMessageSignDiversions;
    }

    /**
     * Sets the value of the variableMessageSignDiversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableMessageSignDiversions }
     *     
     */
    public void setVariableMessageSignDiversions(VariableMessageSignDiversions value) {
        this.variableMessageSignDiversions = value;
    }

    public boolean isSetVariableMessageSignDiversions() {
        return (this.variableMessageSignDiversions!= null);
    }

    /**
     * Gets the value of the simpleRamp property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRamp }
     *     
     */
    public SimpleRamp getSimpleRamp() {
        return simpleRamp;
    }

    /**
     * Sets the value of the simpleRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRamp }
     *     
     */
    public void setSimpleRamp(SimpleRamp value) {
        this.simpleRamp = value;
    }

    public boolean isSetSimpleRamp() {
        return (this.simpleRamp!= null);
    }

    /**
     * Gets the value of the detectors property.
     * 
     * @return
     *     possible object is
     *     {@link Detectors }
     *     
     */
    public Detectors getDetectors() {
        return detectors;
    }

    /**
     * Sets the value of the detectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detectors }
     *     
     */
    public void setDetectors(Detectors value) {
        this.detectors = value;
    }

    public boolean isSetDetectors() {
        return (this.detectors!= null);
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
