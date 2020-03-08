package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeSearchBO;
import com.nt.dao.EmployeeSearchDAO;
import com.nt.dto.EmployeeSearchDTO;


@Service("service")
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	@Autowired
	private EmployeeSearchDAO dao;
	@Override
	public List<EmployeeSearchDTO> searchEmp() {
		List<EmployeeSearchDTO>listdto=new ArrayList<EmployeeSearchDTO>();
		List<EmployeeSearchBO>listbo=null;
		listbo=dao.searchEMp();
		listbo.forEach(bo->{
			EmployeeSearchDTO dto=new EmployeeSearchDTO();
			dto.setEno(bo.getEno());
			dto.setEname(bo.getEname());
			dto.setDesg(bo.getDesg());
			dto.setDeptno(bo.getDeptno());
			dto.setSalary(bo.getSalary());
			dto.setMgrno(bo.getMgrno());
			listdto.add(dto);
		});
		return listdto;
	}
	@Override
	public String saveEmp(EmployeeSearchDTO dto) {
		int count=0;
		EmployeeSearchBO bo=null;
		bo=new EmployeeSearchBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.insertEmp(bo);
		if(count==0) {
			return "Data Saving Failed";
		}
		else {
			return "Data Saved Successfully";
		}
	}

}
