package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> findEmpByDesg(String desg);
	public EmployeeDTO findEmpByEid(int eid);
	public String updateEmpByEid(int eid,String desg);
}
