package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegistrationCommand;
import com.nt.dto.RegistrationDTO;
import com.nt.service.RegistrationService;

public class RegistrationController extends AbstractWizardFormController{

	private RegistrationService service;
	
	public RegistrationController(RegistrationService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
	System.out.println("RegistrationController.processFinish()");
	RegistrationCommand cmd=null;
	cmd=(RegistrationCommand) command;
	RegistrationDTO dto=new RegistrationDTO();
	BeanUtils.copyProperties(cmd, dto);
	String resMsg=service.registration(dto);
	System.out.println(resMsg+"======================");
		return new ModelAndView("result","resMsg",resMsg);
}
	/*@Override
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("RegisterController.processFinish()");
		RegistrationCommand cmd=null;
		//type casting
		cmd=(RegistrationCommand)command;
		return new ModelAndView("result","cmdData", cmd);
	}
	*/
	
@Override
protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
		BindException errors) throws Exception {
	System.out.println("RegistrationController.processCancel()");
	return new ModelAndView("welcome");
}

}
