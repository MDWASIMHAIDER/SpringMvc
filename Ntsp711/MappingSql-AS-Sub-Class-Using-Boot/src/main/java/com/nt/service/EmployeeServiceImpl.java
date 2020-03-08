package com.nt.service;

import java.util.ArrayList;
import java.util.List;

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
	public List<EmployeeDTO> findEmpByDesg(String desg) {
		List<EmployeeDTO>listdto=new ArrayList();
		List<EmployeeBO>listbo=null;
		listbo=dao.getEmpByDesg(desg);//3rd
		listbo.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		return listdto;
	}
	@Override
	public EmployeeDTO findEmpByEid(int eid) {
		EmployeeBO bo=null;
		EmployeeDTO dto=new EmployeeDTO();
		bo=dao.getEmpByEid(eid);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
	@Override
	public String updateEmpByEid( int eid,String desg) {
		int count=0;
		count=dao.updateEmployee(eid, desg);
		if(count!=0)
			return "Employee Updated successfully";
		else
			return "Employee not found";
	}

}
