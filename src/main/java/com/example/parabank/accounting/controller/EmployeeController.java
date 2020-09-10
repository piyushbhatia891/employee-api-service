package com.example.parabank.accounting.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parabank.accounting.exception.EmployeeNotFoundException;
import com.example.parabank.accounting.model.Employee;
import com.example.parabank.accounting.service.EmployeeService;

@RestController
@RequestMapping("/employees/v1")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") String employeeId) throws EmployeeNotFoundException {
		Optional<Employee> employee = employeeService.getEmployeeById(Integer.parseInt(employeeId));
		if (!employee.isPresent())
			throw new EmployeeNotFoundException("Employee Not Found");
		else
			return employee.get();
	}

}
