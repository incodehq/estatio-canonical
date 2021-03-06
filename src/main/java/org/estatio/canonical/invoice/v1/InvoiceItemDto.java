package org.estatio.canonical.invoice.v1;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.isis.schema.common.v1.OidDto;

import org.estatio.canonical.HasSelfDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Designed to be usable both as a view model (exposed from RO) and within the Camel ESB.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "self",
        "chargeReference",
        "chargeName",
        "chargeDescription",
        "chargeExternalReference",
        "chargeGroupReference",
        "chargeGroupName",
        "taxReference",
        "taxName",
        "taxDescription",
        "taxExternalReference",
        "description",
        "netAmount",
        "grossAmount",
        "vatAmount",
        "startDate",
        "endDate",
        "effectiveStartDate",
        "effectiveEndDate",
        "agreementReference",
        "fixedAssetReference", // of the unit
        "fixedAssetExternalReference", // of the unit
        "occupancyBrand",
        "adjustment"
})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceItemDto implements HasSelfDto {

    @XmlElement(required = true)
    @Getter @Setter
    protected OidDto self;

    //Charge

    @Getter @Setter
    protected String chargeReference;

    @Getter @Setter
    protected String chargeName;

    @Getter @Setter
    protected String chargeDescription;

    @Getter @Setter
    protected String chargeExternalReference;

    // Charge group

    @Getter @Setter
    protected String chargeGroupReference;

    @Getter @Setter
    protected String chargeGroupName;

    //Tax

    @Getter @Setter
    protected String taxReference;

    @Getter @Setter
    protected String taxName;

    @Getter @Setter
    protected String taxDescription;

    @Getter @Setter
    protected String taxExternalReference;

    // Description

    @Getter @Setter
    protected String description;

    // Amounts

    @Getter @Setter
    @XmlElement(required = true, defaultValue = "0.00")
    protected BigDecimal netAmount;

    @Getter @Setter
    @XmlElement(required = true, defaultValue = "0.00")
    protected BigDecimal grossAmount;

    @Getter @Setter
    @XmlElement(required = true, defaultValue = "0.00")
    protected BigDecimal vatAmount;

    // Dates

    @Getter @Setter
    private XMLGregorianCalendar startDate;

    @Getter @Setter
    private XMLGregorianCalendar endDate;

    @Getter @Setter
    private XMLGregorianCalendar effectiveStartDate;

    @Getter @Setter
    private XMLGregorianCalendar effectiveEndDate;

    // Other

    @Getter @Setter
    protected String agreementReference;

    @Getter @Setter
    protected String fixedAssetReference;

    @Getter @Setter
    protected String fixedAssetExternalReference;

    @Getter @Setter
    protected String occupancyBrand;

    @Getter @Setter
    protected boolean adjustment;
}
