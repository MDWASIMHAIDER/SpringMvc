package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeService;

public class SimpleJdbcCall_Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		service=ctx.getBean("empservice",EmployeeService.class);
		System.out.println(service.getEmlDetail(9001));
	}

}
