package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		int Empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No ");
		Empno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			String cmd="select * from Employ where Empno=?";
            PreparedStatement pst=con.prepareStatement(cmd);
            pst.setInt(1, Empno);
            ResultSet rs=pst.executeQuery();
            if(rs.next()) {
            	System.out.println("Employ No "+rs.getInt("Empno"));
				System.out.println("name "+rs.getString("name"));
				System.out.println("Department " +rs.getString("dept"));
				System.out.println("Designation " +rs.getString("desig"));
				System.out.println("Salary " +rs.getString("basic"));
				System.out.println("------------------------");
            }
            else
            {
            	System.out.println("record not found...");
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
