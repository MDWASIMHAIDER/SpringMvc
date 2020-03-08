package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeSearchDTO;

public interface EmployeeSearchService {
	public List<EmployeeSearchDTO> searchEmp();
	public String saveEmp(EmployeeSearchDTO dto);
}
