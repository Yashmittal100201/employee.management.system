package com.Employee.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Management.System.Model.Employee;
import com.Employee.Management.System.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class Controller {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get all employees
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}

	
}
