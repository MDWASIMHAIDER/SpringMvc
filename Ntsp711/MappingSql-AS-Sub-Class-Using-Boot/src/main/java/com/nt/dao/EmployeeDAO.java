package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO>getEmpByDesg(String desg);
	public  EmployeeBO getEmpByEid(int eid);
	public int updateEmployee(int eid,String desg);
}
