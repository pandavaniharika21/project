package com.hcl.collection;

import java.util.Comparator;

public class BasicComparator implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		Employ e1=(Employ)ob1;
		Employ e2=(Employ)ob2;
		if( e1.basic >= e2.basic) {
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
