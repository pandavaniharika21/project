package com.hcl.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("niharika");
		names.add("anusha");
		names.add("laxmi");
		names.add("sravani");
		names.add("priya");
		System.out.println("names are ");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
		names.add(2,"priyanka");
		System.out.println("names afer adding item ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(3, "sravani");
		System.out.println("names afr editing...");
		for (Object ob : names) {
			System.out.println(ob);
		}
			names.remove("sravani");
			System.out.println("list after removing by object name");
			for (Object ob : names) {
				System.out.println(ob);
				
			}
			names.remove(0);
			System.out.println("list after removing by index");
			for (Object ob : names) {
				System.out.println(ob);
			}
		}
	}


