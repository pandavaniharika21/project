package com.hcl.Project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class StudentBALTest {
	@Test
	public void testUpdatehStudent() throws StudentException {
		Student student2=new Student();
		student2.setSno(3);
		student2.setName("Harika");
		student2.setCity("Chennai");
		student2.setCgp(8.9);
		StudentBAL bal=new StudentBAL();
		String result=bal.updateStudentBal(student2);
		assertEquals("student record updated", result);
		
		Student student3=new Student();
		student3.setSno(-3);
		student3.setName("Harika");
		student3.setCity("Chennai");
		student3.setCgp(8.9);
		
		result=bal.updateStudentBal(student3);
		assertEquals("student record not found", result);
	
	}
	@Test
	public void testSearchStudent() throws StudentException {
		StudentBAL bal=new StudentBAL();
		Student student1=bal.searchStudentBal(-1);
		assertNull(student1);
		Student student2=bal.searchStudentBal(1);
		assertNotNull(student2);
	}

	@Test
	public void testShowAllStudent() throws StudentException {
		Student student1=new Student();
		student1.setSno(1);
		student1.setName("Navya");
		student1.setCity("Chennai");
		student1.setCgp(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student1);
		
		Student student2=new Student();
		student2.setSno(3);
		student2.setName("Harika");
		student2.setCity("Chennai");
		student2.setCgp(8.9);
		
		bal.addStudentBal(student2);
		List<Student> students=bal.showStudentBal();
	
	}
	@Test
	public void testAddStudent() throws StudentException {
		Student student=new Student();
		student.setSno(1);
		student.setName("Navya");
		student.setCity("Chennai");
		student.setCgp(9.9);
		StudentBAL bal=new StudentBAL();
		assertEquals("student created successfully", bal.addStudentBal(student));
	}
	@Test(expected=StudentException.class)
	public void testEx1() throws StudentException  {
		Student student=new Student();
		student.setSno(1);
		student.setName("dd");
		student.setCity("Chennai");
		student.setCgp(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}
	@Test(expected=StudentException.class)
	public void testEx2() throws StudentException  {
		Student student=new Student();
		student.setSno(-1);
		student.setName("Navya");
		student.setCity("Chennai");
		student.setCgp(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}
	@Test(expected=StudentException.class)
	public void testEx3() throws StudentException  {
		Student student=new Student();
		student.setSno(1);
		student.setName("Navya");
		student.setCity("a");
		student.setCgp(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}
	@Test(expected=StudentException.class)
	public void testEx4() throws StudentException  {
		Student student=new Student();
		student.setSno(1);
		student.setName("Navya");
		student.setCity("Chennai");
		student.setCgp(-1.1);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}	
	}
	
	


