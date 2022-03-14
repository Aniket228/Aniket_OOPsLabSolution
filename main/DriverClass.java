package com.credentials.main;

import java.util.Scanner;

import com.credentails.model.Employee;

import com.credentials.service.Credentials;

public class DriverClass {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first name: ");
			String firstName = sc.nextLine();
			
			System.out.println("Enter last name: ");
			String lastName = sc.nextLine();
				
				
			
			Employee name = new Employee(firstName, lastName);
			
			Credentials cs = new Credentials();
			
			System.out.println("Please enter the department from the following");
			
			System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
			
			int option = sc.nextInt();
			
			switch (option) {
			case 1: cs.showCredentials(name, "Technical");
				break;
			case 2: cs.showCredentials(name, "Admin");
				break;
			case 3: cs.showCredentials(name, "Human Resource");
				break;
			case 4: cs.showCredentials(name, "Legal");
				break;
			default:
				System.out.println("Invalid Option!");
			}

			sc.close();
			
			
	}

}
