package com.enonic.harvest.harvestclient.models;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

@XmlRootElement(name = "tasks")
@XmlAccessorType(XmlAccessType.NONE)
public class TaskCollection
        implements Iterable<Task>
{
    @XmlElement(name = "task")
    private List<Task> list;

    public List<Task> getList()
    {
        return list;
    }

    public void setList(List<Task> list)
    {
        this.list = list;
    }

    public static TaskCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(TaskCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (TaskCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into TaskCollection.", e);
        }
    }

    @Override
    public Iterator<Task> iterator()
    {
        return this.list.iterator();
    }
}
