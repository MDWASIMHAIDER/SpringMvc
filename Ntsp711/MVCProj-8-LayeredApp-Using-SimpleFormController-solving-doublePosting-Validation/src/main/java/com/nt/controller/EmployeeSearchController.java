package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.EmployeeSearchCommand;
import com.nt.dto.EmployeeSearchDTO;
import com.nt.service.EmployeeSearchService;
import com.nt.service.EmployeeSearchServiceImpl;
import com.nt.validator.EmployeeVlidator;

public class EmployeeSearchController  extends SimpleFormController{

	private EmployeeSearchService service;
	
	public EmployeeSearchService getService() {
		return service;
	}

	public void setService(EmployeeSearchService service) {
		this.service = service;
	}


	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("dblpost");
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException err) throws Exception {
		EmployeeSearchCommand cmd=(EmployeeSearchCommand)command;	
		EmployeeSearchDTO dto=new EmployeeSearchDTO();
	/*	setCommandName("empcmd");//like this we can add all controller configs using code
		setFormView("search");here emcmd is mapped with command class property 
		setSuccessView("listEmps");
		//with search form property and they must matched each other
		setCommandClass(EmployeeSearchCommand.class);
		setSessionForm(true);*/
		
		dto.setEno(cmd.getEno());
		dto.setEname(cmd.getEname());
		dto.setDesg(cmd.getDesg());
		dto.setDeptno(cmd.getDeptno());
		dto.setSalary(cmd.getSalary());
		dto.setMgrno(cmd.getMgrno());
		String result=service.process(dto);
		//System.out.println(this.getSuccessView()+" controller,,,,,,,,,,,,,,");
		return new ModelAndView(this.getSuccessView(),"resmsg",result);
	}
	
}
