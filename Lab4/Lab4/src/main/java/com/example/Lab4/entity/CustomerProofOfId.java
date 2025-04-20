package com.example.Lab4.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class CustomerProofOfId {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CustomerIdentification customerId;
	
	private Integer cstPoiClsId;
	
	@NaturalId
	private String cstPoiValue;
	
	private Date cstPoiStartDate;
	private Date cstPoiEndDate;
	private LocalDateTime cstPoiEffectiveDate;
	
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
	
	public CustomerIdentification getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerIdentification customerId) {
		this.customerId = customerId;
	}

	public Integer getCstPoiClsId() {
		return cstPoiClsId;
	}

	public void setCstPoiClsId(Integer cstPoiClsId) {
		this.cstPoiClsId = cstPoiClsId;
	}

	public String getCstPoiValue() {
		return cstPoiValue;
	}

	public void setCstPoiValue(String cstPoiValue) {
		this.cstPoiValue = cstPoiValue;
	}

	public Date getCstPoiStartDate() {
		return cstPoiStartDate;
	}

	public void setCstPoiStartDate(Date cstPoiStartDate) {
		this.cstPoiStartDate = cstPoiStartDate;
	}
	public Date getCstPoiEndDate() {
		return cstPoiEndDate;
	}

	public void setCstPoiEndDate(Date cstPoiEndDate) {
		this.cstPoiEndDate = cstPoiEndDate;
	}

	public LocalDateTime getCstPoiEffectiveDate() {
		return cstPoiEffectiveDate;
	}

	public void setCstPoiEffectiveDate(LocalDateTime cstPoiEffectiveDate) {
		this.cstPoiEffectiveDate = cstPoiEffectiveDate;
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
