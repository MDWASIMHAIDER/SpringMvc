package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.LoginBO;
@Repository("dao")
public class LoginDAOImpl implements LoginDAO {
	private static final String AUTHENTICATE_QUERY="SELECT COUNT(*) FROM USER_MVC WHERE UNAME=? And PASSWORD=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int authenticate(LoginBO bo) {
		int count=0;
		count=jt.queryForObject(AUTHENTICATE_QUERY,Integer.class, bo.getUname(),bo.getPassword());
		return count;
	}

}
