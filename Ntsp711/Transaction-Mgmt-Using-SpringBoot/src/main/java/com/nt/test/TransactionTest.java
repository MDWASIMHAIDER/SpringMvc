package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.confg.AppConfig;
import com.nt.service.BankService;

public class TransactionTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=null;
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		BankService service=null;
		service=ctx.getBean("service",BankService.class);
		System.out.println(service.transferMoney(1003, 1002, 300));

	}

}
