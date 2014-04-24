package com.enonic.harvest.harvestclient.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.Date;

@XmlAccessorType(XmlAccessType.NONE)
public class UserAssignment
{
    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "user-id")
    private Integer userId;

    @XmlElement(name = "project-id")
    private Integer projectId;

    @XmlElement(name = "deactivated")
    private boolean deactivated;

    @XmlElement(name = "hourly-rate")
    private BigDecimal hourlyRate;

    @XmlElement(name = "is-project-manager")
    private boolean isProjectManager;

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

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public Integer getProjectId()
    {
        return projectId;
    }

    public void setProjectId(Integer projectId)
    {
        this.projectId = projectId;
    }

    public boolean isDeactivated()
    {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated)
    {
        this.deactivated = deactivated;
    }

    public BigDecimal getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public boolean isProjectManager()
    {
        return isProjectManager;
    }

    public void setProjectManager(boolean isProjectManager)
    {
        this.isProjectManager = isProjectManager;
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
}