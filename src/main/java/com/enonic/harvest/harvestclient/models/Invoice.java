package com.enonic.harvest.harvestclient.models;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement(name = "invoice")
@XmlAccessorType(XmlAccessType.NONE)
public class Invoice
{
    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "amount")
    private BigDecimal amount;

    @XmlElement(name = "due-amount")
    private BigDecimal dueAmount;

    @XmlElement(name = "due-at")
    private Date dueAt;

    @XmlElement(name = "due-at-human-format")
    private String dueAtHumanFormat;

    @XmlElement(name = "period-end")
    private Date periodEnd;

    @XmlElement(name = "period-start")
    private Date periodStart;

    @XmlElement(name = "client-id")
    private Integer clientId;

    @XmlElement(name = "subject")
    private Integer subject;

    @XmlElement(name = "currency")
    private String currency;

    @XmlElement(name = "issued-at")
    private Date issuedAt;

    @XmlElement(name = "created-by-id")
    private Integer createdById;

    @XmlElement(name = "notes")
    private String notes;

    @XmlElement(name = "number")
    private String number;

    @XmlElement(name = "purchase-order")
    private String purchaseOrder;

    @XmlElement(name = "client-key")
    private String clientKey;

    @XmlElement(name = "state")
    private String state;

    @XmlElement(name = "tax")
    private BigDecimal tax;

    @XmlElement(name = "tax2")
    private BigDecimal tax2;

    @XmlElement(name = "tax-amount")
    private BigDecimal taxAmount;

    @XmlElement(name = "tax-amount2")
    private BigDecimal taxAmount2;

    @XmlElement(name = "discount-amount")
    private BigDecimal discountAmount;

    @XmlElement(name = "discount")
    private BigDecimal discount;

    @XmlElement(name = "recurring-invoice-id")
    private Integer recurringInvoiceId;

    @XmlElement(name = "estimate-id")
    private Integer estimateId;

    @XmlElement(name = "retainer-id")
    private Integer retainerId;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "created-at")
    private Date createdAt;

    public static Invoice fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(Invoice.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Invoice) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into Invoice.", e);
        }

    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public BigDecimal getDueAmount()
    {
        return dueAmount;
    }

    public void setDueAmount(BigDecimal dueAmount)
    {
        this.dueAmount = dueAmount;
    }

    public Date getDueAt()
    {
        return dueAt;
    }

    public void setDueAt(Date dueAt)
    {
        this.dueAt = dueAt;
    }

    public String getDueAtHumanFormat()
    {
        return dueAtHumanFormat;
    }

    public void setDueAtHumanFormat(String dueAtHumanFormat)
    {
        this.dueAtHumanFormat = dueAtHumanFormat;
    }

    public Date getPeriodEnd()
    {
        return periodEnd;
    }

    public void setPeriodEnd(Date periodEnd)
    {
        this.periodEnd = periodEnd;
    }

    public Date getPeriodStart()
    {
        return periodStart;
    }

    public void setPeriodStart(Date periodStart)
    {
        this.periodStart = periodStart;
    }

    public Integer getClientId()
    {
        return clientId;
    }

    public void setClientId(Integer clientId)
    {
        this.clientId = clientId;
    }

    public Integer getSubject()
    {
        return subject;
    }

    public void setSubject(Integer subject)
    {
        this.subject = subject;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public Date getIssuedAt()
    {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt)
    {
        this.issuedAt = issuedAt;
    }

    public Integer getCreatedById()
    {
        return createdById;
    }

    public void setCreatedById(Integer createdById)
    {
        this.createdById = createdById;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getPurchaseOrder()
    {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder)
    {
        this.purchaseOrder = purchaseOrder;
    }

    public String getClientKey()
    {
        return clientKey;
    }

    public void setClientKey(String clientKey)
    {
        this.clientKey = clientKey;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public BigDecimal getTax()
    {
        return tax;
    }

    public void setTax(BigDecimal tax)
    {
        this.tax = tax;
    }

    public BigDecimal getTax2()
    {
        return tax2;
    }

    public void setTax2(BigDecimal tax2)
    {
        this.tax2 = tax2;
    }

    public BigDecimal getTaxAmount()
    {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxAmount2()
    {
        return taxAmount2;
    }

    public void setTaxAmount2(BigDecimal taxAmount2)
    {
        this.taxAmount2 = taxAmount2;
    }

    public BigDecimal getDiscountAmount()
    {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }

    public void setDiscount(BigDecimal discount)
    {
        this.discount = discount;
    }

    public Integer getRecurringInvoiceId()
    {
        return recurringInvoiceId;
    }

    public void setRecurringInvoiceId(Integer recurringInvoiceId)
    {
        this.recurringInvoiceId = recurringInvoiceId;
    }

    public Integer getEstimateId()
    {
        return estimateId;
    }

    public void setEstimateId(Integer estimateId)
    {
        this.estimateId = estimateId;
    }

    public Integer getRetainerId()
    {
        return retainerId;
    }

    public void setRetainerId(Integer retainerId)
    {
        this.retainerId = retainerId;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }
}
