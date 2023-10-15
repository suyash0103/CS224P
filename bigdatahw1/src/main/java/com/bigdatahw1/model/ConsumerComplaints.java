package com.bigdatahw1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "ConsumerComplaints")
public class ConsumerComplaints {

    @Column(name = "ComplaintID")
    @Id
    private int complaintId;

    @Column(name = "DateReceived")
    private Date dateReceived;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "Issue")
    private String issue;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "StateName")
    private String stateName;

    @Column(name = "ZipCode")
    private String zipCode;

    @Column(name = "SubmittedVia")
    private String submittedVia;

    @Column(name = "DateSentToCompany")
    private Date dateSentToCompany;

    @Column(name = "CompanyResponse")
    private String companyResponse;

    @Column(name = "TimelyResponse")
    private String timelyResponse;

    @Column(name = "ConsumerDisputed")
    private String consumerDisputed;

    public ConsumerComplaints() {
    }

    public ConsumerComplaints(int complaintId, Date dateReceived, String productName, String issue, String companyName, String stateName, String zipCode, String submittedVia, Date dateSentToCompany, String companyResponse, String timelyResponse, String consumerDisputed) {
        this.complaintId = complaintId;
        this.dateReceived = dateReceived;
        this.productName = productName;
        this.issue = issue;
        this.companyName = companyName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        this.submittedVia = submittedVia;
        this.dateSentToCompany = dateSentToCompany;
        this.companyResponse = companyResponse;
        this.timelyResponse = timelyResponse;
        this.consumerDisputed = consumerDisputed;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSubmittedVia() {
        return submittedVia;
    }

    public void setSubmittedVia(String submittedVia) {
        this.submittedVia = submittedVia;
    }

    public Date getDateSentToCompany() {
        return dateSentToCompany;
    }

    public void setDateSentToCompany(Date dateSentToCompany) {
        this.dateSentToCompany = dateSentToCompany;
    }

    public String getCompanyResponse() {
        return companyResponse;
    }

    public void setCompanyResponse(String companyResponse) {
        this.companyResponse = companyResponse;
    }

    public String getTimelyResponse() {
        return timelyResponse;
    }

    public void setTimelyResponse(String timelyResponse) {
        this.timelyResponse = timelyResponse;
    }

    public String getConsumerDisputed() {
        return consumerDisputed;
    }

    public void setConsumerDisputed(String consumerDisputed) {
        this.consumerDisputed = consumerDisputed;
    }
}
