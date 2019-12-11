package com.hcl.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("teja");
		s.add("niharika");
		s.add("anusha");
		s.add("sowmya");
		s.add("laxmi");
		for (Object ob : s) {
			System.out.println(ob);
			
		}
	}
}
