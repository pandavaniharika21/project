package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			System.out.println("connected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * From Employ");
			while(rs.next()) {
				System.out.println("Employ No "+rs.getInt("empno"));
				System.out.println("name "+rs.getString("name"));
				System.out.println("Department " +rs.getString("dept"));
				System.out.println("Designation " +rs.getString("desig"));
				System.out.println("Salary " +rs.getString("basic"));
				System.out.println("------------------------");
			}
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
