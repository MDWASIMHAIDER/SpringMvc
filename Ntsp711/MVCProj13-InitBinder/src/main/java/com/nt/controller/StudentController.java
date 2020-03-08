package com.nt.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;

public class StudentController  extends SimpleFormController{
	/*@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		System.out.println("StudentController.initBinder()");
		SimpleDateFormat sdf=null;
				sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("StudentController.onSubmit()");
		StudentCommand cmd=null;
		cmd=(StudentCommand) command;
		System.out.println(cmd.getName()+" "+cmd.getDob()+" "+cmd.getDoj()+" "+cmd.getDom());
		return new ModelAndView("register","cmdData",cmd);
	}*/
	
	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		SimpleDateFormat sdf=null;
		System.out.println("RegistrationController.initBinder(-,-)");
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true));
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd=null;
		//type casting
		cmd=(StudentCommand)command;
		//create and  return MAV object
		return new ModelAndView("result","cmdData", cmd);
	}

}
