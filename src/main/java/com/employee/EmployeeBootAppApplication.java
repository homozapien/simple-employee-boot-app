package com.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication 
public class EmployeeBootAppApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeBootAppApplication.class);
	

	public static void main(String[] args) 
	{ 
		SpringApplication.run(EmployeeBootAppApplication.class, args);
		
		logger.debug("Simple  Restful EmployeeBootApp Started: ");
	}

}
