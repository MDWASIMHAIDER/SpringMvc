package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.LoginCommand;
import com.nt.dto.LoginDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	@GetMapping("/home.htm")
	public String showHome(@ModelAttribute("logincmd") LoginCommand cmd) {
		return "login_form";
	}
		@RequestMapping(value="/loginresult.htm",method=RequestMethod.POST)
	//@PostMapping("/loginresult.htm")
	public String showResult(Map<String,Object>map,@ModelAttribute("logincmd") LoginCommand command,BindingResult result) {
		String resMsg=null;
		LoginDTO dto=null;
		dto=new LoginDTO();
		BeanUtils.copyProperties(command, dto);
		resMsg=service.LoginAuthentication(dto);
		map.put("resMsg", resMsg);
		return "login_form";
	}
	
}
