package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.confg.AppConfig;
import com.nt.service.DeptService;
import com.nt.service.DeptServiceImpl;

public class RestestMavenProj {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		DeptService service=null;
		service=ctx.getBean("service",DeptServiceImpl.class);
		System.out.println(service.getDepartmentCount());

	}

}
