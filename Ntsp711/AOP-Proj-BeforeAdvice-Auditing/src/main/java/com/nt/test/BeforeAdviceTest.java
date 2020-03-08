package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.PayrollService;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PayrollService service=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		service=ctx.getBean("pfb",PayrollService.class);
		System.out.println(service.generateSalary(2001, 22000, false));

	}

}
