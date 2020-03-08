package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeSearchBO;

public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
	
	private static final String EMP_INSERT_QUERY="INSERT INTO MVC_LAYERED_EMPLOYEE VALUES(?,?,?,?,?,?)";
	
	private JdbcTemplate jt;
	
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	public String insert(EmployeeSearchBO ebbo) {
		int count=0;
		count=jt.update(EMP_INSERT_QUERY,ebbo.getEno(),ebbo.getEname(),ebbo.getDesg(),ebbo.getSalary(),ebbo.getDeptno(),ebbo.getMgrno());
		if(count==0)
			return "problem occured";
		else
			return "registration successfull";
	}
}

