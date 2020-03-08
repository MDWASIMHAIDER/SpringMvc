package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.nt.dao.DeptDAO;

@Service("service")
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDAO  dao;
	public int getDepartmentCount() {
		int count =0;
		count=dao.getDeptCount();
		return count;
	}

}
