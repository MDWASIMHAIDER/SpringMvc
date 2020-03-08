package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAO {

	private static final String INSERT_QUERY="INSERT INTO CUSTOMER_LOAN VALUES(?,?,?,?)";
	DataSource ds;
	public CustomerDAO(DataSource ds) {
		this.ds=ds;
	}
	public int insert(CustomerBO bo) {
		int res=0;

		try {
			Connection con=ds.getConnection();
			PreparedStatement ps=null;
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setInt(1, bo.getCno());
			ps.setString(2, bo.getCname());
			ps.setFloat(3, bo.getIntrestamount());
			ps.setFloat(4, bo.getPamt());
			
		 res=ps.executeUpdate();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
