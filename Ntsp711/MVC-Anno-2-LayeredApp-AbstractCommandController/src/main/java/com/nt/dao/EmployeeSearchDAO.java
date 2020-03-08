package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeSearchBO;

public interface EmployeeSearchDAO{
	public List<EmployeeSearchBO> searchEMp();
	public int insertEmp(EmployeeSearchBO bo);
}
