package com.nt.service;

import com.nt.bo.StudentBo;
import com.nt.doa.StudentDao;
import com.nt.dto.StudentDto;

public class StudentServiceImpl implements StudentService {
	StudentDao dao;
	
	public StudentServiceImpl(StudentDao dao) {
		this.dao=dao;
	}

	@Override
	public String generateResult(StudentDto dto) throws Exception {
			float total=0.0f;
			float avg=0.0f;
			String result=null;
			StudentBo bo=null;
			int count=0;
			total=dto.getM1()+dto.getM2()+dto.getM3();
			avg=total/3.0f;
			if(dto.getM1()>=35 && dto.getM2()>=35 && dto.getM3()>=35) 
				result= "PASS";
			else 
				result= "FAIL";
			bo=new StudentBo();
			bo.setSno(dto.getSno());
			bo.setSname(dto.getSname());
			bo.setSadd(dto.getSadd());
			bo.setTotal(total);
			bo.setAvg(avg);
			bo.setResult(result);
			count =dao.insert(bo);
			if(count==0) 
				return "Student Reguistration Failed";
				else
					return "Student Registration Succeeded";
			}
	}
	


