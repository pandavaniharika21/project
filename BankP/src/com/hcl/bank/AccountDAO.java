package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String withdrawAccount(int accountNo,int withdrawAmount) {
		connection=DaoConnection.getConnection();
		String result="";
		Accounts account=searchAccount(accountNo);
		if(account!=null) {
			int amount=account.getAmount();
			if(amount-withdrawAmount >=1000) {
				String cmd=" update Accounts set Amount=Amount-?  "
						+ " WHERE AccountNo=? " ;
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd="Insert into Trans(AccountNO,TransAmount,"
							+ "TransType) values(?,?,?) ";
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setInt(2, withdrawAmount);
					pst.setString(3, "D");
					pst.executeUpdate();
					result="Amount Debited.... ";
							
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
			}
			else
			{
				result="Insufficient funds...";
			}
		}
		else
		{
			result="AccountNo not found......";
		}
		return result;
		
		
		
	}
	
	public String depositAccount(int accountNo,int depositAmount) {
		connection=DaoConnection.getConnection();
		String result="";
		String cmd=" update Accounts set Amount=Amount+?  "
				+ " WHERE AccountNo=? " ;
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, depositAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd="Insert into Trans(AccountNO,TransAmount,"
							+ "TransType) values(?,?,?) ";
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setInt(2, depositAmount);
					pst.setString(3, "c");
					pst.executeUpdate();
					result="amount credited ";
							
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return result;
	}
	
	public String closeAccount(int accountNo) {
		connection=DaoConnection.getConnection();
		String result="";
		String cmd="update Accounts set Status='inactive' "
				+ "WHERE AccountNo=?";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result="Account closed....";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return result;
		
		
	}
	
	public String updateAccount(int accountNo, String city,String state) {
		connection=DaoConnection.getConnection();
		String result="";
		String cmd="update Accounts set City=?,State=? "
				+ " WHERE AccountNo=? ";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setString(1,  city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			result="account updated...";
			
			
		} catch (SQLException e) {
			result=e.getMessage();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public Accounts searchAccount(int accountNo) {
		Accounts account=null;
		String cmd=" select * from Accounts where AccountNo=?";
		connection=DaoConnection.getConnection();
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1,accountNo);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				account=new Accounts();
				account.setFirstName(rs.getString("firstName"));
				account.setLastName(rs.getString("lastName"));
				account.setCity(rs.getString("city"));
				account.setState(rs.getString("state"));
				account.setAmount(rs.getInt("amount"));
				account.setCheqFacil(rs.getString("cheqFacil"));
				account.setAccountType(rs.getString("accountType"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
		
	}
	
	public String createAccount(Accounts account) {
		connection=DaoConnection.getConnection();
		String cmd="insert into Accounts(AccountNO,FirstName, "
			+ " LastName,City,State,Amount,CheqFacil, "
			+ "	AccountType) values(?,?,?,?,?,?,?,?) ";
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1,account.getAccountNo());
			pst.setString(2, account.getFirstName());
			pst.setString(3, account.getLastName());
			pst.setString(4, account.getCity());
			pst.setString(5, account.getState());
			pst.setInt(6, account.getAmount());
			pst.setString(7, account.getCheqFacil());
			pst.setString(8, account.getAccountType());
			pst.executeUpdate();
			result="Account Created SUccessfully.."
					+account.getAccountNo();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}
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
