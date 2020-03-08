package com.nttest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.College;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		College c=ctx.getBean("collegeBean", College.class);
		System.out.println(c);
		//c.test("wasim");

	}

}
