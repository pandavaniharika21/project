package com.hcl.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy  {
	public static void main(String[] args) {
		SortedSet<Employ> Employ=new TreeSet<Employ>();
		Employ.add(new Employ(1,"niharika","cse","se",12563));
		Employ.add(new Employ(2,"sowmya","ece","se",12536));
		Employ.add(new Employ(3,"sravani","cse","manager",125364));
		Employ.add(new Employ(4,"anusha","cse","se",125364));
		for (Employ employ2 : Employ) {
			System.out.println(employ2);
			
		}
		
	}

	
}
