package com.nt.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.ScientistCommand;
import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistService;

import oracle.jdbc.proxy.annotation.ProxyResult;

@Controller
//@SessionAttributes(names="scmd")
public class ScientistRecordGeneration{
	
	@Autowired
	private ScientistService service;

	@RequestMapping("/home.htm")
	public String showHome() {
		return "welcome";
	}
	
	@RequestMapping("/insert.htm")
	public String showInsert(@ModelAttribute("scmd") ScientistCommand command) {
		return "insert";
	}
	
	@RequestMapping("/report.htm")
	public String getAllRecord(Map<String,List<ScientistDTO>>map,@ModelAttribute("scmd") ScientistCommand scmd) {
		List<ScientistDTO>listdto=null;
		listdto=service.fetchAllScientist();
		//System.out.println(listdto);
		map.put("listdto",listdto);
		return "record";
	}
	@RequestMapping("/set.htm")
	public ModelAndView editScientist(@ModelAttribute("scmd") ScientistCommand command,Errors err) {
		String resMsg=null;
		List<ScientistDTO>listdto=null;
		ScientistCommand cmd=(ScientistCommand) command;
		ScientistDTO dto=new ScientistDTO();
		ModelAndView mav=null;
		mav=new ModelAndView();
		BeanUtils.copyProperties(cmd, dto);
		resMsg=service.addScientist(dto);
		listdto=service.fetchAllScientist();
		mav.addObject("resMsg", resMsg);
		mav.addObject("listdto",listdto);
		mav.setViewName("record");
		return mav;
	}
	
	@RequestMapping("/delete.htm")
	public String deleteScientist(HttpServletRequest req,Map<String,Object>map,@ModelAttribute("scmd") ScientistCommand command) {
		String resMsg=null;
		int id=0;
		//ModelAndView mav=null;
		List<ScientistDTO>listdto=null;
	//	mav=new ModelAndView();
		id=Integer.parseInt(req.getParameter("id"));
		resMsg=service.removeScientist(id);
		listdto=service.fetchAllScientist();
		//mav.addObject("resMsg",resMsg);
	//	mav.addObject("listdto", listdto);
		//mav.setViewName("record");
		map.put("resMsg", resMsg);
		map.put("listdto", listdto);
		return "record";
		//return mav;
	}
	
	//form backing using annotation
	@RequestMapping(value="/edit.htm",method=RequestMethod.GET)
	public String showEditForm(Map<String,Object>map,HttpServletRequest req,@ModelAttribute("scmd")ScientistCommand command) {
		ScientistDTO dto=null;
		ScientistCommand cmd=command;
		int id=Integer.parseInt(req.getParameter("id"));
		dto=service.scientistById(id);
		
		BeanUtils.copyProperties(dto, cmd);
		map.put("cmd", cmd);
		//map.put("editScientist","editScientist");
		return "editScientist";
	}
	
	@RequestMapping(value="/edit.htm",method=RequestMethod.POST)
	public String editScientist(HttpServletRequest req,Map<String,Object>map,@ModelAttribute("scmd") ScientistCommand command) {
		String resMsg=null;
		List<ScientistDTO>listdto=null;
		ScientistCommand cmd=(ScientistCommand) command;
		ScientistDTO dto=new ScientistDTO();
	//	ModelAndView mav=null;
		//mav=new ModelAndView();
		BeanUtils.copyProperties(cmd, dto);
		resMsg=service.editScientist(dto);
		listdto=service.fetchAllScientist();
	//	mav.addObject("resMsg", resMsg);
		//mav.addObject("listdto",listdto);
	//	mav.setViewName("record");
		map.put("resMsg", resMsg);
		map.put("listdto",listdto);
		return "record";
	}

}
