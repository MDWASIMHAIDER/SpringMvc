package com.nt.controller;

import com.nt.dto.StudentDto;
import com.nt.service.StudentServiceImpl;
import com.nt.vo.StudentVo;

public class MainController {
	
	StudentServiceImpl service;
	public MainController(StudentServiceImpl service) {
		this.service=service;
	}
	public String processResult(StudentVo vo)throws Exception {
		StudentDto dto=null;
		String result=null;
		dto=new StudentDto();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		result=service.generateResult(dto);
		return result;
	}

}
