package com.hcl.bank;

import java.util.Scanner;

public class withdrawAccountMain {
public static void main(String[] args) {
	int accountNo,withdrawAmount;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter AccountNo  ");
	accountNo=sc.nextInt();
	System.out.println("enter withdrawAmount ");
	withdrawAmount=sc.nextInt();
	AccountDAO dao=new AccountDAO();
	System.out.println(dao.withdrawAccount(accountNo, withdrawAmount));
}

}
