package com.hcl.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	public static void main(String[] args) {
		List num=new ArrayList();
		num.add(new Integer(56));
		num.add(new Integer(78));
		num.add(new Integer(42));
		num.add(new Integer(13));
		int sum=0;
		for (Object ob : num) {
			sum+=(Integer)ob;
			
			
			
		}
		System.out.println("sum is "+sum);
		
	}

}
