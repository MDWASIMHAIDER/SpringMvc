package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empservice")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	public String saveEmp(EmployeeDTO dto) {
		int count=0;
		EmployeeBO bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.insertEmp(bo);
		if(count==0)
		return "employee not inserted";
		else
			return "employee inserted successfully";
	}

}
