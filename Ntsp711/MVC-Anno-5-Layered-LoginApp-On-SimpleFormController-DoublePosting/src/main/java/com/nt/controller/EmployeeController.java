package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeSrvice;
import com.nt.validator.FormValidator;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeSrvice service;
	@Autowired
	private FormValidator validator;
	@RequestMapping("/home.htm")
	public String home(Map<String,Object>map,@ModelAttribute("empcmd")EmployeeCommand command) {
		return "home";
	}
	
	@RequestMapping("/show.htm")
	public String launch(Map<String,Object>map,@ModelAttribute("empcmd")EmployeeCommand cmd,Errors err) {
		EmployeeDTO dto=null;
		dto=new EmployeeDTO();
		String resMsg=null;
		dto.setUname(cmd.getUname());
		dto.setPassword(cmd.getPassword());
		if(validator.supports(EmployeeCommand.class)) {
			validator.validate(cmd, err);
			if(err.hasErrors()) {
				return "home";
			}
		}
		resMsg=service.Authenticate(dto);
		map.put("resMsg",resMsg);
		//return "show";
		return "home";
	}
	
	
/*	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String validateForm(Map<String,Object>map,@ModelAttribute("empcmd")EmployeeCommand cmd,Errors err) {
		EmployeeDTO dto=null;
		dto=new EmployeeDTO();
		dto.setUname(cmd.getUname());
		dto.setPassword(cmd.getPassword());
		if(validator.supports(EmployeeCommand.class)) {
			validator.validate(cmd, err);
			if(err.hasErrors()) {
				return "home";
			}
		}
		String res=service.Authenticate(dto);
		map.put("res",res);
		return "home";
	}
*/	
}
