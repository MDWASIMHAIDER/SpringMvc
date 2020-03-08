package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
	
	private static final String  DEPOSITE_QUERY="UPDATE BANK_TRANSACTION SET BALANCE=BALANCE+?  WHERE ACNO=? ";
	private static final String  WITHDRAW_QUERY="UPDATE BANK_TRANSACTION SET BALANCE=BALANCE-?  WHERE ACNO=? ";
	
	private JdbcTemplate jt;
	
	public BankDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int withdraw(int amt, int acNo) {
		int count=jt.update(WITHDRAW_QUERY,amt,acNo);
		return count;
	}

	@Override
	public int deposite(int amt, int acNo) {
		int count=jt.update(DEPOSITE_QUERY,amt,acNo);
		return count;
	}

}
