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

@XmlRootElement(name = "clients")
@XmlAccessorType(XmlAccessType.NONE)
public class ClientCollection
        implements Iterable<Client>
{
    @XmlElement(name = "client")
    private List<Client> list = new ArrayList<Client>();

    public List<Client> getList()
    {
        return list;
    }

    public void setList(List<Client> list)
    {
        this.list = list;
    }

    public static ClientCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(ClientCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (ClientCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into ClientCollection.", e);
        }

    }

    @Override
    public Iterator<Client> iterator()
    {
        return this.list.iterator();
    }
}
