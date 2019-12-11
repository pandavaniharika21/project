package com.hcl.Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerDAO {
	static List<Customer>LstCustomer=null;
	static ResourceBundle rb=null;
	static {
		LstCustomer=new ArrayList<Customer>();
		
			}
	public String addCustomerDao(Customer customer){
		LstCustomer.add(customer);
		return "customer created successfully";
	}
	public List<Customer>showCustomerDao() {
		return LstCustomer;
}
	public Customer searchCustomerDao(int custId){
		Customer objCustomer=null;
	for (Customer customer : LstCustomer) {
		if(customer.getCustId()==custId) {
			objCustomer=customer;		
	}	
	}
		return objCustomer;
	}
	public String deleteCustomerDao(int custId) {
		String result="";
		Customer customer= searchCustomerDao(custId);
		if(customer !=null) {
			LstCustomer.remove(customer);
			result="Customer Record Deleted successfully";
			
		}
		else {
			result="customer Record Not Found ";
			}
		return result;
	}
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(LstCustomer);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			LstCustomer =(List<Customer>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String updateCustomerDao(Customer objCustomer) {
		Customer customer=searchCustomerDao(objCustomer.getCustId());
		String result="";
		if(customer !=null) {
		for (Customer c : LstCustomer) {
			if(c.getCustId()==objCustomer.getCustId()) {
				c.setCustName(objCustomer.getCustName());
                 c.setAnnualPremium(objCustomer.getAnnualPremium());
                 c.setModalPremium(objCustomer.getModalPremium());
                 c.setPaymentMode(objCustomer.getPaymentMode());
				}
			}
		result="customer Record Upload....";
		}
		else {
			result="Customer Record not found....";
			
		}
		return result;
	}

	
}
