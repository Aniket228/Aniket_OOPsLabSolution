package com.credentials.service;

import java.util.Random;

import com.credentails.model.Employee;

public class Credentials {
	
	private String generatePassword() {
		
        Random random = new Random();

        String password = "";
        
        for (int i = 0; i <= 7; i++) {
            password += (char) random.nextInt(33, 123);
        }
        return password;
    }
	private String generateEmailAddress(Employee employee, String department) {
		
		return employee.getFirstName().toLowerCase() + employee.getlastName().toLowerCase() + "@" + department + "." + "abc"  + ".com";
	}
	public void showCredentials(Employee employee, String department) {
		
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		
		System.out.println("Email    ----> " + this.generateEmailAddress(employee, department));
		
		System.out.println("Password --->" + this.generatePassword());
	}

}
	