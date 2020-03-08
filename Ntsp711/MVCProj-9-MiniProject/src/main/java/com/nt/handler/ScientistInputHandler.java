package com.nt.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.ScientistCommand;
import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistService;

public class ScientistInputHandler extends SimpleFormController{
	
private ScientistService service;
	
	public ScientistInputHandler(ScientistService service) {
		this.service = service;
	}

	/*@Override
		protected Object formBackingObject(HttpServletRequest request) throws Exception {
	
			ScientistDTO dto=null;
			ScientistCommand cmd=null;
			dto=service.getScientistById(1125);
			cmd=new ScientistCommand();
			BeanUtils.copyProperties(dto, cmd);
			return cmd;
		}*/
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ScientistCommand cmd=(ScientistCommand) command;
		ScientistDTO dto=null;
		dto=new ScientistDTO();
		dto.setSno(cmd.getSno());
		dto.setSname(cmd.getSname());
		dto.setDomain(cmd.getDomain());
		dto.setExperiance(cmd.getExperiance());
		dto.setPatantCounts(cmd.getPatantCounts());
		BeanUtils.copyProperties(cmd, dto);
		String msg=service.setScientist(dto);
		/*ModelAndView mav=new ModelAndView();
		mav.addObject("resMsg",msg);
		mav.addObject("listdto",dto);
		mav.setViewName(getSuccessView());
		return  mav;*/
		return new ModelAndView("result","resMsg",msg);
	}

}
