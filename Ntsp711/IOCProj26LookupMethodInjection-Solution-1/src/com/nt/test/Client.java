package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.MyContainer;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		MyContainer cnt=ctx.getBean("cont",MyContainer.class);
		cnt.processRequest(" hello wasim");
		cnt.processRequest(" how are you");

	}

}
