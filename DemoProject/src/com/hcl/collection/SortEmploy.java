package com.hcl.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new NameComparator();
	
		SortedSet s=new TreeSet(c);
		s.add(new Employ(1, "niharika", 45321));
		s.add(new Employ(2, "laxmi", 45631));
		s.add(new Employ(3, "sravani", 45621));
		s.add(new Employ(4, "navya", 45321));
		s.add(new Employ(5, "anusha", 45621));
		for (Object obj : s) {
			Employ e=(Employ)obj;
			System.out.println(obj);
			
		}
	}

}
