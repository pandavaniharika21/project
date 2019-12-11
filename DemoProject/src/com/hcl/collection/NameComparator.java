package com.hcl.collection;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
	Employ e1=(Employ)ob1;
	Employ e2=(Employ)ob2;
	return e2.name.compareTo(e1.name);
	
	}

}
