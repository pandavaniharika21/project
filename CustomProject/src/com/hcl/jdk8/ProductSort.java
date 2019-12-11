package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSort {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"samsug A5",170000));
		list.add(new Product(2, "Iphone 6S", 7000));
		list.add(new Product(3, "nokia", 15000));
		list.add(new Product(4, "redmi 7S", 28000));
		list.add(new Product(5, "redmi 6s", 17000));
		list.add(new Product(6, "Iphone 7s", 29000));
		Collections.sort(list, (p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		list.forEach(p -> {
			System.out.println(p);
		});
		
		Collections.sort(list, (p1,p2) -> {
			return (int)(p1.price-p2.price);	
		});
		System.out.println("sort by price");
		
		list.forEach(p -> {
			System.out.println(p);
		});
	}

}
