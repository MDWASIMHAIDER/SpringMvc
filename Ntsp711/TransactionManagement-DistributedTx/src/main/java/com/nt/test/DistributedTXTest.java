package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.AccountService;

public class DistributedTXTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		AccountService service=null;
		service=ctx.getBean("service",AccountService.class);
		System.out.println(service.transferMoney(1002, 2001,500));
	}

}
