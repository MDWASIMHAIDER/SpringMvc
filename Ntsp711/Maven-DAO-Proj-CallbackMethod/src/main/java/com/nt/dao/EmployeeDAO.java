package com.nt.dao;

import java.util.List;
import java.util.Map;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public EmployeeBO findEmpByNo(int no);
	public List<EmployeeBO> findEmpByAddress(String desg);
}
