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
 *         &lt;element ref="{}VehiclePrototypeConfiguration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="write_fund_diagrams" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="write_acc_functions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehiclePrototypeConfiguration"
})
@XmlRootElement(name = "VehiclePrototypes")
public class VehiclePrototypes
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehiclePrototypeConfiguration", required = true)
    protected List<VehiclePrototypeConfiguration> vehiclePrototypeConfiguration;
    @XmlAttribute(name = "write_fund_diagrams")
    protected Boolean writeFundDiagrams;
    @XmlAttribute(name = "write_acc_functions")
    protected Boolean writeAccFunctions;

    /**
     * Gets the value of the vehiclePrototypeConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiclePrototypeConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiclePrototypeConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclePrototypeConfiguration }
     * 
     * 
     */
    public List<VehiclePrototypeConfiguration> getVehiclePrototypeConfiguration() {
        if (vehiclePrototypeConfiguration == null) {
            vehiclePrototypeConfiguration = new ArrayList<VehiclePrototypeConfiguration>();
        }
        return this.vehiclePrototypeConfiguration;
    }

    public boolean isSetVehiclePrototypeConfiguration() {
        return ((this.vehiclePrototypeConfiguration!= null)&&(!this.vehiclePrototypeConfiguration.isEmpty()));
    }

    public void unsetVehiclePrototypeConfiguration() {
        this.vehiclePrototypeConfiguration = null;
    }

    /**
     * Gets the value of the writeFundDiagrams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWriteFundDiagrams() {
        if (writeFundDiagrams == null) {
            return false;
        } else {
            return writeFundDiagrams;
        }
    }

    /**
     * Sets the value of the writeFundDiagrams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteFundDiagrams(boolean value) {
        this.writeFundDiagrams = value;
    }

    public boolean isSetWriteFundDiagrams() {
        return (this.writeFundDiagrams!= null);
    }

    public void unsetWriteFundDiagrams() {
        this.writeFundDiagrams = null;
    }

    /**
     * Gets the value of the writeAccFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWriteAccFunctions() {
        if (writeAccFunctions == null) {
            return false;
        } else {
            return writeAccFunctions;
        }
    }

    /**
     * Sets the value of the writeAccFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteAccFunctions(boolean value) {
        this.writeAccFunctions = value;
    }

    public boolean isSetWriteAccFunctions() {
        return (this.writeAccFunctions!= null);
    }

    public void unsetWriteAccFunctions() {
        this.writeAccFunctions = null;
    }

}