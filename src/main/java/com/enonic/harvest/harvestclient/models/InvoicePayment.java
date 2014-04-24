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

@XmlRootElement(name = "payment")
@XmlAccessorType(XmlAccessType.NONE)
public class InvoicePayment
{
    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "amount")
    private BigDecimal amount;

    @XmlElement(name = "invoice-id")
    private Integer invoiceId;

    @XmlElement(name = "notes")
    private String notes;

    @XmlElement(name = "paid-at")
    private Date paidAt;

    @XmlElement(name = "recorded-by")
    private String recordedBy;

    @XmlElement(name = "recorded-by-email")
    private String recordedByEmail;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "created-at")
    private Date createdAt;

    public static InvoicePayment fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(InvoicePayment.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (InvoicePayment) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into InvoicePayment.", e);
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

    public Integer getInvoiceId()
    {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId)
    {
        this.invoiceId = invoiceId;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public Date getPaidAt()
    {
        return paidAt;
    }

    public void setPaidAt(Date paidAt)
    {
        this.paidAt = paidAt;
    }

    public String getRecordedBy()
    {
        return recordedBy;
    }

    public void setRecordedBy(String recordedBy)
    {
        this.recordedBy = recordedBy;
    }

    public String getRecordedByEmail()
    {
        return recordedByEmail;
    }

    public void setRecordedByEmail(String recordedByEmail)
    {
        this.recordedByEmail = recordedByEmail;
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
