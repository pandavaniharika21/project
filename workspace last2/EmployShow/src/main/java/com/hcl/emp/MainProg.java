package com.hcl.emp;

public class MainProg {
	public static void main(String[] args) {
		new EmployDao().showEmploy();
		new EmployDao().searchEmploy(2);
	}

}
