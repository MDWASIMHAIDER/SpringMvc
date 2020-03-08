package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
	@RequestMapping("/home.htm")
	public String ShowHome() {
		System.out.println("showhome");
		return "welcome";
	}
	
	@RequestMapping("/result.htm")
	public String generateWish(Map<String,Object>map) {
		System.out.println("result generated");
		String resMsg=null;
		resMsg=service.WishGenerate();
		map.put("resMsg",resMsg);
		return "wishResult";
	}
}
