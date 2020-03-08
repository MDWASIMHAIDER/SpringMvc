package com.nt.handler;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.controller.Handler;

public class ShowSystemInfoHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
			Properties properties=null;
			properties=System.getProperties();
			req.setAttribute("SysInfo", properties);
			return "sh_props";
	}

}
