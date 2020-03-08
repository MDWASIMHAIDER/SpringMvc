package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyContainer implements ApplicationContextAware {

	ApplicationContext ctx;
	String beanId;
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public MyContainer() {
		System.out.println("mycontainer 0-paam constructor");
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	public void processRequest(String data) {
		RequestHandler handler=ctx.getBean("hand",RequestHandler.class);
		handler.handle(data);
	}
	

}
