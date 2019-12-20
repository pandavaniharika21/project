package com.hcl.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("student.xml");
		Faculty f=(Faculty)ctx.getBean("faculty");
		f.teaching();
	}

}


