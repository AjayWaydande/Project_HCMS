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
@Table(name="appraisal_forms")
public class Appraisalforms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int formId;
	
	@ManyToOne
	@JoinColumn(name ="employee_id")
	private Employee employee;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate submissionDate;
	
	@Column(length = 20)
	private int rating;
	
	@Column(length = 50)
	private String comments;
	
	@ManyToOne
	@JoinColumn(name="reviewer_id")
    private Employee reviewer;

	public Appraisalforms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appraisalforms(int formId, Employee employee, LocalDate submissionDate, int rating, String comments,
			Employee reviewer) {
		super();
		this.formId = formId;
		this.employee = employee;
		this.submissionDate = submissionDate;
		this.rating = rating;
		this.comments = comments;
		this.reviewer = reviewer;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LocalDate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Employee getReviewer() {
		return reviewer;
	}

	public void setReviewer(Employee reviewer) {
		this.reviewer = reviewer;
	}

	@Override
	public String toString() {
		return "Appraisalforms [formId=" + formId + ", employee=" + employee + ", submissionDate=" + submissionDate
				+ ", rating=" + rating + ", comments=" + comments + ", reviewer=" + reviewer + "]";
	}
	
	
}

	