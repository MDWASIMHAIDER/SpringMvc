package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.PolicyService;

public class NameParameterJdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		PolicyService service=null;
		service=ctx.getBean("service",PolicyService.class);
		System.out.println(service.findPolcyByNumber(1003));
	}

}
