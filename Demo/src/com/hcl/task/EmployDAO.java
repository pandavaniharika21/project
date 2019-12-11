package com.hcl.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



public class EmployDAO {
	static List<Employ> lstEmploys=null;                                                          
	static ResourceBundle rb=null;
	static {
		lstEmploys=new ArrayList<Employ>();
		rb=ResourceBundle.getBundle("Employ");
		}
	public String addEmployDao(Employ employ) {
		lstEmploys.add(employ);
		return rb.getString("add");
	}
	
	public List<Employ> showEmployDao() {
		return lstEmploys;
	}
	public Employ searchEmployDao(int empId) {
		Employ objEmploy=null;
		for (Employ employ : lstEmploys) {
		
			if(employ.getEmpId()==empId) {
				objEmploy=employ;
			}	
		}
		return objEmploy;
	}
	
	public void writeEmployFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/employ1.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstEmploys);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readEmployFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/employ1.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstEmploys =(List<Employ>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}