package com.hcl.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
	public static void main(String[] args) {
		Map names=new HashMap();
		names.put("1", "niharika");
		names.put("2", "harika");
		names.put("3", "aunsha");
		names.put("4", "laxmi");
		names.put("5", "haritha");
		String key,value;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key ");
		key=sc.nextLine();
		value=(String)names.getOrDefault(key, "not found");
		System.out.println(value);
	}

}
