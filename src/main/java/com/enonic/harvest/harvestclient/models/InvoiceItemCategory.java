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

@XmlRootElement(name = "invoice-item-category")
@XmlAccessorType(XmlAccessType.NONE)
public class InvoiceItemCategory
{
    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "use-as-expense")
    private boolean useAsExpense;

    @XmlElement(name = "use-as-service")
    private boolean useAsService;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "created-at")
    private Date createdAt;

    public static InvoiceItemCategory fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(InvoiceItemCategory.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (InvoiceItemCategory) unmarshaller.unmarshal(xml);
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isUseAsExpense()
    {
        return useAsExpense;
    }

    public void setUseAsExpense(boolean useAsExpense)
    {
        this.useAsExpense = useAsExpense;
    }

    public boolean isUseAsService()
    {
        return useAsService;
    }

    public void setUseAsService(boolean useAsService)
    {
        this.useAsService = useAsService;
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
