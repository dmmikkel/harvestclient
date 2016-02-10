package com.enonic.harvest.harvestclient.models;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;
import org.joda.time.DateTime;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement(name = "expense")
@XmlAccessorType(XmlAccessType.NONE)
public class Expense {

    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "total-cost")
    private BigDecimal totalCost;

    @XmlElement(name = "units")
    private BigDecimal units;

    @XmlElement(name = "created-at")
    private DateTime createdAt;

    @XmlElement(name = "updated-at")
    private DateTime updatedAt;

    @XmlElement(name = "project-id")
    private Integer projectId;

    @XmlElement(name = "expense-category")
    private Integer expenseCategoryId;

    @XmlElement(name = "user-id")
    private Integer userId;

    @XmlElement(name = "spent-at")
    private Date spentAt;

    @XmlElement(name = "is-closed")
    private boolean isClosed;

    @XmlElement(name = "notes")
    private String notes;

    @XmlElement(name = "invoice-id")
    private Integer invoiceId;

    @XmlElement(name = "billable")
    private boolean billable;

    @XmlElement(name = "company-id")
    private Integer companyId;

    @XmlElement(name = "has-receipt")
    private boolean hasReceipt;

    @XmlElement(name = "receipt-url")
    private String receiptUrl;

    @XmlElement(name = "is-locked")
    private boolean isLocked;

    @XmlElement(name = "locked-reason")
    private String lockedReason;


    public static Expense fromInputStream(final InputStream xml)
            throws HarvestClientException
    {
        try {

            JAXBContext context = JAXBContext.newInstance(Expense.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Expense) unmarshaller.unmarshal(xml);

        } catch (Exception e) {
            throw new HarvestClientException("Unable to parse XML into Expense.", e);
        }

    }

    // ------- Getters & Setters -------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getUnits() {
        return units;
    }

    public void setUnits(BigDecimal units) {
        this.units = units;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getExpenseCategoryId() {
        return expenseCategoryId;
    }

    public void setExpenseCategoryId(Integer expenseCategoryId) {
        this.expenseCategoryId = expenseCategoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSpentAt() {
        return spentAt;
    }

    public void setSpentAt(Date spentAt) {
        this.spentAt = spentAt;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public boolean isHasReceipt() {
        return hasReceipt;
    }

    public void setHasReceipt(boolean hasReceipt) {
        this.hasReceipt = hasReceipt;
    }

    public String getReceiptUrl() {
        return receiptUrl;
    }

    public void setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getLockedReason() {
        return lockedReason;
    }

    public void setLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
    }
}
