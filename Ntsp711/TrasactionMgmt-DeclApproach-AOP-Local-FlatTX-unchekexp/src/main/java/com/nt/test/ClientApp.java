package com.nt.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class ClientApp {

	public static void main(String[] args){
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		BankService service=null;
		service=ctx.getBean("tpfb",BankService.class);
		try {
		System.out.println(service.transferMoney(1002, 1001, 2000));
		}
		catch(Exception  e) {
			e.printStackTrace();
			System.out.println("roll back");
		}
		}

}
