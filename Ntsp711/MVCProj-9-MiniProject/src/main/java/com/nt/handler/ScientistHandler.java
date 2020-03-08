package com.nt.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistService;

public class ScientistHandler  extends AbstractCommandController{
	
	private ScientistService service;
	
	public ScientistHandler(ScientistService service) {
		this.service = service;
	}


	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		List<ScientistDTO>listdto=null;
		listdto=service.fetchAllScientist();
		return new ModelAndView("result","listdto",listdto);
	}

}
