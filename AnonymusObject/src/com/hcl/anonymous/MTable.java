package com.hcl.anonymous;
interface Training {
	void show();
	
}
public class MTable {
	public static void main(String[] args) {
		Training obj=new Training() {
			
			@Override
			public void show() {
				int p,n;
				for (int i=0;i<=10; i++) {
					p=n*i;
					System.out.println(n + " * " +i+ " = " +p);
				}
					Thread.sleep(1000);
				}
		}
		

		
	}
}


					

		
	
	
	
