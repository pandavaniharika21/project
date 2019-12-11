package com.hcl.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo { 
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("niharika");
		s.add("laxmi");
		s.add("laxmi");
		s.add("sravani");
		s.add("anusha");
		s.add("niharika");
		s.add("laxmi");
		s.add("laxmi");
		s.add("sravani");
		s.add("anusha");
		s.add("niharika");
		s.add("laxmi");
		s.add("laxmi");
		s.add("sravani");
		s.add("anusha");
		for (Object ob : s) {
			System.out.println(ob);
			
		}
		
	}

}
