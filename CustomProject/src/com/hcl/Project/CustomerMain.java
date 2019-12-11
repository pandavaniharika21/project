package com.hcl.Project;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
	
		public static void main(String[] args) {
			int choice;
			Scanner sc=new Scanner(System.in);
			do{
				System.out.println("options");
				System.out.println("---------");
				System.out.println("1. Add customer");
				System.out.println("2. Show customer");
				System.out.println("3. Search customer");
				System.out.println("4.update customer");
				System.out.println("5.Delete customer");
				System.out.println("6. Write Student File");
				System.out.println("7. Read Student File");
				System.out.println("8. exit");
				
				System.out.println("enter your choice  ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					addCustomer();
					break;
				case 2:
					showCustomer();
					break;
				case 3:
					searchCustomer();
					break;
				case 4:
					updateCustomer();
					break;
				case 5:
					deleteCustomer();
					break;
				case 6 : 
					writeCustomerFile();
					break;
				case 7 : 
					readCustomerFile();
					break;
				case 8:
					return;
				   default:
					System.out.println("invalid input");
				
				}
			}while(choice!=8);
			
		}
		
		
		public static void updateCustomer() {
			Customer objCustomer=new Customer();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter customer Id  ");
			objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
			System.out.println("enter customer name  ");
			objCustomer.setCustName(sc.nextLine());
			System.out.println("enter customer annual premium  ");
			objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter customer modalpremium  ");
			objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter customer payment mode  ");
			objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
			CustomerBAL obj=new CustomerBAL();
			System.out.println(obj.updateCustomerBal(objCustomer));
		}
		
		public static void deleteCustomer() {
			int CustId;
			System.out.println("enter customer Id ");
			Scanner sc=new Scanner(System.in);
			CustId=sc.nextInt();
			CustomerBAL obj=new CustomerBAL();
			System.out.println(obj.deleteCustomerBal(CustId));
		}
		
		public static void searchCustomer() {
			int CustId;
			System.out.println("enter customer Id ");
			Scanner sc=new Scanner(System.in);
			CustId=sc.nextInt();
			CustomerBAL obj=new CustomerBAL();
			Customer customer=obj.searchCustomerBal(CustId);
			if(customer==null) {
				System.out.println("customer record not found..");
			} else {
				System.out.println(customer);
			}
		}
		public static void showCustomer() {
			CustomerBAL obj=new CustomerBAL();
			List<Customer> customers=obj.showCustomerBal();
			for (Customer customer : customers) {
				
				System.out.println(customer);
			}
			}
		public static void writeCustomerFile() {
			new CustomerBAL().writeCustomerFileBal();
		}
		
		public static void readCustomerFile() {
			new CustomerBAL().readCustomerFileBal();
		}
		
		
		public static void addCustomer() {
			Customer objCustomer=new Customer();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter customer Id  ");
			objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
			System.out.println("enter customer name  ");
			objCustomer.setCustName(sc.nextLine());
			System.out.println("enter customer annual premium  ");
			objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter customer modalpremium  ");
			objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter customer payment mode  ");
			objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
			CustomerBAL obj=new CustomerBAL();
			System.out.println(obj.updateCustomerBal(objCustomer));

			CustomerBAL obj1=new CustomerBAL();
			try {
				boolean res=obj1.addCustomerBal(objCustomer);
				if(res==true) {
					System.out.println("customer Added Successfully");
				}
			} catch (CustomerException e) {
				System.out.println(e.getMessage());
			}
		}
		
}
