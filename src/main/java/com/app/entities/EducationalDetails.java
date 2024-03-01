package com.app.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "educational_details")
public class EducationalDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int educationId;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@Column(length = 30)
	private String degree;

	@Column(length = 30)
    private String institute;

	@Column(length = 30)
	private String major;

	@Column(length = 30)
	private int graduationYear;

	@Column(length = 30)
	private BigDecimal gpa;
	
	public EducationalDetails() {
		// TODO Auto-generated constructor stub
	}

	public EducationalDetails(int educationId, Employee employee, String degree, String institute, String major,
			int graduationYear, BigDecimal gpa) {
		super();
		this.educationId = educationId;
		this.employee = employee;
		this.degree = degree;
		this.institute = institute;
		this.major = major;
		this.graduationYear = graduationYear;
		this.gpa = gpa;
	}

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public BigDecimal getGpa() {
		return gpa;
	}

	public void setGpa(BigDecimal gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "EducationalDetails [educationId=" + educationId + ", employee=" + employee + ", degree=" + degree
				+ ", institute=" + institute + ", major=" + major + ", graduationYear=" + graduationYear + ", gpa="
				+ gpa + "]";
	}
	

}
