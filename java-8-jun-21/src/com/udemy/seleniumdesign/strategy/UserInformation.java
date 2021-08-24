package com.udemy.seleniumdesign.strategy;

public class UserInformation {

    private String firstName;

    private String lastName;

    private String email;

    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserInformation(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public UserInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void enterDetails(String fn, String ln, String email){
        this.firstName = fn;
        this.lastName = ln;
        this.email = email;
    }

}
