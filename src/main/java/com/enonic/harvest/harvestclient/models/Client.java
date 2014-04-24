package com.enonic.harvest.harvestclient.models;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.util.Date;

@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.NONE)
public class Client
{

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "created-at")
    private Date createdAt;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "highrise-id")
    private Integer highriseId;

    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "cache-version")
    private Integer cacheVersion;

    @XmlElement(name = "currency")
    private String currency;

    @XmlElement(name = "active")
    private boolean active;

    @XmlElement(name = "currency-symbol")
    private String currencySymbol;

    @XmlElement(name = "details")
    private String details;

    @XmlElement(name = "default-invoice-timeframe")
    private String defaultInvoiceTimeframe;

    @XmlElement(name = "last-invoice-kind")
    private String lastInvoiceKind;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Integer getHighriseId()
    {
        return highriseId;
    }

    public void setHighriseId(Integer highriseId)
    {
        this.highriseId = highriseId;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getCacheVersion()
    {
        return cacheVersion;
    }

    public void setCacheVersion(Integer cacheVersion)
    {
        this.cacheVersion = cacheVersion;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public String getCurrencySymbol()
    {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol)
    {
        this.currencySymbol = currencySymbol;
    }

    public String getDetails()
    {
        return details;
    }

    public void setDetails(String details)
    {
        this.details = details;
    }

    public String getDefaultInvoiceTimeframe()
    {
        return defaultInvoiceTimeframe;
    }

    public void setDefaultInvoiceTimeframe(String defaultInvoiceTimeframe)
    {
        this.defaultInvoiceTimeframe = defaultInvoiceTimeframe;
    }

    public String getLastInvoiceKind()
    {
        return lastInvoiceKind;
    }

    public void setLastInvoiceKind(String lastInvoiceKind)
    {
        this.lastInvoiceKind = lastInvoiceKind;
    }

    public static Client fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(Client.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Client) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into Client.", e);
        }

    }
}
