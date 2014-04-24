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

@XmlRootElement(name = "invoice-message")
@XmlAccessorType(XmlAccessType.NONE)
public class InvoiceMessageCollection
        implements Iterable<InvoiceMessage>
{
    @XmlElement(name = "invoice-message")
    private List<InvoiceMessage> list = new ArrayList<InvoiceMessage>();

    public List<InvoiceMessage> getList()
    {
        return list;
    }

    public void setList(List<InvoiceMessage> list)
    {
        this.list = list;
    }

    public static InvoiceMessageCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(InvoiceMessageCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (InvoiceMessageCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into InvoiceMessage.", e);
        }
    }

    @Override
    public Iterator<InvoiceMessage> iterator()
    {
        return this.list.iterator();
    }
}