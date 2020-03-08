package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.EmployeeSearchCommand;
import com.nt.dto.EmployeeSearchDTO;
import com.nt.service.EmployeeSearchService;
import com.nt.service.EmployeeSearchServiceImpl;

public class EmployeeSearchController  extends SimpleFormController{

	private EmployeeSearchService service;
	
	public EmployeeSearchService getService() {
		return service;
	}

	public void setService(EmployeeSearchService service) {
		this.service = service;
	}


	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException err) throws Exception {
		EmployeeSearchCommand cmd=(EmployeeSearchCommand)command;	
		EmployeeSearchDTO dto=new EmployeeSearchDTO();
		dto.setEno(cmd.getEno());
		dto.setEname(cmd.getEname());
		dto.setDesg(cmd.getDesg());
		dto.setDeptno(cmd.getDeptno());
		dto.setSalary(cmd.getSalary());
		dto.setMgrno(cmd.getMgrno());
		String result=service.process(dto);
		
		return new ModelAndView(this.getSuccessView(),"resmsg",result);
	}
	
}
