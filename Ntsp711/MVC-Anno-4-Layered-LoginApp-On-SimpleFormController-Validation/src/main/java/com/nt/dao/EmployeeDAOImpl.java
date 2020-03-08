package com.nt.dao;

import java.util.Calendar;

import org.aspectj.weaver.ast.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("dao")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jt;
	private static final String AUTHENTICATE_USER="SELECT COUNT(*) FROM USER_MVC WHERE UNAME=? AND PASSWORD=?";
	@Override
	public int validate(EmployeeBO bo) {
		int count=0;
		count=jt.queryForObject(AUTHENTICATE_USER, Integer.class,bo.getUname(),bo.getPassword());
		return count;
	}

}
