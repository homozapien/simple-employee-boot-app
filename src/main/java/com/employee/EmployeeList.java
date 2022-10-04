
package com.employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeList 
{
    private static final List<Employee> employeeList = new ArrayList<>();
    
    private EmployeeList(){
    }
    
    static
    {
        employeeList.add(new Employee("John","Doe","john.doe@email.com"));
        employeeList.add(new Employee("Tom","Jerry","tom.jerry@email.com"));
        employeeList.add(new Employee("Wasiu","Ayinde","wasiu.ayinde@email.com"));
        employeeList.add(new Employee("Tunde","Bakau","tunde.bakau@email.com"));
    }
    
    public static List <Employee> getInstance()
    {
        return employeeList;
    }
}
