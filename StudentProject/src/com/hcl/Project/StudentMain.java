package com.hcl.Project;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do{
		    System.out.println("options");
			System.out.println("---------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4.update Student");
			System.out.println("5.Delete student");
			System.out.println("6. exit");
			System.out.println("enter your choice  ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				showStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 6:
				return;
			default:
				System.out.println("invalid input");
			
			}
		}while(choice!=6);
		
	}
	
	public static void updateStudent() {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student no  ");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("enter student name  ");
		objStudent.setName(sc.nextLine());
		System.out.println("enter student city  ");
		objStudent.setCity(sc.nextLine());
		System.out.println("enter student cgp  ");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.updateStudentBal(objStudent));
	}
	public static void deleteStudent() {
		int sno;
		System.out.println("enter student No ");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.deleteeStudentBal(sno));
	}
	
	public static void searchStudent() {
		int sno;
		System.out.println("enter student No ");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		Student student=obj.searchStudentBal(sno);
		if(student==null) {
			System.out.println("student record not found");
		} else {
			System.out.println(student);
		}
	}
	public static void showStudent() {
		StudentBAL obj=new StudentBAL();
		List<Student> students=obj.showStudentBal();
		for (Student student : students) {
			System.out.println(student);
		}
	
	}
	
	public static void addStudent() {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student no  ");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("enter student name  ");
		objStudent.setName(sc.nextLine());
		System.out.println("enter student city  ");
		objStudent.setCity(sc.nextLine());
		System.out.println("enter student cgp  ");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		
		StudentBAL obj=new StudentBAL();
		try {
			boolean res=obj.addStudentBal(objStudent);
			if(res==true) {
				System.out.println("student Added successfully");
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
