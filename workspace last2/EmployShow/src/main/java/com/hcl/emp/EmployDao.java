package com.hcl.emp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployDao {
	public void searchEmploy(int empno) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="select * from Employ WHERE Empno=?";
		List emp=null;
		emp=jt.query(cmd,new Object[]{empno},new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("empno") + "-----"+
			             rs.getString("name") + "-----" +
			             rs.getString("dept") + "-----" +
			             rs.getString("desig") + "-----" +
			             rs.getInt("basic");
				return res;	
		
	}
		});
		for (Object object : emp) {
			System.out.println(object);
			
		}
	}
	public void showEmploy() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="select * from Employ";
		List emp=null;
		emp=jt.query(cmd, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("empno") + "-----"+
			             rs.getString("name") + "-----" +
			             rs.getString("dept") + "-----" +
			             rs.getString("desig") + "-----" +
			             rs.getInt("basic");
				return res;
			}		
	});
		for (Object object : emp) {
			System.out.println(object);
			
		}

	}
}
