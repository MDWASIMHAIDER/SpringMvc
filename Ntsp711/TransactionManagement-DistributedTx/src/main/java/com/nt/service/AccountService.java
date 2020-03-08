package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("service")
public class AccountService {
	@Autowired
	private DepositeDAO  depoDao;
	@Autowired
	private WithdrawDAO withDao;
	
	
		@Transactional(propagation=Propagation.REQUIRED,transactionManager="jtaTxMgmr")
	public String transferMoney(int srcAcno ,int destAcno,int amt) {
		int count1=0;
		int count2=0;
		count1=withDao.withdraw(srcAcno, amt);
		count2=depoDao.deposite(destAcno, amt);
		if(count1==0 || count2==0)
			throw new RuntimeException("Money not transfered");
		return   amt +"  amount  is transffered from "+srcAcno+"  to  dest Account  "+destAcno;
	

	}
	
	
}
