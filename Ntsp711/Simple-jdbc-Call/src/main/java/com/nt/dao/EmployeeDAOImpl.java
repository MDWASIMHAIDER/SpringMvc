package com.nt.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empdao")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	SimpleJdbcCall sjc;
	public EmployeeBO getEmpDetail(int eid) {
		sjc.setProcedureName("p_get_emp_By_eid");
		Map<String,Object>inparam=null;
		inparam=new HashMap();
		Map<String,Object>outparam=null;
		inparam.put("no", eid);
		outparam=sjc.execute(inparam);
		System.out.println(outparam);
		EmployeeBO bo=new EmployeeBO();
	  //  bo.setEid((Integer) outparam.get("EID"));
		bo.setEname((String)outparam.get("ENAME"));
		bo.setDesg((String) outparam.get("DESG"));
	//	bo.setSalary( (Float) outparam.get("SALARY"));
		return bo;
	}

}
