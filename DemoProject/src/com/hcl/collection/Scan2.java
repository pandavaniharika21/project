package com.hcl.collection;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter 2 numbers ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("sum is :" +c);
	}
}
