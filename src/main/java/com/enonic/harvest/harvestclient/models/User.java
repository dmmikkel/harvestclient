package com.enonic.harvest.harvestclient.models;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.NONE)
public class User
{

    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "first-name")
    private String firstName;

    @XmlElement(name = "last-name")
    private String lastName;

    @XmlElement(name = "has-access-to-all-future-projects")
    private boolean hasAccessToAllFutureProjects;

    @XmlElement(name = "default-hourly-rate")
    private BigDecimal defaultHourlyRate;

    @XmlElement(name = "is-active")
    private boolean isActive;

    @XmlElement(name = "is-admin")
    private boolean isAdmin;

    @XmlElement(name = "is-contractor")
    private boolean isContractor;

    @XmlElement(name = "telephone")
    private String telephone;

    @XmlElement(name = "department")
    private String department;

    @XmlElement(name = "timezone")
    private String timezone;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "created-at")
    private Date createdAt;


    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public boolean hasAccessToAllFutureProjects()
    {
        return hasAccessToAllFutureProjects;
    }

    public void setAccessToAllFutureProjects(boolean hasAccessToAllFutureProjects)
    {
        this.hasAccessToAllFutureProjects = hasAccessToAllFutureProjects;
    }

    public BigDecimal getDefaultHourlyRate()
    {
        return defaultHourlyRate;
    }

    public void setDefaultHourlyRate(BigDecimal defaultHourlyRate)
    {
        this.defaultHourlyRate = defaultHourlyRate;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    public boolean isAdmin()
    {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin)
    {
        this.isAdmin = isAdmin;
    }

    public boolean isContractor()
    {
        return isContractor;
    }

    public void setContractor(boolean isContractor)
    {
        this.isContractor = isContractor;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public static User fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (User) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into User.", e);
        }

    }
}
