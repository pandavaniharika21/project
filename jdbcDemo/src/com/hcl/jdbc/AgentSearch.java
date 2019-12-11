package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {
	public static void main(String[] args) {
		int AgentID;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Agent id ");
		AgentID=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			String cmd="select * from Agent where AgentID=?";
            PreparedStatement pst=con.prepareStatement(cmd);
            pst.setInt(1,AgentID);
            ResultSet rs=pst.executeQuery();
            if(rs.next()) {
            	System.out.println("AgentID "+rs.getInt("AgentID"));
            	System.out.println("FirstName "+rs.getString("FirstName"));
				System.out.println("MI "+rs.getString("MI"));
				System.out.println("LastName " +rs.getString("LastName"));
				System.out.println("Gender " +rs.getString("Gender"));
				System.out.println("Address1 " +rs.getString("Address1"));
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
