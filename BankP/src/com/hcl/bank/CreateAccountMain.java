package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		//System.out.println(new AccountDAO().generateAccountNo());
		AccountDAO dao=new AccountDAO();
		Accounts account=new Accounts();
		int accno=dao.generateAccountNo();
		account.setAccountNo(accno);
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name ");
		account.setFirstName(sc.nextLine());
		System.out.println("last Name ");
		account.setLastName(sc.nextLine());
		System.out.println("City ");
		account.setCity(sc.nextLine());
		System.out.println("State ");
		account.setState(sc.nextLine());
		System.out.println("Amount ");
		account.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("Cheq Facil ");
		account.setCheqFacil(sc.nextLine());
		System.out.println("Account Type ");
		account.setAccountType(sc.nextLine());
		System.out.println(dao.createAccount(account));
		
		
	}
	

}
