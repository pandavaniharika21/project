package com.hcl.inventory;

import java.util.Scanner;


public class AddStockMain {
	public static void main(String[] args) {
		
		
		InventoryDAO dao=new InventoryDAO();
		Inventory inventory=new Inventory();
		String stockid=dao.generateStockId();
		inventory.setStockid(stockid);
		Scanner sc=new Scanner(System.in);
		System.out.println("item name");
		inventory.setItemName(sc.nextLine());
		System.out.println("item price");
		inventory.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("item quantity available");
		inventory.setQuantityAvail(Integer.parseInt(sc.nextLine()));
		
	    System.out.println(dao.addStock(inventory));
	}
	}
		
       
		                                                                            
		
	


