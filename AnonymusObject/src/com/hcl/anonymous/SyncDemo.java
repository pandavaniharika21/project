package com.hcl.anonymous;

class Demo {
	void dispMsg(String name) {
		System.out.println("hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" how are u.." +name);
	}
}
public class SyncDemo {
	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1=new Thread() {
			@Override
			public void run() {
				obj.dispMsg("niharika");
			
			}
		};
		Thread t2=new Thread() {
		@Override
		public void run() {
		obj.dispMsg("anusha");
		}	
		};
		t1.start();
		t2.start();
	}

}
