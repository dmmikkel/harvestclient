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

@XmlRootElement(name = "projects")
@XmlAccessorType(XmlAccessType.NONE)
public class ProjectCollection
        implements Iterable<Project>
{
    @XmlElement(name = "project")
    private List<Project> list = new ArrayList<Project>();

    public List<Project> getList()
    {
        return list;
    }

    public void setList(List<Project> list)
    {
        this.list = list;
    }

    public static ProjectCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(ProjectCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (ProjectCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into ProjectCollection.", e);
        }
    }

    @Override
    public Iterator<Project> iterator()
    {
        return this.list.iterator();
    }
}
