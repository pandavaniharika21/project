package com.hcl.dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DepartmentDao {
	public void searchDepartment(int Deptno) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="select * from Department WHERE Deptno=?";
		List dept=null;
		dept=jt.query(cmd,new Object[]{Deptno},new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("Deptno") + "-----"+
			             rs.getString("Deptname") + "-----" +
			             rs.getString("Loc") + "-----" +
			             rs.getString("City") + "-----" +
			             rs.getString("head");
				return res;	
		
	}
		});
		for (Object object : dept) {
			System.out.println(object);
		}
	}
	public void showDepartment() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="select * from Department";
		List dept=null;
		dept=jt.query(cmd, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("Deptno") + "-----"+
			             rs.getString("Deptname") + "-----" +
			             rs.getString("Loc") + "-----" +
			             rs.getString("city") + "-----" +
			             rs.getString("head");
				return res;
			}		
	});
		for (Object object : dept) {
			System.out.println(object);
			
		}
			
		}

	
}



