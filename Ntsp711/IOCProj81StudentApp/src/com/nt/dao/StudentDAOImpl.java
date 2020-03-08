package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO{
	DataSource ds;
	private static final String INSERT_QUERY="INSERT INTO SP_STUDENT VALUES(?,?,?,?,?)";
	public StudentDAOImpl(DataSource ds) {
		this.ds=ds;
		System.out.println("AO 0-param constructor");
	}

	@Override
	public int insert(StudentBO bo) {
		try {
			Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
			ps.setInt(1,bo.getSno());
			ps.setString(2, bo.getName());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5, bo.getResult());
			int cnt=ps.executeUpdate();
			return cnt;
		}
		catch(SQLException se) {
			return 0;
		}
		catch(Exception e) {
			return 0;
		}
	}
	}
