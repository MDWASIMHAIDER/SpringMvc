package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TileController {
	
	@RequestMapping("/home.htm")
	public  String showHomePage() {
		return "page1";
	}
	
	@RequestMapping("/course.htm")
	public  String  showSportsPage() {
		return "page2";
	}
	@RequestMapping("/Address.htm")
	public  String  showPoliticsPage() {
		return "page3";
	}
	@RequestMapping("/faculty.htm")
	public  String  showEntertaimentPage() {
		return "page4";
	}

}
