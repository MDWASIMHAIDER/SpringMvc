package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("wdao")
public class WithdrawDAOImpl implements WithdrawDAO {
	private static final String QUERY_WITHDRAW="UPDATE BANK_TRANSACTION SET BALANCE=BALANCE-? WHERE ACNO=?";
	@Autowired
	@Qualifier("template2")
	private JdbcTemplate jt;
	
	@Override
	public int withdraw(int acNo, int amt) {
		int count=0;
		count=jt.update(QUERY_WITHDRAW);
		
			return count;
		}
	}


