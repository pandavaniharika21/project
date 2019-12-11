package com.hcl.emp;

import java.util.List;

public class CreateAccountMain {
	public static void main(String[] args) {
		EmployDAO dao=new EmployDAO();
		List<Employ> employList=dao.showEmploy();
		for (Employ employee : employList) {
			System.out.println("Employ No "+employee.getEmpno());
			System.out.println("Employ Name "+employee.getName());
			System.out.println("Department "+employee.getDept());
			System.out.println("Designation "+employee.getDesig());
			System.out.println("basic "+employee.getBasic());
			System.out.println("-------------------------");
		}
		
	}

}
