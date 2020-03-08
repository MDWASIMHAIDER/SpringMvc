package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistService;

public class ScientistDeleteController  extends AbstractController{
	
	private ScientistService service;
	
	public ScientistDeleteController(ScientistService service) {
		this.service = service;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String resMsg=null;
		int id=0;
		ModelAndView mav=null;
		List<ScientistDTO>listdto=null;
		mav=new ModelAndView();
		id=Integer.parseInt(req.getParameter("id"));
		resMsg=service.removeScientist(id);
		listdto=service.fetchAllScientist();
		mav.addObject("resMsg",resMsg);
		mav.addObject("listdto", listdto);
		mav.setViewName("record");
		return mav;
	}

}
