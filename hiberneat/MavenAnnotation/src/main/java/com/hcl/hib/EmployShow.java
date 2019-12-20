package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployShow {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		List<Employ> employList=q.list();
		for (Employ employ : employList) {
			System.out.println("Empno " +employ.getEmpno());
			System.out.println("Name " +employ.getName());
			System.out.println("Dept " +employ.getDept());
			System.out.println("Desig " +employ.getDesig());
			System.out.println("Basic " +employ.getBasic());
			System.out.println("---------------------");
			
			
		}
		Query query=s.createQuery("from Employ");
		query.setFirstResult(5);
		query.setMaxResults(10);
		System.out.println("5 to 10 records \n--------");
		List<Employ> list=query.list();
		for (Employ employ : list) {
			System.out.println("Empno " +employ.getEmpno());
			System.out.println("Name " +employ.getName());
			System.out.println("Dept " +employ.getDept());
			System.out.println("Desig " +employ.getDesig());
			System.out.println("Basic " +employ.getBasic());
			System.out.println("------------------");
		}
		
	q=s.createQuery("select sum(basic) from Employ");
	List<Integer> l1=q.list();
	System.out.println("Sum " +l1.get(0));
	
	q=s.createQuery("select max(basic) from Employ");
	 l1=q.list();
	 System.out.println("Max " +l1.get(0));
			
	 q=s.createQuery("select min(basic) from Employ");
	 l1=q.list();
	 System.out.println("Min " +l1.get(0));	
	 
	 q=s.createQuery("select count(basic) from Employ");
	 l1=q.list();
	 System.out.println("Count " +l1.get(0));
		}
	}
	


