
package com.employee;

import java.util.concurrent.atomic.AtomicLong;


public class Employee {

    private long empid;
    private String firstname;
    private String lastName;  
    private String emailAddr;
    private static final AtomicLong counter = new AtomicLong(100);


  
    public Employee(String firstname, String lastName, String emailAddr) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.emailAddr = emailAddr;     
        this.empid = counter.incrementAndGet();
    }



	public long getEmpid() {
		return empid;
	}



	public void setEmpid(long empid) {
		this.empid = empid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmailAddr() {
		return emailAddr;
	}



	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastName=" + lastName + ", emailAddr="
				+ emailAddr + "]";
	}

   
    

   
    
}
