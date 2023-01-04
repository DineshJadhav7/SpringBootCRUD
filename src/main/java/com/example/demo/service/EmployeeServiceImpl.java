package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeRepository employeeRepository;

@Override
public Employee SaveEmployee(Employee employee) {
	
	return employeeRepository.save(employee);
}
	
		
	}


