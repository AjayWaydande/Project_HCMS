package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	public EmployeeController() {
    System.out.println("in employee controller:");
    }
	
	@GetMapping
	List<Employee> getAllEmployees()
	{
		return  empservice.getAllEmployees();
	      
			
	}
	
	@PostMapping("/emp")
	// @RequestBody => method arg level annotation , for un marshalling=de ser (json
	// --> java)
	public Employee addNewEmp(@RequestBody Employee emp) {
		System.out.println("in add new emp " + emp);
		return empservice.addEmpDetails(emp);
	}
	
	
	
	
	}

