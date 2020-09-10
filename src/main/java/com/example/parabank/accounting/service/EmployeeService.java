package com.example.parabank.accounting.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parabank.accounting.model.Employee;
import com.example.parabank.accounting.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employee> getEmployeeById(Integer id) {
		return employeeRepository.findById(id);
		
	}
}
