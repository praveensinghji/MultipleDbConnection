package com.myapp.myapp.model;

public class MyModelClass {
	private String requestNo;
	private String firstName;
	private String lastName;
	private boolean isTrue;
	private String school;
	
	public MyModelClass() {
		
	}

	public MyModelClass(String requestNo, String firstName, String lastName, boolean isTrue, String school) {
		this.requestNo = requestNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isTrue = isTrue;
		this.school = school;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

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

	public boolean isTrue() {
		return isTrue;
	}

	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "myModelClass [requestNo=" + requestNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", isTrue=" + isTrue + ", school=" + school + "]";
	}
	
	
}
