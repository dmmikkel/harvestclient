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

@XmlRootElement(name = "project")
@XmlAccessorType(XmlAccessType.NONE)
public class Project
{

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "client-id")
    private Integer clientId;

    @XmlElement(name = "code")
    private String code;

    @XmlElement(name = "active")
    private boolean active;

    @XmlElement(name = "notes")
    private String notes;

    @XmlElement(name = "billable")
    private boolean billable;

    @XmlElement(name = "bill-by")
    private String billBy;

    @XmlElement(name = "hourly-rate")
    private BigDecimal hourlyRate;

    @XmlElement(name = "budget-by")
    private String budgetBy;

    @XmlElement(name = "budget")
    private BigDecimal budget;

    @XmlElement(name = "updated-at")
    private Date updatedAt;

    @XmlElement(name = "created-at")
    private Date createdAt;

    @XmlElement(name = "cost-budget")
    private BigDecimal costBudget;

    @XmlElement(name = "cost-budget-include-expenses")
    private boolean costBudgetIncludeExpenses;

    @XmlElement(name = "notify-when-over-budget")
    private boolean notifyWhenOverBudget;

    @XmlElement(name = "over-budget-notification-percentage")
    private BigDecimal overBudgetNotificationPercentage;

    @XmlElement(name = "over-budget-notified-at")
    private Date overBudgetNotifiedAt;

    @XmlElement(name = "show-budget-to-all")
    private boolean showBudgetToAll;

    @XmlElement(name = "hint-earliest-record-at")
    private Date hintEarliestRecordAt;

    @XmlElement(name = "hint-latest-record-at")
    private Date hintLatestRecordAt;

    private UserAssignmentCollection userAssignments;
    private TaskAssignmentCollection taskAssignments;

    public String getName()
    {
        return name;
    }

    public UserAssignment getUserAssignmentByUser(int userId)
    {
        for (UserAssignment userAssignment : this.userAssignments)
        {
            if (userAssignment.getUserId() == userId)
                return userAssignment;
        }
        return null;
    }

    public TaskAssignment getTaskAssignmentByTask(int taskId)
    {
        for (TaskAssignment taskAssignment : this.taskAssignments)
        {
            if (taskAssignment.getTaskId() == taskId)
                return taskAssignment;
        }
        return null;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getClientId()
    {
        return clientId;
    }

    public void setClientId(Integer clientId)
    {
        this.clientId = clientId;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public boolean isBillable()
    {
        return billable;
    }

    public void setBillable(boolean billable)
    {
        this.billable = billable;
    }

    public String getBillBy()
    {
        return billBy;
    }

    public void setBillBy(String billBy)
    {
        this.billBy = billBy;
    }

    public BigDecimal getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public String getBudgetBy()
    {
        return budgetBy;
    }

    public void setBudgetBy(String budgetBy)
    {
        this.budgetBy = budgetBy;
    }

    public BigDecimal getBudget()
    {
        return budget;
    }

    public void setBudget(BigDecimal budget)
    {
        this.budget = budget;
    }

    public UserAssignmentCollection getUserAssignments()
    {
        return userAssignments;
    }

    public void setUserAssignments(UserAssignmentCollection userAssignments)
    {
        this.userAssignments = userAssignments;
    }

    public TaskAssignmentCollection getTaskAssignments()
    {
        return taskAssignments;
    }

    public void setTaskAssignments(TaskAssignmentCollection taskAssignments)
    {
        this.taskAssignments = taskAssignments;
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

    public BigDecimal getCostBudget()
    {
        return costBudget;
    }

    public void setCostBudget(BigDecimal costBudget)
    {
        this.costBudget = costBudget;
    }

    public boolean getCostBudgetIncludeExpenses()
    {
        return costBudgetIncludeExpenses;
    }

    public void setCostBudgetIncludeExpenses(boolean costBudgetIncludeExpenses)
    {
        this.costBudgetIncludeExpenses = costBudgetIncludeExpenses;
    }

    public boolean getNotifyWhenOverBudget()
    {
        return notifyWhenOverBudget;
    }

    public void setNotifyWhenOverBudget(boolean notifyWhenOverBudget)
    {
        this.notifyWhenOverBudget = notifyWhenOverBudget;
    }

    public BigDecimal getOverBudgetNotificationPercentage()
    {
        return overBudgetNotificationPercentage;
    }

    public void setOverBudgetNotificationPercentage(BigDecimal overBudgetNotificationPercentage)
    {
        this.overBudgetNotificationPercentage = overBudgetNotificationPercentage;
    }

    public Date getOverBudgetNotifiedAt()
    {
        return overBudgetNotifiedAt;
    }

    public void setOverBudgetNotifiedAt(Date overBudgetNotifiedAt)
    {
        this.overBudgetNotifiedAt = overBudgetNotifiedAt;
    }

    public boolean getShowBudgetToAll()
    {
        return showBudgetToAll;
    }

    public void setShowBudgetToAll(boolean showBudgetToAll)
    {
        this.showBudgetToAll = showBudgetToAll;
    }

    public Date getHintEarliestRecordAt()
    {
        return hintEarliestRecordAt;
    }

    public void setHintEarliestRecordAt(Date hintEarliestRecordAt)
    {
        this.hintEarliestRecordAt = hintEarliestRecordAt;
    }

    public Date getHintLatestRecordAt()
    {
        return hintLatestRecordAt;
    }

    public void setHintLatestRecordAt(Date hintLatestRecordAt)
    {
        this.hintLatestRecordAt = hintLatestRecordAt;
    }

    public static Project fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(Project.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Project) unmarshaller.unmarshal(xml);
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Unable to parse XML into Project.", e);
        }

    }
}
