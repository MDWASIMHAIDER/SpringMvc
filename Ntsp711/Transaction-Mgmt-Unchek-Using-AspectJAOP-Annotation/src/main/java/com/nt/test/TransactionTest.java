package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class TransactionTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/AppConfig.xml");
		BankService service=null;
		service=ctx.getBean("service",BankService.class);
		System.out.println(service.transferMoney(1003, 1001, 300));

	}

}
