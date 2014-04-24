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

@XmlRootElement(name = "task-assignments")
@XmlAccessorType(XmlAccessType.NONE)
public class TaskAssignmentCollection
        implements Iterable<TaskAssignment>
{
    @XmlElement(name = "task-assignment")
    private List<TaskAssignment> list = new ArrayList<TaskAssignment>();

    public List<TaskAssignment> getList()
    {
        return list;
    }

    public void setList(List<TaskAssignment> list)
    {
        this.list = list;
    }

    public static TaskAssignmentCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(TaskAssignmentCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (TaskAssignmentCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into TaskAssignmentCollection.", e);
        }
    }

    @Override
    public Iterator<TaskAssignment> iterator()
    {
        return this.list.iterator();
    }
}
