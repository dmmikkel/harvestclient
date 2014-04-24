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

@XmlRootElement(name = "payments")
@XmlAccessorType(XmlAccessType.NONE)
public class InvoicePaymentCollection
        implements Iterable<InvoicePayment>
{
    @XmlElement(name = "payment")
    private List<InvoicePayment> list = new ArrayList<InvoicePayment>();

    public List<InvoicePayment> getList()
    {
        return list;
    }

    public void setList(List<InvoicePayment> list)
    {
        this.list = list;
    }

    public static InvoicePaymentCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(InvoicePaymentCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (InvoicePaymentCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into InvoicePaymentCollection.", e);
        }
    }

    @Override
    public Iterator<InvoicePayment> iterator()
    {
        return this.list.iterator();
    }
}
