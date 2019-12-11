package com.hcl.Project;

import java.util.List;

public class CustomerBAL {
	
	static StringBuilder sb=new StringBuilder();

	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	public boolean addCustomerBal(Customer objCustomer) throws CustomerException { 
		boolean isAdded=true;
		if(objCustomer.getCustId() <=0) {
			sb.append("customerid cannot be negative or Zero \r\n");
			isAdded=false;	
		}
		if(objCustomer.getCustName().length() <=5) {
			sb.append("name more than 5 character \r\n");
			isAdded=false;
		}
		if(objCustomer.getAnnualPremium() >=20000 && objCustomer.getAnnualPremium() <1000000) {
			sb.append("AnnualPremium in between 20000 to 1000000 \r\n");
			isAdded=false;
		}
		if(objCustomer.getModalPremium() >=1000 && objCustomer.getModalPremium() <50000) {
			sb.append("modalPremium in between 1000 to 500000 \r\n");
			isAdded=false;
		}	
		if(objCustomer.getPaymentMode() ==1 && objCustomer.getPaymentMode() ==2 &&  objCustomer.getPaymentMode() ==3) {
			sb.append("paymentmode is 1 or 2 or 3  \r\n");
			isAdded=false;
		}	
		if(isAdded==false) {
			throw new CustomerException(sb.toString());
		} else {
			new CustomerDAO().addCustomerDao(objCustomer);
			}
		
		return isAdded;
	}
	public List<Customer> showCustomerBal() {
		return new CustomerDAO().showCustomerDao();
	}
	public Customer searchCustomerBal(int CustId) {
		return new CustomerDAO().searchCustomerDao(CustId);
	}
	public String updateCustomerBal(Customer objCustomer) {
		return new CustomerDAO().updateCustomerDao(objCustomer);
		
	}
	public String deleteCustomerBal(int CustId) {
		return new CustomerDAO().deleteCustomerDao(CustId);	
}
}

