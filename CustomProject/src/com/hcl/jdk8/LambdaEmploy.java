package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1,"niharika","cse","se",25000));
		list.add(new Employ(2,"laxmi","eee","se",20000));
		list.add(new Employ(3,"sravani","ece","se",15000));
		list.add(new Employ(4,"anusha","cse","se",22200));
		list.add(new Employ(5,"teja","cse","se",21000));
		
		list.stream().filter(e -> e.basic >50000).forEach(x-> {
			System.out.println(x);
		}); 
		System.out.println("Max basic record \n --------------------");
		Employ maxEmploy=list.stream().max((e1,e2)
				->  e1.basic >= e2.basic
				? 1 : -1).get();
				System.out.println(maxEmploy);
				
				System.out.println("Min basic record \n --------------------");
				Employ minEmploy=list.stream().max((e1,e2)
						->  e1.basic <= e2.basic
						? -1 : 1).get();
						System.out.println(minEmploy);
						
						System.out.println("first 3 Records ");
						list.stream().limit(3).forEach(e -> {
							System.out.println(e);
						});
					
								
	}

}
