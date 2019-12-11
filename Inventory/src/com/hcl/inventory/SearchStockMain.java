package com.hcl.inventory;

import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
		String stockid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stock id");
		stockid=sc.nextLine();
		InventoryDAO dao=new InventoryDAO();
		Inventory inventory=dao.searchStock(stockid);
		if(inventory!=null){
			System.out.println("name "+inventory.getItemName());
			System.out.println("item price "+inventory.getPrice());
			System.out.println("qty avail "+inventory.getQuantityAvail());
		}
	}
}
	

