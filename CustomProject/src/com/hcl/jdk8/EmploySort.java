package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1,"niharika","cse","se",25000));
		list.add(new Employ(2,"laxmi","java","se",20000));
		list.add(new Employ(3,"sravani","ece","se",15000));
		list.add(new Employ(4,"anusha","java","se",22200));
		list.add(new Employ(5,"teja","cse","se",21000));
		Collections.sort(list, (e1,e2) -> {
			return e1.name.compareTo(e2.name);
		});
		list.forEach(e -> {
			System.out.println(e);
		});
		
		Collections.sort(list, (e1,e2) -> {
		return (int)(e1.basic-e2.basic);	
	});
	System.out.println("sort by basic");
	
	list.forEach(e -> {
		System.out.println(e);
	}); 
	System.out.println("sort by java dept records---");
	list.stream().filter(e -> e.dept=="java").forEach(x -> {
		System.out.println(x);
	});
	System.out.println("display all records skip first 2 max records ---");
	Collections.sort(list,(e1,e2) -> {
		return (int)(e2.basic-e1.basic);
	});
	list.stream().skip(2).forEach(e -> {
		System.out.println(e);
	});
	}

}
