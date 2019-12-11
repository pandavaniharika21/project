package com.hcl.Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		Employ employ=new Employ(1, "niharika", 52369);
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("employ object stored successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
