package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.LoanDAO;

public class LoanService {
	LoanDAO dao;
	public LoanService(LoanDAO dao) {
		this.dao=dao;
	}
		public float[] calclnrAmount(int cno,String cname,float pamt,float rate,float time) {
		
			float[] ret=new float[3];
		float inramt=(pamt*rate*time)/100;
		CustomerBO bo=new CustomerBO();
		bo.setCname(cname);
		bo.setCno(cno);
		bo.setIntramt(inramt);
		bo.setPamt(pamt);
		int res=dao.insert(bo);
		ret[0]=res;
		ret[1]=inramt;
		//return new float={res,inramt};
		return ret;
	}

}
