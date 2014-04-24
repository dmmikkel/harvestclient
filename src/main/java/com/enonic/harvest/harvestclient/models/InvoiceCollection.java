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

@XmlRootElement(name = "invoices")
@XmlAccessorType(XmlAccessType.NONE)
public class InvoiceCollection
        implements Iterable<Invoice>
{
    @XmlElement(name = "invoice")
    private List<Invoice> list = new ArrayList<Invoice>();

    public List<Invoice> getList()
    {
        return list;
    }

    public void setList(List<Invoice> list)
    {
        this.list = list;
    }

    public static InvoiceCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(InvoiceCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (InvoiceCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into InvoiceCollection.", e);
        }

    }

    @Override
    public Iterator<Invoice> iterator()
    {
        return this.list.iterator();
    }
}
