package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.EmployeeSearchCommand;
import com.nt.dto.EmployeeSearchDTO;
import com.nt.service.EmployeeSearchService;

@Controller
public class EmployeeSearchController{

	@Autowired
	private EmployeeSearchService service;
	
	@RequestMapping("/home.htm")
    public   String showHome() {
  	  return "search";
    }
	
	@RequestMapping("/search.htm")
	public String Submit(Map<String,Object>map,@ModelAttribute("command") EmployeeSearchCommand empcmd) throws Exception {
		EmployeeSearchDTO dto=new EmployeeSearchDTO();
		//dto.setEno(cmd.getEno());
	/*	dto.setEname(cmd.getEname());
		dto.setDesg(cmd.getDesg());
		dto.setDeptno(cmd.getDeptno());
		dto.setSalary(cmd.getSalary());
		dto.setMgrno(cmd.getMgrno());*/
		BeanUtils.copyProperties(empcmd, dto);
		String result=service.process(dto);
		map.put("resmsg", result);
		return "listEmps";
	}
	
}
