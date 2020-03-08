package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
/*	@RequestMapping("/result.htm")//mapping incomming request with uri result.htm
	public ModelAndView process() {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		return new ModelAndView("result","wishMsg",wishMsg);
	}*/
	/*@RequestMapping("/result.htm")
	public String process(Model model) {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		model.addAttribute("wishMsg",wishMsg);
		return "result";//logical view name
	}*/
	
	/*@RequestMapping("/result.htm")
	public String process(ModelMap map) {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		map.addAttribute("wishMsg", wishMsg);
		return "result";
	}*/
	
	/*@RequestMapping("/result.htm")
	public String process(Map<String,Object>map) {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		map.put("wishMsg", wishMsg);
		return "result";
	}*/
	
/*	@RequestMapping("/result.htm")//here result is taken as logical view name
	public void process(Map<String,Object>map) {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		map.put("wishMsg", wishMsg);
	}*/
	
	/*@RequestMapping("/result.htm")
	public Model process() {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		Model model=new ExtendedModelMap();
		model.addAttribute("wishMsg", wishMsg);
		return model;
	}*/
	
/*	@RequestMapping("/result.htm")
	public ModelMap process() {
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		ModelMap map=new ModelMap();
		map.addAttribute("wishMsg",wishMsg);
		return map;
	}*/
	
	/*@RequestMapping("/result.htm")
	public Map<String,Object>process(){
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		Map<String, Object>map=new HashMap();
		map.put("wishMsg", wishMsg);
		return map;
	}*/
	
	@RequestMapping("/result.htm")
	public Map<String,Object>process(HttpServletRequest req,HttpServletResponse res){
		String wishMsg=null;
		wishMsg=service.getTimeDetail();
		Map<String, Object>map=null;
		map=new HashMap();
		map.put("wishMsg", wishMsg);
		return map;
	}
}
