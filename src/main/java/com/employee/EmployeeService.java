/* Copyright � 2015 Oracle and/or its affiliates. All rights reserved. */
package com.employee;


import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService 
{

    List<Employee> employeeList = EmployeeList.getInstance();

    public List<Employee> getAllEmployees() 
    {       
        return employeeList;
    }

   
}
