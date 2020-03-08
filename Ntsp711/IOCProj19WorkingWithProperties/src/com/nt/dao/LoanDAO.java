package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class LoanDAO {

	private static final String INSERT_QUERY="INSERT INTO CUSTOMER_LOAN VALUES(?,?,?,?)";
	private DataSource ds=null;
	public void setDs(DataSource ds) {
		this.ds=ds;
	}
	public int insert(CustomerBO bo) {
		Connection con=null;
		PreparedStatement ps=null;
		int res=0;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setInt(1, bo.getCno());
			ps.setString(2, bo.getCname());
			ps.setFloat(3, bo.getIntramt());
			ps.setFloat(4, bo.getPamt());
			res=ps.executeUpdate();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		return res;
	}
	
}
