package com.hcl.collection;

import java.util.Comparator;

public class CgpComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		Student e1=(Student)ob1;
		Student e2=(Student)ob2;
		if( e1.cgp >= e2.cgp) {
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
