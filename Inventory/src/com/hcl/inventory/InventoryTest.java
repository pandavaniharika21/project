package com.hcl.inventory;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class InventoryTest {
static Inventory inventory=null;
	
	@BeforeClass
	public static void setUp() {
		inventory=new Inventory();
	}
	

	@Test
	public void testGetterAndSetter() {
		inventory=new Inventory();
		inventory.setStockid("S001");
		inventory.setItemName("Pens");
		inventory.setPrice(56324);
		inventory.setQuantityAvail(12);
		
		assertEquals("S001", inventory.getStockid());
		assertEquals("Pens", inventory.getItemName());
		assertEquals(56324, inventory.getPrice(),0);
		assertEquals(12, inventory.getQuantityAvail());

	}

}
