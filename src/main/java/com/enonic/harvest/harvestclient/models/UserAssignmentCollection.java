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

@XmlRootElement(name = "user-assignments")
@XmlAccessorType(XmlAccessType.NONE)
public class UserAssignmentCollection
        implements Iterable<UserAssignment>
{
    @XmlElement(name = "user-assignment")
    private List<UserAssignment> list = new ArrayList<UserAssignment>();

    public List<UserAssignment> getList()
    {
        return list;
    }

    public void setList(List<UserAssignment> list)
    {
        this.list = list;
    }

    public static UserAssignmentCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(UserAssignmentCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (UserAssignmentCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into UserAssignmentCollection.", e);
        }
    }

    @Override
    public Iterator<UserAssignment> iterator()
    {
        return this.list.iterator();
    }
}
