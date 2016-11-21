//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.03 at 09:23:49 PM PDT 
//


package org.movsim.scenario.initial.autogen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacroscopicInitialConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MacroscopicInitialConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MacroCondition" type="{}MacroConditionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MacroscopicInitialConditionsType", propOrder = {
    "macroCondition"
})
public class MacroscopicInitialConditionsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MacroCondition", required = true)
    protected List<MacroConditionType> macroCondition;

    /**
     * Gets the value of the macroCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macroCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacroCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MacroConditionType }
     * 
     * 
     */
    public List<MacroConditionType> getMacroCondition() {
        if (macroCondition == null) {
            macroCondition = new ArrayList<MacroConditionType>();
        }
        return this.macroCondition;
    }

    public boolean isSetMacroCondition() {
        return ((this.macroCondition!= null)&&(!this.macroCondition.isEmpty()));
    }

    public void unsetMacroCondition() {
        this.macroCondition = null;
    }

}
