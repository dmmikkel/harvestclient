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

@XmlRootElement(name = "day-entries")
@XmlAccessorType(XmlAccessType.NONE)
public class DayEntryCollection
        implements Iterable<DayEntry>
{
    @XmlElement(name = "day-entry")
    private List<DayEntry> list = new ArrayList<DayEntry>();

    public List<DayEntry> getList()
    {
        return list;
    }

    public void setList(List<DayEntry> list)
    {
        this.list = list;
    }

    public static DayEntryCollection fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(DayEntryCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (DayEntryCollection) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into DayEntryCollection.", e);
        }
    }

    @Override
    public Iterator<DayEntry> iterator()
    {
        return this.list.iterator();
    }
}
