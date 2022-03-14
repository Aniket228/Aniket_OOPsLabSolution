package com.credentails.model;


public class Employee {
	private String firstName;
	private String lastName;
	
	public static final String companyName = "Google";

	public Employee(String firstName, String lastName){
		
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getlastName(){
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
