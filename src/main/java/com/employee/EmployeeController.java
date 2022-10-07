package com.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "employee")
public class EmployeeController 
{
	 Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	 
	@Autowired
	EmployeeService service;
	
	@GetMapping(value="/")
	public String returnSimpleMsg() 
	{
		String message = "Welcome to CI/CD Deployment of a Simple SpringBoot Application; demonstrating \n"
				       + "integration between Git, Docker, Jenkins (on EC2), and AWS EC2 VM!";
		
		return  message;
	}
	
	@RequestMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<Employee> getAllEmployees() 
	{
		return  service.getAllEmployees();
	}

}
