package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmmployeeService {
		public EmployeeDTO findEmpByNum(int no);
		public List<EmployeeDTO> searchEmpByAddress(String desg);
}
