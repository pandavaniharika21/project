package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class LambdaProduct {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1, "samsung A5", 27000));
		list.add(new Product(2, "Iphone 6S", 7000));
		list.add(new Product(3, "nokia", 15000));
		list.add(new Product(4, "redmi 7S", 28000));
		list.add(new Product(5, "redmi 6s", 17000));
		list.add(new Product(6, "Iphone 7s", 29000));
		
		list.stream().filter(p -> p.price >=20000).forEach(x-> {
			System.out.println(x);
		}); 
		System.out.println("----------------");
		list.stream().filter(p -> p.name.startsWith("s")).forEach(x -> {
			System.out.println(x);
		});
		
		System.out.println("Max price Mobile \n --------------------");
		Product maxProduct=list.stream().max((p1,p2)
				->  p1.price >= p2.price
				? 1 : -1).get();
				System.out.println(maxProduct);
				
				System.out.println("min price Mobile \n --------------------");
				Product minProduct=list.stream().min((p1,p2)
						->  p1.price <= p2.price
						? -1 : 1).get();
						System.out.println(minProduct);
					
						
						System.out.println("first 3 Records ");
						list.stream().limit(3).forEach(p -> {
							System.out.println(p);
						});
						System.out.println("after Skipping 2 records ");
						list.stream().skip(2).forEach(p -> {
							System.out.println(p);
						});
						
	}

}
