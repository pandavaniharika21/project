package com.hcl.generics;

class Data <T>{
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value " +a+ "  B value" +b);
	}
}
public class GenDemo { 
	public static void main(String[] args) {
		Data obj1=new Data();
		int a=5,b=7;
		obj1.swap(a, b);
		double a1=12.4,b1=23.7;
		obj1.swap(a1, b1);
		String s1="niharika",s2="anusha";
		obj1.swap(a1,b1);
		boolean f1=true,f2=false;
		obj1.swap(f1, f2);
	}

}
