package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vechile {

	String beanid;
	public Vechile() {
		System.out.println("vechile 0-param constructor");
	}

	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	public void move() {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		Engine engine=factory.getBean(beanid,Engine.class);
		engine.start();
		System.out.println("vechile is moving");
	}

}
