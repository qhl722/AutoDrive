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
 *         &lt;element ref="{}VariableMessageSignDiversion" maxOccurs="unbounded" minOccurs="0"/>
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
    "variableMessageSignDiversion"
})
@XmlRootElement(name = "VariableMessageSignDiversions")
public class VariableMessageSignDiversions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VariableMessageSignDiversion")
    protected List<VariableMessageSignDiversion> variableMessageSignDiversion;

    /**
     * Gets the value of the variableMessageSignDiversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableMessageSignDiversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableMessageSignDiversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableMessageSignDiversion }
     * 
     * 
     */
    public List<VariableMessageSignDiversion> getVariableMessageSignDiversion() {
        if (variableMessageSignDiversion == null) {
            variableMessageSignDiversion = new ArrayList<VariableMessageSignDiversion>();
        }
        return this.variableMessageSignDiversion;
    }

    public boolean isSetVariableMessageSignDiversion() {
        return ((this.variableMessageSignDiversion!= null)&&(!this.variableMessageSignDiversion.isEmpty()));
    }

    public void unsetVariableMessageSignDiversion() {
        this.variableMessageSignDiversion = null;
    }

}
