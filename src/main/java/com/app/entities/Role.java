package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	
	@Column(length = 30)
	private String roleName;
	

	@Column(length = 300)
	private String description;
}
