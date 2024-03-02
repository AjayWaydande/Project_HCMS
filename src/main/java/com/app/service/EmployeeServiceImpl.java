package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.entities.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	// toGetAllEmployee
	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("in getAllEmployee" + getClass().getName());
		return empDao.findAll();
	}

	public Employee addEmpDetails(Employee emp) {
		System.out.println("emp " + emp);// id : null
		return empDao.save(emp);

	}
}
