package com.example.Lab4.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String fullName;
	private Date dob;
	private String status;
	private String mobileNo;
	private String email;
	private Date effectiveDate;
	
	private String crudValue;
    private String userId;
    private String wsId;
    private String programId;

    @CreationTimestamp
    private LocalDateTime hostTimestamp;

    @UpdateTimestamp
    private LocalDateTime localTimestamp;

    private LocalDateTime acceptTimestamp;
    private LocalDateTime acceptTimestampUtcOffset;
    private String uuid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private CustomerIdentification customerId;
	
	public CustomerIdentification getCustomerId() {
		return customerId;
	}
	public void setCustomerId(CustomerIdentification customerId) {
		this.customerId=customerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getCrudValue() {
		return crudValue;
	}
	public void setCrudValue(String crudValue) {
		this.crudValue = crudValue;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getWsId() {
		return wsId;
	}
	public void setWsId(String wsId) {
		this.wsId = wsId;
	}
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public LocalDateTime getAcceptTimestamp() {
		return acceptTimestamp;
	}
	public void setAcceptTimestamp(LocalDateTime acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
	}
	public LocalDateTime getAcceptTimestampUtcOffset() {
		return acceptTimestampUtcOffset;
	}
	public void setAcceptTimestampUtcOffset(LocalDateTime acceptTimestampUtcOffset) {
		this.acceptTimestampUtcOffset = acceptTimestampUtcOffset;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
