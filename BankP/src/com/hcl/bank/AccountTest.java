package com.hcl.bank;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	static Accounts account=null;
	@BeforeClass
	public static void setUp(){

account=new Accounts();
}

	@Test
	public void testGettersAndSetters() {
		account=new Accounts();
		account.setAccountNo(1);
		account.setFirstName("Sravani");
		account.setLastName("HCL");
		account.setCity("Chennai");
		account.setState("TN");
		account.setAmount(77444);
		account.setCheqFacil("Yes");
		account.setAccountType("Savings");
		assertEquals(1,account.getAccountNo());
		assertEquals("Sravani",account.getFirstName());
		assertEquals("HCL",account.getLastName());
		assertEquals("Chennai",account.getCity());
		assertEquals("TN",account.getState());
		assertEquals(77444,account.getAmount());
		assertEquals("Yes",account.getCheqFacil());
		assertEquals("Savings",account.getAccountType());
	}

}
