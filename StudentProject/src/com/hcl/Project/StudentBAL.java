package com.hcl.Project;

import java.util.List;

public class StudentBAL {

	static StringBuilder sb=new StringBuilder();
	
	public boolean addStudentBal(Student objStudent) throws StudentException {
		boolean isAdded=true;
		if(objStudent.getSno() <=0) {
			sb.append("StudentNO cannot be negative or Zero \r\n");
			isAdded=false;	
		}
		if(objStudent.getName().length() <=3) {
			sb.append("name more than 3 character \r\n");
			isAdded=false;
		}
		if(objStudent.getCity().length() <=3) {
			sb.append("city more than 3 character \r\n");
			isAdded=false;
		} 
		if(objStudent.getCgp() < 0) {
			sb.append("cgp Non-neagtive  \r\n");
			isAdded=false;
		}
		if(isAdded==false) {
			throw new StudentException(sb.toString());
		} else {
			new StudentDAO().addStudentDao(objStudent);
			}
		return isAdded;
	
}
	public List<Student> showStudentBal() {
		return new StudentDAO().showStudentDao();
	}
	public Student searchStudentBal(int sno) {
		return new StudentDAO().searchStudentDao(sno);
	}
	public String updateStudentBal(Student objStudent) {
		return new StudentDAO().updateStudentDao(objStudent);
		
	}
	public String deleteeStudentBal(int sno) {
		return new StudentDAO().deleteStudentDao(sno);	
}
}

