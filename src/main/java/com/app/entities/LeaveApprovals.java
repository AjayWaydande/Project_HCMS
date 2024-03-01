package com.app.entities;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="leave_approvals")
public class LeaveApprovals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int approvalId;

	@ManyToOne
	@JoinColumn(name = "leaveRequest_id")
	private LeaveRequest leaveRequest;

	@ManyToOne
	@JoinColumn(name ="approver_id")
	private Employee approver;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate approvalDate;

	@Column(length = 30)
	private String status;

	@Column(length = 50)
	private String comments;
	
	public LeaveApprovals() {
		// TODO Auto-generated constructor stub
	}

	public LeaveApprovals(int approvalId, LeaveRequest leaveRequest, Employee approver, LocalDate approvalDate,
			String status, String comments) {
		super();
		this.approvalId = approvalId;
		this.leaveRequest = leaveRequest;
		this.approver = approver;
		this.approvalDate = approvalDate;
		this.status = status;
		this.comments = comments;
	}

	public int getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(int approvalId) {
		this.approvalId = approvalId;
	}

	public LeaveRequest getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequest leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public Employee getApprover() {
		return approver;
	}

	public void setApprover(Employee approver) {
		this.approver = approver;
	}

	public LocalDate getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(LocalDate approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "LeaveApprovals [approvalId=" + approvalId + ", leaveRequest=" + leaveRequest + ", approver=" + approver
				+ ", approvalDate=" + approvalDate + ", status=" + status + ", comments=" + comments + "]";
	}
	

}
