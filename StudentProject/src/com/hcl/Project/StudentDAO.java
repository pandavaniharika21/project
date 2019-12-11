package com.hcl.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
	static List<Student> lstStudents=null;
	static ResourceBundle rb=null;
	static {
		lstStudents=new ArrayList<Student>();
		rb=ResourceBundle.getBundle("student");
		
	}
	public String addStudentDao(Student student){
		lstStudents.add(student);
		return rb.getString("add");
		
	}
	public List<Student> showStudentDao() {
		return lstStudents;
	}
	public Student searchStudentDao(int sno) {
		Student objStudent=null;
		for (Student student : lstStudents) {
			if(student.getSno()==sno) {
				objStudent=student;
			}	
		}
		return objStudent;
	}
	
	public String deleteStudentDao(int sno) {
		String result="";
		Student student= searchStudentDao(sno);
		if(student !=null) {
			lstStudents.remove(student);
			result=rb.getString("delete");
		}
		else {
			result=rb.getString("notfound");;
			}
		return result;
	}
	
	public String updateStudentDao(Student objStudent) {
		Student student=searchStudentDao(objStudent.getSno());
		String result="";
		if(student !=null) {
		for (Student s : lstStudents) {
			if(s.getSno()==objStudent.getSno()) {
				s.setName(objStudent.getName());
				s.setCity(objStudent.getCity());
				s.setCgp(objStudent.getCgp());
				}
			}
		result=rb.getString("upd");;
		}
		else {
			result=rb.getString("notfound");;
			
		}
		return result;		
		}
	}


