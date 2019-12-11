package com.hcl.emp;

import java.util.Scanner;

public class AddEmployMain {
	
	public static void main(String[] args) {
		EmployDAO dao=new EmployDAO();
		// System.out.println(dao.generateEmployno());
		Employ employ=new Employ();
		int empno=dao.generateEmployno();
		employ.setEmpno(empno);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ Name ");
		employ.setName(sc.nextLine());
		System.out.println("Enter Department  ");
		employ.setDept(sc.nextLine());
		System.out.println("Enter Designation ");
		employ.setDesig(sc.nextLine());
		System.out.println("Enter salary  ");
		employ.setBasic(Integer.parseInt(sc.nextLine()));
		System.out.println(dao.addEmploy(employ));
	}
	

}
