package com.example.Lab4.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class CustomerIdentification {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private Long customerId;
	private String custIdType;
	private String custIdItem;
	private LocalDateTime custIdEffectiveDate;
	
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustIdType() {
		return custIdType;
	}
	public void setCustIdType(String custIdType) {
		this.custIdType = custIdType;
	}
	public String getCustIdItem() {
		return custIdItem;
	}
	public void setCustIdItem(String custIdItem) {
		this.custIdItem = custIdItem;
	}
	public LocalDateTime getCustIdEffectiveDate() {
		return custIdEffectiveDate;
	}
	public void setCustIdEffectiveDate(LocalDateTime custIdEffectiveDate) {
		this.custIdEffectiveDate = custIdEffectiveDate;
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
