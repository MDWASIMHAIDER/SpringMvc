package com.nt.service;

public class PayrollService {
	
	public String generateSalary(int eid,float basicSalary,boolean variablePay ) {
		float grossSalary=0.0f;
		float netSalary=0.0f;
		float vp=0.0f;
		if(variablePay)
			vp=basicSalary*0.1f;
		grossSalary=basicSalary+(basicSalary*0.4f);
		netSalary=grossSalary-(grossSalary*0.2f)+vp;
		return eid+" basic salary "+basicSalary+" grossSalary "+grossSalary+" netSalary "+netSalary+" varpay "+vp;
	}
	public String getDesg(int eid) {
		if(eid>=1000 && eid<=1999)
			return "sse";
		else 
			return "se";
	}
}
