package com.hcl.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator c=new CgpComparator();
		///Comparator c1=new FirstNameComparator();///
		
		SortedSet s=new TreeSet(c);
		
		
		s.add(new Student(1, "niharika","pandava", 96));
		s.add(new Student(2, "laxmi","xyz", 85));
		s.add(new Student(3, "sravani","abc", 78));
		s.add(new Student(4, "navya","xyz", 86));
		for (Object ob : s) {
			Student e=(Student)ob;
			System.out.println(ob);
			
			
		}
	}

}
