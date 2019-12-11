package com.hcl.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	@Test
	//"Customer [custId=" + custId + ", custName=" + custName + ", annualPremium=" + annualPremium + ", modalPremium=" + modalPremium + ", paymentMode=" + paymentMode + "]";
	public void testtoString() {
		Customer  objCustomer=new Customer();
		objCustomer.setCustId(12);
		objCustomer.setCustName("niharika");
		objCustomer.setAnnualPremium(23000.0);
		objCustomer.setModalPremium(23.0);
		objCustomer.setPaymentMode(2);
		assertEquals("Customer [custId=12, custName=niharika, annualPremium=23000.0, modalPremium=23.0, paymentMode=2]", objCustomer.toString());
	}
	
@Test
 public void testGettersAndSetters() {
	Customer objCustomer=new Customer();
	objCustomer.setCustId(12);
	objCustomer.setCustName("niharika");
	objCustomer.setAnnualPremium(23000.0);
	objCustomer.setModalPremium(23.0);
	objCustomer.setPaymentMode(2);
	
	assertEquals(12, objCustomer.getCustId());
	assertEquals("niharika",objCustomer.getCustName());
	assertEquals(23000,objCustomer.getAnnualPremium(),0);
	assertEquals(23, objCustomer.getModalPremium(),0);
	assertEquals(2, objCustomer.getPaymentMode());
}
}
