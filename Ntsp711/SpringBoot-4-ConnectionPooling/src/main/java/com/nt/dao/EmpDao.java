package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmpDao {
	public int getCount();
	public List<EmployeeBO> getEmpDetailByDesg(String desg);
}
