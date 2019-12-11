package com.hcl.bankproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	Connection connection;
	PreparedStatement pst;
	public int generateAccountNo() {
		connection=DaoConnection.getConnection();
		String cmd=" select case when max(AccountNo) IS NULL " 
				+ " THEN 1 ELSE max(AccountNo)+1 END "
				+ " AccountNo from Accounts " ;
		int AccountNo=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			AccountNo=rs.getInt("AccountNo");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return AccountNo;

	}

}
