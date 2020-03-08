package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.ScientistCommand;
import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistService;

public class ScientistInsertController extends SimpleFormController{
	private ScientistService service;

	public ScientistInsertController(ScientistService service) {
		this.service = service;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ScientistCommand cmd=(ScientistCommand) command;
		String resMsg=null;
		ScientistDTO dto=null;
		List<ScientistDTO>listdto=null;
		ModelAndView mav=null;
		mav=new ModelAndView();
		dto=new ScientistDTO();
		BeanUtils.copyProperties(cmd, dto);
		resMsg=service.addScientist(dto);
		listdto=service.fetchAllScientist();
		mav.addObject("resMsg", resMsg);
		mav.addObject("listdto",listdto);
		mav.setViewName(getSuccessView());
		return mav;
		
	}
	
}
