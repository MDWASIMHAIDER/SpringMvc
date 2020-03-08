package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CBFindScoreService;

public class MainControllerServlet  extends HttpServlet{

	private ApplicationContext ctx;
	private CBFindScoreService service;
	public MainControllerServlet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void init() {
		ctx=new ClassPathXmlApplicationContext("/com/nt/confg/aplicationContext.xml");
		service=ctx.getBean("service",CBFindScoreService.class);
		
	}
	@Override
	public void doGet(HttpServletRequest req,
												HttpServletResponse res) throws 
															ServletException, IOException {
		
		String score=null;
		int  mid=0;
		RequestDispatcher rd=null;
		mid=Integer.parseInt(req.getParameter("mid"));
		score=service.findScore(mid);
		req.setAttribute("scoreBoard", score);
		rd=req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, res);
		
	}
	@Override
	public  void doPost(HttpServletRequest req,
													HttpServletResponse res) throws
															ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
	@Override
	public void destroy() {
		service=null;
		((AbstractApplicationContext) ctx).close();
	}

}
