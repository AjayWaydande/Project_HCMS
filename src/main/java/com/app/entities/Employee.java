package com.app.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
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
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	
	@Column(length = 30)
	private String firstName;
	
	@Column(length = 30)
    private String lastName;
	
	@Column(length = 30)
	private String gender;
	
	@Column(length = 50)
	private LocalDate dateOfBirth;
	
	@Column(length = 50,unique = true)
	private String email;
	
	@Column(length = 30)
	private String mobileNumber;
	
	@Column(length = 200)
	private String address;
	@Column(length = 50 ,unique = true)
	private int nationalId;
	
	@Column(length = 20)
	private String maritalStatus;
	
	@Column(length = 30)
	private String emergencyContactNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Department departmentId;
	
	@Column(length = 30)
	private String postion;

	@Column(length = 100)
	private String skillset;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate employmentStartDate;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate employmentEndDate;
	
	@Column(length = 30)
	private double salary;
	
	@Column(length = 30)
	private String employmentStatus;
	
	@Column(length = 30,unique = true)
	private int bankAccountNumber;
	
	private int managerId;
	private int roleId;
	

	
}
