package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentManagementService;
import com.nt.service.StudentManagementServiceImpl;

@WebServlet(urlPatterns="/servleturl",loadOnStartup=1)
public class MainController extends HttpServlet {
  ApplicationContext ctx;
  StudentManagementService service;
	/*@Override
		public void init() throws ServletException {
					}*/
  //here we used dependency looup becoz controller is managed by
  //servlet container ..and service cls is managed by ioc container 
  //so we cant inject it in servlet ..to respolve it we used dependency lookup 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		service=ctx.getBean("service",StudentManagementServiceImpl.class);

		String[] loc=req.getParameterValues("location");
		List<Map<String,Object>>listStud=service.findStudByLocation(loc);
		req.setAttribute("result", listStud);
		RequestDispatcher rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
