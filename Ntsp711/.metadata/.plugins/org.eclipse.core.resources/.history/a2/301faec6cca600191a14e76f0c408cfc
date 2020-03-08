package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.EmployeeSearchCommand;
import com.nt.dto.EmployeeSearchDTO;
import com.nt.dto.EmployeeSearchResultDTO;
import com.nt.service.EmployeeSearchService;

public class EmployeeSearchController  extends AbstractCommandController{
	
	private EmployeeSearchService service;
	
	public void setService(EmployeeSearchService service) {
		this.service=service;
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException be) throws Exception {
		EmployeeSearchCommand escmd=(EmployeeSearchCommand) cmd;
		//convert cmd obj to into dto obj
		EmployeeSearchDTO dto=new EmployeeSearchDTO();
		dto.setEno(escmd.getNo());
		dto.setEname(escmd.getName());
		dto.setDesg(escmd.getDesg());
		dto.setSalary(escmd.getSalary());
		List<EmployeeSearchResultDTO> listdto=service.process(dto);
		return new ModelAndView("listEmps","searchResult",listdto);
	}

}
