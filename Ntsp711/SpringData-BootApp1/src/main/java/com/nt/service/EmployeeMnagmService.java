package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;

public interface EmployeeMnagmService {
	public int registerEmp(EmployeeDTO dto);
	public List<EmployeeDTO> findEmpByEmail(String email);
	public List<EmployeeDTO>findEmpBetweenNumbers(int start,int end);
	public String addBonus(int id,int bonus);
	public String deleteEmp(int id);
	public List<EmployeeDTO>fetchAllEmps();
}
