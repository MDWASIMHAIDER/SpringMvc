package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		College c=ctx.getBean("collegeBean", College.class);
		System.out.println(c);
		//c.test("wasim");

	}

}
