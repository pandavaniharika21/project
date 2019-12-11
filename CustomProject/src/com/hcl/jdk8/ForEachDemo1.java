package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("sowmya");
		names.add("niharika");
		names.add("sai");
		names.add("navya");
		names.forEach(n -> {
			System.out.println(n);});
		//for (String string : names) {
		//	System.out.println(string); 
		// } 
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(67));
		num.add(new Integer(77));
		num.add(new Integer(77));
		num.add(new Integer(57));
		num.add(new Integer(88));
		num.add(new Integer(97));
		num.forEach(p -> {
			if(p > 50) {
				System.out.println(p);
			}
		});
	}

}
