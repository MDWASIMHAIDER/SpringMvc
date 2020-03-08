package com.nt.service;

import java.sql.SQLException;

import com.nt.dao.BankDAO;

public class BankService {
	private BankDAO dao;

	public BankService(BankDAO dao) {
		this.dao = dao;
	}
	public boolean transferMoney(int srcAcno,int destAcno,int amt) throws Exception {
		int result1=dao.withdraw(amt,srcAcno);
		System.out.println(result1);
		int result2=dao.deposite(destAcno, amt);
		System.out.println(result2);
		if(result1==0 || result2==0) {
			throw new IllegalAccessException("money not transfered tx rolled back");
		}
		else {
			System.out.println("money transfered successfully");
			return true;
		}
	}
	
}
