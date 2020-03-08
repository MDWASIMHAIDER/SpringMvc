package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeSrvice;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeSrvice service;
	
	@RequestMapping("/home.htm")
	public String home(Map<String,Object>map,@ModelAttribute("empcmd")EmployeeCommand command) {
		return "home";
	}
	
	@RequestMapping("/show.htm")
	public String launch(Map<String,Object>map,@ModelAttribute("empcmd")EmployeeCommand cmd) {
		EmployeeDTO dto=null;
		dto=new EmployeeDTO();
		String resMsg=null;
		dto.setUname(cmd.getUname());
		dto.setPassword(cmd.getPassword());
		resMsg=service.Authenticate(dto);
		map.put("resMsg",resMsg);
		//return "show";
		return "home";
	}
}
