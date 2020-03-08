package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Engine;
import com.nt.beans.PetrolEngine;
import com.nt.beans.Vechile;

public class StrategyDpBppTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		Vechile vec=ctx.getBean("vec",Vechile.class);
		Engine eg=ctx.getBean("pet",PetrolEngine.class);
		 vec.journey("bgp","hyd");
		 System.out.println("=====================");
		 vec.journey("del", "mumbai");
		 //eg.start();
		 ((AbstractApplicationContext) ctx).close();

	}

}
