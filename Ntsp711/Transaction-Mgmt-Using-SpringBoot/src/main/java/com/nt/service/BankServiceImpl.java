package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;
//@Service("service")
@Component("service")
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDAO dao;
	
	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,transactionManager="dstm")
	public boolean transferMoney(int srcAcno, int destAcno, int amt) throws Exception {
		int res1=dao.withdraw(amt, srcAcno);
		int res2=dao.deposite(amt, destAcno);
		if(res1==0 || res2==0) {
			System.out.println(" Transaction roll back");
		//	throw new RuntimeException();
			throw new RuntimeException();
			
		}
		else {
			System.out.println("Money transfer success");
			return true;
		}
	}

}
