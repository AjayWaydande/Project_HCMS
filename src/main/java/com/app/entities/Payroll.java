package com.app.entities;

import java.math.BigDecimal;
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
@Table(name = "payroll")
public class Payroll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payroleId;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@Column(length = 20)
	private String salaryMonth;
	
	@Column(length = 20)
	private int salaryYear;
	
	@Column(length = 20)
	private double basicSalary;
	
	@Column(length = 20)
	private  double allowance;
	
	@Column(length = 20)
	private double deduction;
	
	@Column(length = 20)
	private double netSalary;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate paymentDate;

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll(int payroleId, Employee employee, String salaryMonth, int salaryYear, double basicSalary,
			double allowance, double deduction, double netSalary, LocalDate paymentDate) {
		super();
		this.payroleId = payroleId;
		this.employee = employee;
		this.salaryMonth = salaryMonth;
		this.salaryYear = salaryYear;
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.deduction = deduction;
		this.netSalary = netSalary;
		this.paymentDate = paymentDate;
	}

	public int getPayroleId() {
		return payroleId;
	}

	public void setPayroleId(int payroleId) {
		this.payroleId = payroleId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(String salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public int getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(int salaryYear) {
		this.salaryYear = salaryYear;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Payroll [payroleId=" + payroleId + ", employee=" + employee + ", salaryMonth=" + salaryMonth
				+ ", salaryYear=" + salaryYear + ", basicSalary=" + basicSalary + ", allowance=" + allowance
				+ ", deduction=" + deduction + ", netSalary=" + netSalary + ", paymentDate=" + paymentDate + "]";
	}
	
}

