package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave_request")
public class LeaveRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveTypeId;

	@Column(length = 30)
	private String leaveTypeName;

	@Column(length = 100)
	private String description;

	public LeaveRequest() {
		// TODO Auto-generated constructor stub
	}

	public LeaveRequest(int leaveTypeId, String leaveTypeName, String description) {
		super();
		this.leaveTypeId = leaveTypeId;
		this.leaveTypeName = leaveTypeName;
		this.description = description;
	}

	public int getLeaveTypeId() {
		return leaveTypeId;
	}

	public void setLeaveTypeId(int leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	public String getLeaveTypeName() {
		return leaveTypeName;
	}

	public void setLeaveTypeName(String leaveTypeName) {
		this.leaveTypeName = leaveTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LeaveRequest [leaveTypeId=" + leaveTypeId + ", leaveTypeName=" + leaveTypeName + ", description="
				+ description + "]";
	}
	


}
