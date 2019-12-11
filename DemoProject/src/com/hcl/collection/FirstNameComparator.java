package com.hcl.collection;

import java.util.Comparator;

public class FirstNameComparator implements Comparator 
{

	@Override
	public int compare(Object ob1, Object ob2) {
		Student e1=(Student)ob1;
		Student e2=(Student)ob2;
		return e1.firstName.compareTo(e2.firstName);
		
	}
	

}
