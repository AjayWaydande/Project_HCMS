package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="department")
public class Department {

	
	@Column(length = 30)
	private int departmentId;
	@Column(length = 30)
	private String departmentName;
	
	@Column(length = 300)
	private String description;

}
