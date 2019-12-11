package com.hcl.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		SortedSet<Student> student=new TreeSet<Student>();
		student.add(new Student(1,"sowmya","nellore",7.5));
		student.add(new Student(2,"niharika","nellore",8.5));
		student.add(new Student(3,"laxmi","skm",9.5));
		student.add(new Student(4,"sravani","chennai",6.5));
		for (Student student1 : student) {
			System.out.println(student1);
			
		}
		
	}

}
