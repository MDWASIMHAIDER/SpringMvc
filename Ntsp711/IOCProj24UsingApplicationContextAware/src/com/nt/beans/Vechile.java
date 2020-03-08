package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vechile implements ApplicationContextAware{

	private ApplicationContext ctx;
	private String beanId;
	public Vechile() {
		System.out.println("vechile class 0-param constructor");
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public void setEngine() {
		Engine eg=ctx.getBean(beanId,Engine.class);
		eg.start();
		System.out.println("vechile is moving");
	}
	

}
