package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="vacancies")
public class Vacancies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vacancyId;

	@ManyToOne
	@JoinColumn(name ="department_id")
	private Department department;

	@Column(length = 20)
	private String position;

	@Column(length = 50)
	private String requiredSkillSet;

	@Column(length = 30)
	private int numberOfOpenings;

	public Vacancies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vacancies(int vacancyId, Department department, String position, String requiredSkillSet,
			int numberOfOpenings) {
		super();
		this.vacancyId = vacancyId;
		this.department = department;
		this.position = position;
		this.requiredSkillSet = requiredSkillSet;
		this.numberOfOpenings = numberOfOpenings;
	}

	public int getVacancyId() {
		return vacancyId;
	}

	public void setVacancyId(int vacancyId) {
		this.vacancyId = vacancyId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRequiredSkillSet() {
		return requiredSkillSet;
	}

	public void setRequiredSkillSet(String requiredSkillSet) {
		this.requiredSkillSet = requiredSkillSet;
	}

	public int getNumberOfOpenings() {
		return numberOfOpenings;
	}

	public void setNumberOfOpenings(int numberOfOpenings) {
		this.numberOfOpenings = numberOfOpenings;
	}

	@Override
	public String toString() {
		return "Vacancies [vacancyId=" + vacancyId + ", department=" + department + ", position=" + position
				+ ", requiredSkillSet=" + requiredSkillSet + ", numberOfOpenings=" + numberOfOpenings + "]";
	}
	
	
}
