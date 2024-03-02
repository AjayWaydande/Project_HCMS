package com.app.service;

import java.util.*;

import com.app.entities.Employee;
public interface EmployeeService {

	//add a method to get list of all emps
  List<Employee>getAllEmployees();
	//add method to add employee
  
   Employee addEmpDetails(Employee e1);
}
