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

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.UniversityManagementService;

public class MainController extends HttpServlet {
		ApplicationContext ctx;
		UniversityManagementService service;
		@Override
		public void init() throws ServletException {
				ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
				service=ctx.getBean("service",UniversityManagementService.class);
		}
		@Override
		public  void doGet(HttpServletRequest req,
													HttpServletResponse res) throws
																ServletException, IOException {
					String name=null;
					String address=null;
					String email=null;
					long mobile=0L;
					String course=null;
					String desg=null;
					String cap=null;
					String result=null;
					StudentDTO sdto=null;
					EmployeeDTO edto=null;
					RequestDispatcher rd=null;
					name=req.getParameter("name");
					address=req.getParameter("address");
					email=req.getParameter("email");
					mobile=Long.parseLong(req.getParameter("mobile"));
					cap=req.getParameter("s1");
					if(cap.equalsIgnoreCase("registerStudent")) {
						course=req.getParameter("course");
						sdto=new StudentDTO();
						sdto.setName(name);
						sdto.setAddress(address);
						sdto.setCourse(course);
						sdto.setEmail(email);
						sdto.setMobile(mobile);
						result=service.registerStudent(sdto);
						
					}
					else {
						if(cap.equalsIgnoreCase("registerEmployee")) {
							desg=req.getParameter("desg");
							edto=new EmployeeDTO();
							edto.setAddress(address);
					           edto.setName(name);
					           edto.setAddress(address);
					           edto.setEmail(email);
					           edto.setMobile(mobile);
					           edto.setDesg(desg);
					           //use service
					           result=service.registerEmployee(edto);
						}
					}
					req.setAttribute("resultMsg", result);
						rd=req.getRequestDispatcher("/result.jsp");
						rd.forward(req, res);
		}
		@Override
		public void doPost(HttpServletRequest req,
													HttpServletResponse res) throws
																ServletException, IOException {
				doGet(req, res);
		}
		@Override
		public void destroy() {
		service=null;
		((AbstractApplicationContext) ctx).close();
		}
}
