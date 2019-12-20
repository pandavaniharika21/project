package com.hcl.dept;

public class MainProg {
	public static void main(String[] args) {
		new DepartmentDao().showDepartment();
		new DepartmentDao().searchDepartment(2);
		
	}

}
