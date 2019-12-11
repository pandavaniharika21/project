package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> employ=new ArrayList<Employ>();
		employ.add(new Employ(1, "niharika", 56321));
		employ.add(new Employ(2, "laxmi", 563212));
		employ.add(new Employ(3, "anusha", 5634456));
		employ.add(new Employ(4, "sai", 5645321));
		employ.add(new Employ(5, "mani", 56123321));
		for (Employ emp : employ) {
			System.out.println(emp);
			
		}
	}

}
