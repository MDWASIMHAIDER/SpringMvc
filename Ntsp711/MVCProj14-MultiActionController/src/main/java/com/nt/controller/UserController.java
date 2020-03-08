package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.UserCommand;

public class UserController extends MultiActionController{
	
	public ModelAndView register(HttpServletRequest req,HttpServletResponse res,UserCommand command) {
		ModelAndView mav=null;
		mav=new ModelAndView();
		mav.addObject("data",command);//model
		mav.addObject("operation", "add");//for showing which operation called individually
		mav.setViewName("form_detail");//logical view name
		return mav;
	}
	
	public ModelAndView modify(HttpServletRequest req,HttpServletResponse res,UserCommand command) {
		ModelAndView mav=null;
		mav=new ModelAndView();
		mav.addObject("data",command);//model
		mav.addObject("operation", "modify");//for showing which operation called individually
		mav.setViewName("form_detail");//logical view name
		return mav;
	}
	
	public ModelAndView remove(HttpServletRequest req,HttpServletResponse res,UserCommand command) {
		ModelAndView mav=null;
		mav=new ModelAndView();
		mav.addObject("data",command);//model
		mav.addObject("operation", "remove");//for showing which operation called individually
		mav.setViewName("form_detail");//logical view name
		return mav;
	}
	
	public ModelAndView display(HttpServletRequest req,HttpServletResponse res,UserCommand command) {
		ModelAndView mav=null;
		mav=new ModelAndView();
		mav.addObject("data",command);//model
		mav.addObject("operation", "display");//for showing which operation called individually
		mav.setViewName("form_detail");//logical view name
		return mav;
	}
}
