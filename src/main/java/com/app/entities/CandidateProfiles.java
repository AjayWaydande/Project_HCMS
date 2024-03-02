package com.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="candidate_profiles")
public class CandidateProfiles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateId;

	@ManyToOne
	@JoinColumn(name ="employee_id")
	private Employee employee;

	public CandidateProfiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateProfiles(int candidateId, Employee employee) {
		super();
		this.candidateId = candidateId;
		this.employee = employee;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CandidateProfiles [candidateId=" + candidateId + ", employee=" + employee + "]";
	}

	
}
