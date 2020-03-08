package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentServiceImpl;
import com.nt.vo.StudentVO;

public class StudentController {
	
	StudentServiceImpl service;
	public StudentController(StudentServiceImpl service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	public String process(String sno,String name,String m1,String m2,String m3) {
		StudentVO vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(name);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		//convert vo to dto obj
		StudentDTO dto=new StudentDTO();
		dto.setSno((Integer.parseInt(vo.getSno())));
		dto.setName(vo.getSname());
		dto.setM1((Integer.parseInt(vo.getM1())));
		dto.setM2((Integer.parseInt(vo.getM2())));
		dto.setM3((Integer.parseInt(vo.getM3())));
		
		String result=service.generateResult(dto);
		return result;
	}

}
