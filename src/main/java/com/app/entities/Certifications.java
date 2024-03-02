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
@Table(name="certifications")
public class Certifications {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int certificationId;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@Column(length = 30)
	private String certificationName;

	@Column(length = 30)
	private String certificationAuthority;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate issueDate;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate expiryDate;

	public Certifications() {
		// TODO Auto-generated constructor stub
	}

	public Certifications(int certificationId, Employee employee, String certificationName,
			String certificationAuthority, LocalDate issueDate, LocalDate expiryDate) {
		super();
		this.certificationId = certificationId;
		this.employee = employee;
		this.certificationName = certificationName;
		this.certificationAuthority = certificationAuthority;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	public int getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationAuthority() {
		return certificationAuthority;
	}

	public void setCertificationAuthority(String certificationAuthority) {
		this.certificationAuthority = certificationAuthority;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Certifications [certificationId=" + certificationId + ", employee=" + employee + ", certificationName="
				+ certificationName + ", certificationAuthority=" + certificationAuthority + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
}
