package com.hcl.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrStudent {
	public static void main(String[] args) {
		List student=new ArrayList();
		student.add(new Student(1, "niharika","pandava", 96));
		student.add(new Student(2, "laxmi","xyz", 85));
		student.add(new Student(3, "sravani","abc", 78));
		student.add(new Student(4, "navya","xyz", 85));
		
		for (Object ob : student) {
			Student s= (Student)ob;
			System.out.println(s);
				
	}

}
}
