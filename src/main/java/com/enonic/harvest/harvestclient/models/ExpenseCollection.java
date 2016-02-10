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

@XmlRootElement(name = "expenses")
@XmlAccessorType(XmlAccessType.NONE)
public class ExpenseCollection
        implements Iterable<Expense> {

    @XmlElement(name = "expense")
    private List<Expense> list = new ArrayList<>();

    public static ExpenseCollection fromInputStream(final InputStream xml)
            throws HarvestClientException {
        try {
            JAXBContext context = JAXBContext.newInstance(ExpenseCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (ExpenseCollection) unmarshaller.unmarshal(xml);
        } catch (Exception e) {
            throw new HarvestClientException("Unable to parse XML into ExpenseCollection.", e);
        }
    }

    @Override
    public Iterator<Expense> iterator() {
        return this.list.iterator();
    }


    // ------- Getters & Setters -------

    public List<Expense> getList() {
        return list;
    }

    public void setList(List<Expense> list) {
        this.list = list;
    }

}
