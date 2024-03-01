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
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(length = 30)
	private String firstName;
	
	@Column(length = 30)
    private String lastName;
	
	@Column(length = 30)
	private String gender;
	
	@Column(length = 30)
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
	@JoinColumn(name ="department_id")
	private Department department;
	
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
	
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Employee manager;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String firstName, String lastName, String gender, LocalDate dateOfBirth,
			String email, String mobileNumber, String address, int nationalId, String maritalStatus,
			String emergencyContactNumber, Department department, String postion, String skillset,
			LocalDate employmentStartDate, LocalDate employmentEndDate, double salary, String employmentStatus,
			int bankAccountNumber, Employee manager, Role role) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.nationalId = nationalId;
		this.maritalStatus = maritalStatus;
		this.emergencyContactNumber = emergencyContactNumber;
		this.department = department;
		this.postion = postion;
		this.skillset = skillset;
		this.employmentStartDate = employmentStartDate;
		this.employmentEndDate = employmentEndDate;
		this.salary = salary;
		this.employmentStatus = employmentStatus;
		this.bankAccountNumber = bankAccountNumber;
		this.manager = manager;
		this.role = role;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public LocalDate getEmploymentStartDate() {
		return employmentStartDate;
	}

	public void setEmploymentStartDate(LocalDate employmentStartDate) {
		this.employmentStartDate = employmentStartDate;
	}

	public LocalDate getEmploymentEndDate() {
		return employmentEndDate;
	}

	public void setEmploymentEndDate(LocalDate employmentEndDate) {
		this.employmentEndDate = employmentEndDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", nationalId=" + nationalId + ", maritalStatus="
				+ maritalStatus + ", emergencyContactNumber=" + emergencyContactNumber + ", department=" + department
				+ ", postion=" + postion + ", skillset=" + skillset + ", employmentStartDate=" + employmentStartDate
				+ ", employmentEndDate=" + employmentEndDate + ", salary=" + salary + ", employmentStatus="
				+ employmentStatus + ", bankAccountNumber=" + bankAccountNumber + ", manager=" + manager + ", role="
				+ role + "]";
	}
	
	
	

	
}
