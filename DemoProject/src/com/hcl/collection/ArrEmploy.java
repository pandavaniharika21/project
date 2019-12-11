package com.hcl.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	public static void main(String[] args) {
		List employ =new ArrayList();
		employ.add(new Employ(1, "niharika", 45321));
		employ.add(new Employ(2, "laxmi", 45631));
		employ.add(new Employ(3, "sravani", 45621));
		employ.add(new Employ(4, "navya", 45321));
		employ.add(new Employ(5, "anusha", 45621));
		for (Object ob : employ) {
			Employ e= (Employ)ob;
			System.out.println(e);
			
		}
	}

}
