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

@XmlRootElement(name = "task")
@XmlAccessorType(XmlAccessType.NONE)
public class Task
{
    @XmlElement(name = "billable-by-default")
    private boolean billableByDefault;

    @XmlElement(name = "deactivated")
    private boolean deactivated;

    @XmlElement(name = "default-hourly-rate")
    private BigDecimal defaultHourlyRate;

    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "is-default")
    private boolean isDefault;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "created-at")
    private Date createdAt;

    public boolean isBillableByDefault()
    {
        return billableByDefault;
    }

    public void setBillableByDefault(boolean billableByDefault)
    {
        this.billableByDefault = billableByDefault;
    }

    public boolean isDeactivated()
    {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated)
    {
        this.deactivated = deactivated;
    }

    public BigDecimal getDefaultHourlyRate()
    {
        return defaultHourlyRate;
    }

    public void setDefaultHourlyRate(BigDecimal defaultHourlyRate)
    {
        this.defaultHourlyRate = defaultHourlyRate;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public void setDefault(boolean isDefault)
    {
        this.isDefault = isDefault;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    public static Task fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(Task.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Task) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into Task.", e);
        }

    }
}