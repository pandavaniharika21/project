package com.hcl.Files;

import java.io.Serializable;

public class Student implements Serializable{
	int sno;
	String firstName;
	String lastName;
	double cgp;
	public Student(int sno, String firstName, String lastName, double cgp) {
		super();
		this.sno = sno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", firstName=" + firstName + ", lastName=" + lastName + ", cgp=" + cgp + "]";
	}
	

}
