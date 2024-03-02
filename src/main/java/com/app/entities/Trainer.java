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
@Table(name ="trainers")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainerId;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(length=20)
	private boolean isExternal;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerId, Employee employee, boolean isExternal) {
		super();
		this.trainerId = trainerId;
		this.employee = employee;
		this.isExternal = isExternal;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public boolean isExternal() {
		return isExternal;
	}
	public void setExternal(boolean isExternal) {
		this.isExternal = isExternal;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", employee=" + employee + ", isExternal=" + isExternal + "]";
	}
	
}
