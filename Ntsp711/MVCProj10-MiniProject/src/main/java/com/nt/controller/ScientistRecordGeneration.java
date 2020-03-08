package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistService;

public class ScientistRecordGeneration  extends AbstractController{
	
	private ScientistService service;
	
	public ScientistRecordGeneration(ScientistService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ScientistDTO>listdto=null;
		listdto=service.fetchAllScientist();
		System.out.println(listdto);
		return new ModelAndView("record","listdto",listdto);
	}
	
}
