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
 *         &lt;element ref="{}VehicleData"/>
 *         &lt;choice>
 *           &lt;element ref="{}EngineCombustionMap"/>
 *           &lt;element ref="{}EngineConstantMap"/>
 *         &lt;/choice>
 *         &lt;element ref="{}RotationModel"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleData",
    "engineCombustionMap",
    "engineConstantMap",
    "rotationModel"
})
@XmlRootElement(name = "ConsumptionModel")
public class ConsumptionModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleData", required = true)
    protected VehicleData vehicleData;
    @XmlElement(name = "EngineCombustionMap")
    protected EngineCombustionMap engineCombustionMap;
    @XmlElement(name = "EngineConstantMap")
    protected EngineConstantMap engineConstantMap;
    @XmlElement(name = "RotationModel", required = true)
    protected RotationModel rotationModel;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "output")
    protected Boolean output;

    /**
     * Gets the value of the vehicleData property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleData }
     *     
     */
    public VehicleData getVehicleData() {
        return vehicleData;
    }

    /**
     * Sets the value of the vehicleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleData }
     *     
     */
    public void setVehicleData(VehicleData value) {
        this.vehicleData = value;
    }

    public boolean isSetVehicleData() {
        return (this.vehicleData!= null);
    }

    /**
     * Gets the value of the engineCombustionMap property.
     * 
     * @return
     *     possible object is
     *     {@link EngineCombustionMap }
     *     
     */
    public EngineCombustionMap getEngineCombustionMap() {
        return engineCombustionMap;
    }

    /**
     * Sets the value of the engineCombustionMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineCombustionMap }
     *     
     */
    public void setEngineCombustionMap(EngineCombustionMap value) {
        this.engineCombustionMap = value;
    }

    public boolean isSetEngineCombustionMap() {
        return (this.engineCombustionMap!= null);
    }

    /**
     * Gets the value of the engineConstantMap property.
     * 
     * @return
     *     possible object is
     *     {@link EngineConstantMap }
     *     
     */
    public EngineConstantMap getEngineConstantMap() {
        return engineConstantMap;
    }

    /**
     * Sets the value of the engineConstantMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineConstantMap }
     *     
     */
    public void setEngineConstantMap(EngineConstantMap value) {
        this.engineConstantMap = value;
    }

    public boolean isSetEngineConstantMap() {
        return (this.engineConstantMap!= null);
    }

    /**
     * Gets the value of the rotationModel property.
     * 
     * @return
     *     possible object is
     *     {@link RotationModel }
     *     
     */
    public RotationModel getRotationModel() {
        return rotationModel;
    }

    /**
     * Sets the value of the rotationModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RotationModel }
     *     
     */
    public void setRotationModel(RotationModel value) {
        this.rotationModel = value;
    }

    public boolean isSetRotationModel() {
        return (this.rotationModel!= null);
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    public boolean isSetLabel() {
        return (this.label!= null);
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOutput() {
        if (output == null) {
            return false;
        } else {
            return output;
        }
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutput(boolean value) {
        this.output = value;
    }

    public boolean isSetOutput() {
        return (this.output!= null);
    }

    public void unsetOutput() {
        this.output = null;
    }

}
