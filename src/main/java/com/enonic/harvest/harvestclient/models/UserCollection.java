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

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.NONE)
public class UserCollection
        implements Iterable<User>
{
    @XmlElement(name = "user")
    private List<User> list = new ArrayList<User>();

    public List<User> getList()
    {
        return list;
    }

    public void setList(List<User> list)
    {
        this.list = list;
    }

    public static UserCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(UserCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (UserCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into UserCollection.", e);
        }

    }

    @Override
    public Iterator<User> iterator()
    {
        return this.list.iterator();
    }
}
