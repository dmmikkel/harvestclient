package com.enonic.harvest.harvestclient.models;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlRootElement(name = "invoice-item-categories")
@XmlAccessorType(XmlAccessType.NONE)
public class InvoiceItemCategoryCollection
        implements Iterable<InvoiceItemCategory>
{
    @XmlElement(name = "invoice-item-category")
    private List<InvoiceItemCategory> list = new ArrayList<InvoiceItemCategory>();

    public List<InvoiceItemCategory> getList()
    {
        return list;
    }

    public void setList(List<InvoiceItemCategory> list)
    {
        this.list = list;
    }

    public static InvoiceItemCategoryCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(InvoiceItemCategoryCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (InvoiceItemCategoryCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into InvoiceItemCategory.", e);
        }
    }

    @Override
    public Iterator<InvoiceItemCategory> iterator()
    {
        return this.list.iterator();
    }
}
