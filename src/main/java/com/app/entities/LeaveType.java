package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave_type")
public class LeaveType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
	
	@Column(length =30)
    private String leaveTypeName;
	
	@Column(length = 100)
	private String description;

	public LeaveType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveType(int leaveId, String leaveTypeName, String description) {
		super();
		this.leaveId = leaveId;
		this.leaveTypeName = leaveTypeName;
		this.description = description;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
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
		return "LeaveType [leaveId=" + leaveId + ", leaveTypeName=" + leaveTypeName + ", description=" + description
				+ "]";
	}
	

}
