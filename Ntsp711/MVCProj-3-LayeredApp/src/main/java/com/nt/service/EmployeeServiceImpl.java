package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	public List<EmployeeDTO> fetchAllEmployee() {
		List<EmployeeBO> listbo=null;
		List<EmployeeDTO> listdto=listdto=new ArrayList();
		listbo=dao.getAllEmployee();
		EmployeeDTO dto=null;
		for(EmployeeBO bo:listbo) {
			 dto=new EmployeeDTO();
			 BeanUtils.copyProperties(bo, dto);
			// dto.setSno(listDTO.size()+1);
			 listdto.add(dto);
		}
		
		return listdto;
	}

}
