package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeSearchBO;

import com.nt.dao.EmployeeSearchDAO;
import com.nt.dto.EmployeeSearchDTO;

@Service("service")
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	@Autowired
	private EmployeeSearchDAO dao;
	
	public EmployeeSearchServiceImpl() {
		System.out.println("service 0-param constructor");
	}
	
	public void setDao(EmployeeSearchDAO dao) {
		this.dao=dao;
	}

	public String process(EmployeeSearchDTO edto) {
		EmployeeSearchBO bo=null;
		bo=new EmployeeSearchBO();
	//	bo.setEno(edto.getEno());
		bo.setEname(edto.getEname());
		bo.setDesg(edto.getDesg());
		bo.setSalary(edto.getSalary());
		bo.setDeptno(edto.getDeptno());
		bo.setMgrno(edto.getMgrno());
		String result=dao.insert(bo);
		return result;
	}

}
