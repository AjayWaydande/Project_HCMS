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
@Table(name = "skill_matrix")
public class SkillMatrix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matrixId;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@Column(length = 20)
	private String skillName;

	@Column(length = 20)
	private int skillLevel;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lastUpdated;

	public SkillMatrix() {
		// TODO Auto-generated constructor stub
	}

	public SkillMatrix(int matrixId, Employee employee, String skillName, int skillLevel, LocalDate lastUpdated) {
		super();
		this.matrixId = matrixId;
		this.employee = employee;
		this.skillName = skillName;
		this.skillLevel = skillLevel;
		this.lastUpdated = lastUpdated;
	}

	public int getMatrixId() {
		return matrixId;
	}

	public void setMatrixId(int matrixId) {
		this.matrixId = matrixId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "SkillMatrix [matrixId=" + matrixId + ", employee=" + employee + ", skillName=" + skillName
				+ ", skillLevel=" + skillLevel + ", lastUpdated=" + lastUpdated + "]";
	}
	
}