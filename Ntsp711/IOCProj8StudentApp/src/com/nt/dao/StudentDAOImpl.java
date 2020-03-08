package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_NSERT_QUERY="INSERT INTO SP_STUDENT VALUES(?,?,?,?,?)";
		private DataSource ds;
		Connection con;
		PreparedStatement ps;
		public StudentDAOImpl(DataSource ds) {
			this.ds=ds;
			System.out.println("daoImpm 0-param constructor");
		}
	@Override
	public int insert(StudentBO bo) {
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(STUDENT_NSERT_QUERY);
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getsName());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5, bo.getResult());
			int result=ps.executeUpdate();
			return result;
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
