package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentShow {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> departmentList=q.list();
		for (Department department : departmentList) {
			System.out.println("Deptno " +department.getDeptno());
			System.out.println("Dname " +department.getDeptname());
			System.out.println("Loc " +department.getLoc());
			System.out.println("City " +department.getCity());
			System.out.println("Head " +department.getHead());
			System.out.println("---------------------");
			
		}
	}

	

}
