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
@Table(name = "skill_upgradation")
public class SkillUpgradation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int upgradationId;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@Column(length = 30)
	private String skillName;

	@Column(length = 30)
	private int previousSkillLevel;

	@Column(length = 30)
	private int newSkillLevel;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate upgradationDate;

	@ManyToOne
	@JoinColumn(name = "upgraded_by")
	private Employee upgradedBy;

	public SkillUpgradation() {
		// TODO Auto-generated constructor stub
	}

	public SkillUpgradation(int upgradationId, Employee employee, String skillName, int previousSkillLevel,
			int newSkillLevel, LocalDate upgradationDate, Employee upgradedBy) {
		super();
		this.upgradationId = upgradationId;
		this.employee = employee;
		this.skillName = skillName;
		this.previousSkillLevel = previousSkillLevel;
		this.newSkillLevel = newSkillLevel;
		this.upgradationDate = upgradationDate;
		this.upgradedBy = upgradedBy;
	}

	public int getUpgradationId() {
		return upgradationId;
	}

	public void setUpgradationId(int upgradationId) {
		this.upgradationId = upgradationId;
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

	public int getPreviousSkillLevel() {
		return previousSkillLevel;
	}

	public void setPreviousSkillLevel(int previousSkillLevel) {
		this.previousSkillLevel = previousSkillLevel;
	}

	public int getNewSkillLevel() {
		return newSkillLevel;
	}

	public void setNewSkillLevel(int newSkillLevel) {
		this.newSkillLevel = newSkillLevel;
	}

	public LocalDate getUpgradationDate() {
		return upgradationDate;
	}

	public void setUpgradationDate(LocalDate upgradationDate) {
		this.upgradationDate = upgradationDate;
	}

	public Employee getUpgradedBy() {
		return upgradedBy;
	}

	public void setUpgradedBy(Employee upgradedBy) {
		this.upgradedBy = upgradedBy;
	}

	@Override
	public String toString() {
		return "SkillUpgradation [upgradationId=" + upgradationId + ", employee=" + employee + ", skillName="
				+ skillName + ", previousSkillLevel=" + previousSkillLevel + ", newSkillLevel=" + newSkillLevel
				+ ", upgradationDate=" + upgradationDate + ", upgradedBy=" + upgradedBy + "]";
	}
	
	
}
