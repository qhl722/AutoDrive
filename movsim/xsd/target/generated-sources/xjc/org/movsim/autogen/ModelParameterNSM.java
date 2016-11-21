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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterNSM;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="p_slowdown" use="required" type="{}probability" />
 *       &lt;attribute name="p_slow_start" use="required" type="{}probability" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterNSM")
public class ModelParameterNSM
    extends BasicModelParameter
    implements Serializable, IModelParameterNSM
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "p_slowdown", required = true)
    protected double pSlowdown;
    @XmlAttribute(name = "p_slow_start", required = true)
    protected double pSlowStart;

    /**
     * Gets the value of the pSlowdown property.
     * 
     */
    public double getPSlowdown() {
        return pSlowdown;
    }

    /**
     * Sets the value of the pSlowdown property.
     * 
     */
    public void setPSlowdown(double value) {
        this.pSlowdown = value;
    }

    public boolean isSetPSlowdown() {
        return true;
    }

    /**
     * Gets the value of the pSlowStart property.
     * 
     */
    public double getPSlowStart() {
        return pSlowStart;
    }

    /**
     * Sets the value of the pSlowStart property.
     * 
     */
    public void setPSlowStart(double value) {
        this.pSlowStart = value;
    }

    public boolean isSetPSlowStart() {
        return true;
    }

}
