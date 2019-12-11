package com.hcl.Files;


	class NegativeException extends Exception {
		public NegativeException(String error) {
			super(error);
			
		}
	}
	class NumberZeroException extends  Exception {
		NumberZeroException(String error) {
			super(error);
		}
	}
	public class Custom1 {
		public void add(int a,int b) throws NegativeException, NumberZeroException
		{
			boolean flag=true;
			if(a<0 || b<0) {
				flag=false;
				throw new NegativeException("negative Nos not allowed");
				
			}
			if(a==0 || b==0) {
				flag=false;
				throw new NumberZeroException("zero  is Invalid...");
				
			}
			if(flag==true) {
				int c=a+b;
				System.out.println("sum is  " +c);
			}
		}
		public static void main(String[] args) {
			try {
				new Custom1().add(12, 5);
			} catch (NegativeException | NumberZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}


