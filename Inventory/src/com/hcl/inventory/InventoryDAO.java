package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class InventoryDAO {
	Connection connection;
	PreparedStatement pst;
	
	public  int generateOrderId(){
		connection=DaoConnection.getConnection();
		String cmd=" Select CASE WHEN MAX(orderid) IS NULL THEN 1 "+ " ELSE MAX(orderid)+1 END orderid from Orders";
		int orderid=0;
		try {
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		orderid=rs.getInt("orderid");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return orderid;
		}
	
	public String placeOrder(String stockId, int qtyord){
		connection=DaoConnection.getConnection();
		String result="";
		String cmd;
		double bill=0;
		double amt=0;
		Inventory inventory=searchStock(stockId);
		InventoryDAO dao=new InventoryDAO();
		if(stockId!=null){
			int QuantityAvail=inventory.getQuantityAvail();
			if(QuantityAvail-qtyord>0){
				 cmd=" update stock set QuantityAvail=QuantityAvail-? "+" where stockId=? ";
				
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, qtyord);
					pst.setString(2, stockId);
					pst.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				cmd=" Insert into Orders(OrderId,StockID, QtyOrd,billAmt) "+" values(?,?,?,?)";
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1,dao.generateOrderId());
					pst.setString(2, stockId);
					pst.setInt(3,qtyord);
					 bill=inventory.getPrice()*qtyord;
					pst.setDouble(4,bill);
					pst.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				result="order placed sucessfully";
			}
		
			else{
				System.out.println("no avail qty");
			}
		}
			else{
				System.out.println("wrong id");
			}
		cmd=" Insert into Amount(Gamt) "+" values(?)";
		try {
			pst=connection.prepareStatement(cmd);
			 amt=amt+bill;
			 pst.setDouble(1,amt);
			 pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return result;
	}
	public Inventory searchStock(String stockId){
		connection=DaoConnection.getConnection();
		Inventory inventory=null;
		String cmd=" select * from stock where stockid=? ";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setString(1, stockId);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				inventory=new Inventory();
				inventory.setItemName(rs.getString("itemName"));
				inventory.setPrice(rs.getDouble("price"));
				inventory.setQuantityAvail(rs.getInt("quantityAvail"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inventory;
	}
	public String addStock(Inventory inventory){
		connection=DaoConnection.getConnection();
		String cmd=" insert into stock(stockid,ItemName,Price,QuantityAvail) "+" values(?,?,?,?) ";
	    String result="";
	    try {
			pst=connection.prepareStatement(cmd);
			pst.setString(1,inventory.getStockid());
			pst.setString(2, inventory.getItemName());
			pst.setDouble(3, inventory.getPrice());
			pst.setInt(4, inventory.getQuantityAvail());
			pst.executeUpdate();
			result="stock added successfully ";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return result;
	}
	public String generateStockId() {
		
		connection=DaoConnection.getConnection();
		String cmd="select case when max(stockid) IS NULL THEN 'S000' ELSE "
				+ " MAX(StockID) end sid from Stock";
		String stockId="";
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stockId=rs.getString("sid");
			int sid=Integer.parseInt(stockId.substring(1));
			sid++;
			if(sid >= 1 && sid <= 9) {
				stockId="S00"+sid;
			}
			if(sid >= 10 && sid <= 99) {
				stockId="S0" +sid;
			}
			if(sid >= 100 && sid <= 999) {
				stockId="S"+sid;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockId;
	}

}
