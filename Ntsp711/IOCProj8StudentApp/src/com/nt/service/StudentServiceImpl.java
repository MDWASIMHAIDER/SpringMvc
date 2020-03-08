package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;
	public StudentServiceImpl(StudentDAO dao) {
		this.dao=dao;
		System.out.println("serviceimpl 0-param constructor");
	}
	
	@Override
	public String generateResult(StudentDTO dto) {
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		//float avg=(float)(dto.getM1()+dto.getM2()+dto.getM3())/3;
		float avg=(float)total/3;
		String result=null;
		if(avg>35) {
			result="pass";
		}
		else {
			result="fail";
		}
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setsName(dto.getsName());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		int cnt=dao.insert(bo);
		if(cnt==0) {
			return "result"+bo.getResult()+" "+bo.getSno()+" Registration failed";
		}
		else {
			return "result "+bo.getResult()+" "+bo.getSno()+" Registration successed";
		}
	}

}
