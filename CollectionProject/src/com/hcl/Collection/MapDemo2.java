package com.hcl.Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Double> m=new Hashtable<String,Double>();
		m.put("niharika", 562314.45);
		m.put("poornesh", 2356321.12);
		m.put("sravani",52314.12);
		m.put("anusha", 775421.23);
		String key;
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key ");
		key=sc.nextLine();
		sal=m.getOrDefault(key,0.0);
		System.out.println("salary is " +sal);
		
	}

	
	}


