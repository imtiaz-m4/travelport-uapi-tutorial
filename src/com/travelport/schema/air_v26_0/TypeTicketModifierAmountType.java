
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * Ticketing Modifier used to alter a fare
 *                 amount before or during the ticketing operation.
 * 
 * <p>Java class for typeTicketModifierAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTicketModifierAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v26_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTicketModifierAmountType")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class TypeTicketModifierAmountType
    implements Locatable
{

    @XmlAttribute(name = "Amount", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String amount;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}