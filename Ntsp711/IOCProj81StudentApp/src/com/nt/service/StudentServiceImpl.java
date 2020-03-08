package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	StudentDAO dao;
	public StudentServiceImpl(StudentDAO dao) {
		this.dao=dao;
		
	}

	@Override
	public String generateResult(StudentDTO dto) {
		StudentBO bo=new StudentBO();
		int sno=dto.getSno();
		String name=dto.getName();
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=(float)total/3;
		String result=null;
		if(avg>35) {
			result="pass";
		}
		else {
			result="fail";
		}
		bo.setSno(sno);
		bo.setName(name);
		bo.setResult(result);
		bo.setAvg(avg);
		bo.setTotal(total);
		int cnt=dao.insert(bo);
		if(cnt==0) {
			return "registration failed";
		}
		else {
			
			return "registration successed";
		}
		
	}

	}
