package com.nt.controller;

import java.util.Calendar;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.exception.CustomException;

@ControllerAdvice
@Controller
public class WishController {
	
	@RequestMapping("/home.htm")
	public String showHome(Map<String,Object>map,Exception e) {
		Calendar calendar=null;
		int hour=0;
		String msg=null;
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			msg= "Good Morning "; 
		}
		else if( hour>=12 && hour<=16 ) {
			msg= "Good AfterNoon ";
		}
		else if(hour<=20) {
			msg= "Good Evening ";
			throw new CustomException("err", "CustomException");
		}
		else {
			msg= "Good Night";
		}
		map.put("msg",msg);
		
		return "home";
	}
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView showError(CustomException e) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("errstatus",e.getMessage());
		mav.addObject("msg", e.getMessage());
		mav.setViewName("err_page");
		return mav;
	}

}
