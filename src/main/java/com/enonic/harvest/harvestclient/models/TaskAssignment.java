package com.enonic.harvest.harvestclient.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.Date;

@XmlAccessorType(XmlAccessType.NONE)
public class TaskAssignment
{
    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "project-id")
    private Integer projectId;

    @XmlElement(name = "task-id")
    private Integer taskId;

    @XmlElement(name = "billable")
    private boolean billable;

    @XmlElement(name = "deactivated")
    private boolean deactivated;

    @XmlElement(name = "budget")
    private BigDecimal budget;

    @XmlElement(name = "hourlyRate")
    private BigDecimal hourlyRate;

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

    public Integer getProjectId()
    {
        return projectId;
    }

    public void setProjectId(Integer projectId)
    {
        this.projectId = projectId;
    }

    public Integer getTaskId()
    {
        return taskId;
    }

    public void setTaskId(Integer taskId)
    {
        this.taskId = taskId;
    }

    public boolean isBillable()
    {
        return billable;
    }

    public void setBillable(boolean billable)
    {
        this.billable = billable;
    }

    public boolean isDeactivated()
    {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated)
    {
        this.deactivated = deactivated;
    }

    public BigDecimal getBudget()
    {
        return budget;
    }

    public void setBudget(BigDecimal budget)
    {
        this.budget = budget;
    }

    public BigDecimal getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate)
    {
        this.hourlyRate = hourlyRate;
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