package com.hcl.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:/Users/BLTuser/workspace/DemoProject/src/com/hcl/Files/Custom1.java");
			Scanner sc=new Scanner(fin);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
			sc.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
