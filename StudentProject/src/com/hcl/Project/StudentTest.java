package com.hcl.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {
	@Test
	//"Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]"
	public void testToString() {
		Student objStudent=new Student();
		objStudent.setSno(1);
		objStudent.setName("Harika");
		objStudent.setCity("Nellore");
		objStudent.setCgp(8.9);
		assertEquals("Student [sno=1, name=Harika, city=Nellore, cgp=8.9]", objStudent.toString());
	}
	@Test
	public void testGettersAndSetters() {
		Student objStudent=new Student();
		objStudent.setSno(1);
		objStudent.setName("Harika");
		objStudent.setCity("Nellore");
		objStudent.setCgp(8.9);
		
		assertEquals(1, objStudent.getSno());
		assertEquals("Harika", objStudent.getName());
		assertEquals("Nellore", objStudent.getCity());
		assertEquals(8.9, objStudent.getCgp(),0);
		
		
	}
	

}

