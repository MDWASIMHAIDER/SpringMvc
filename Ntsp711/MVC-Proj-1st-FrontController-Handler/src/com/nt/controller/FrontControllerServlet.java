package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.handler.ShowDateHandler;
import com.nt.handler.ShowSystemInfoHandler;

public class FrontControllerServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Handler handler=null;
		String lvn=null;
		String target=null;
		RequestDispatcher rd=null;
		try {
			//getServletPath gives the last text of req like systemdate.do from url
			if(req.getServletPath().equalsIgnoreCase("/SystemDate.do")) {
				handler=new ShowDateHandler();
				lvn=handler.handle(req, res);
			}
			else if(req.getServletPath().equalsIgnoreCase("/SystemInfo.do")) {
				handler=new ShowSystemInfoHandler();
				lvn=handler.handle(req, res);
			}
			else {
				target="/error.jsp";
			}
		}//try
		catch(Exception e) {
			target="/error.jsp";
		}
		//perform view management
		if(target==null && lvn!=null) {
			if(lvn.equalsIgnoreCase("sh_date")) {
				target="/show_date.jsp";
			}
			else if(lvn.equalsIgnoreCase("sh_props")) {
				target="/show_props.jsp";
			}
			else {
				target="/error.jsp";
			}
		}
		rd=req.getRequestDispatcher(target);
		rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
}
