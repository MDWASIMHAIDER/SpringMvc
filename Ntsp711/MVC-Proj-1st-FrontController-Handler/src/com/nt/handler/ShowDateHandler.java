package com.nt.handler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.controller.Handler;

public class ShowDateHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Date d=null;
		d=new Date();
		req.setAttribute("SysDate", d);
		return "sh_Date";
	}

}
