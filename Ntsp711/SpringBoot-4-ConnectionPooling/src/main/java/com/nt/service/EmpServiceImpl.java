package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmpDao;
import com.nt.dto.EmployeeDTO;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
@Named("serviceimpl")
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpDao dao;
	@Override
	public int findEmpCount() {
		int count=0;
		count=dao.getCount();
		return count;
	}

	@Override
	public List<EmployeeDTO> findEmployeesByDesg(String desg) {
		List<EmployeeDTO> listdto=null;
		List<EmployeeBO> listbo=null;
		EmployeeDTO dto=null;
		//use dao
		listbo=dao.getEmpDetailByDesg(desg);
		//copy listbo to listdto
		listdto=new ArrayList();
		for(EmployeeBO bo:listbo) {
			dto= new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		}
		return listdto;
	}

}
