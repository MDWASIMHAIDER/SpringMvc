package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Bike;

public class TestApply {

	public TestApply() {
		System.out.println("test-0-param constructor");
	}

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		Bike bike=factory.getBean("bk", Bike.class);
		Bike bike1=factory.getBean("bk1", Bike.class);
		System.out.println(bike+""+bike1);
	}

}
