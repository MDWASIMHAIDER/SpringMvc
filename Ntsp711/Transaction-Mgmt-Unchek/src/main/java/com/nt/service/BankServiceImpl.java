package com.nt.service;

import java.sql.SQLException;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	
	private BankDAO dao;
	
	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferMoney(int srcAcno, int destAcno, int amt) throws Exception {
		int res1=dao.withdraw(amt, srcAcno);
		int res2=dao.deposite(amt, destAcno);
		if(res1==0 || res2==0) {
			System.out.println(" Transaction roll back");
			throw new RuntimeException();
			//throw new SQLException();
			
		}
		else {
			System.out.println("Money transfer success");
			return true;
		}
	}

}
