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
@Table(name = "employee_managers")
public class EmployeeManagers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int relationshipId;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Employee manager;

	@Column(length = 30)
	private String relationshipType;

	public EmployeeManagers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeManagers(int relationshipId, Employee employee, Employee manager, String relationshipType) {
		super();
		this.relationshipId = relationshipId;
		this.employee = employee;
		this.manager = manager;
		this.relationshipType = relationshipType;
	}

	public int getRelationshipId() {
		return relationshipId;
	}

	public void setRelationshipId(int relationshipId) {
		this.relationshipId = relationshipId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	@Override
	public String toString() {
		return "EmployeeManagers [relationshipId=" + relationshipId + ", employee=" + employee + ", manager=" + manager
				+ ", relationshipType=" + relationshipType + "]";
	}
	
	


}
