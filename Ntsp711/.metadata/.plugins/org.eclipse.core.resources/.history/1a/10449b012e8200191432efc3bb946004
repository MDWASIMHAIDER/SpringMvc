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
	EmployeeDAO dao;
	public EmployeeDTO getEmlDetail(int eid) {
		EmployeeBO bo=null;
		EmployeeDTO dto=new EmployeeDTO();
		bo=dao.getEmpDetail(eid);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

}
