package com.nt.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBo;

public class StudentDaoIml implements StudentDao {
	private static final String INSERT_QUERY="INSERT INTO STUDENT_DETAILS VALUES(?,?,?,?,?,?)";
	DataSource ds;
	public StudentDaoIml(DataSource ds) {
		this.ds=ds;
	}

	@Override
	public int insert(StudentBo bo) throws Exception {
		int cnt=0;
		Connection con=null;
		PreparedStatement ps=null;
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setString(3,bo.getSadd());
		ps.setFloat(4, bo.getTotal());
		ps.setFloat(5, bo.getAvg());
		ps.setString(6, bo.getResult());
	    cnt=ps.executeUpdate();
		return cnt;
	}

}
