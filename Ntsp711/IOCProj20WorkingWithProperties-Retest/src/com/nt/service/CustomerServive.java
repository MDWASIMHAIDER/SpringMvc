package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;

public class CustomerServive {

	CustomerDAO dao;
	public CustomerServive(CustomerDAO dao) {
		this.dao=dao;
	}
	public float calculateInterestAmount(int cno,String cname,float pamt,float rate,float time) {
				float intrestamount=(pamt*rate*time)/100;
				CustomerBO bo=new CustomerBO();
				bo.setCno(cno);
				bo.setCname(cname);
				bo.setPamt(pamt);
				bo.setIntrestamount(intrestamount);
				int res=dao.insert(bo);
	        	return intrestamount;
	}

}
