package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vechile;

public class TestAwareInjection {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		Vechile vec=ctx.getBean("vec",Vechile.class);
		vec.setEngine();

	}

}
