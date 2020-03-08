package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;

public class Client {
	public static void main(String[] arg) {
		DefaultListableBeanFactory factory;
		factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader  reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/ApplicationContext.xml");
	A a=(A)	factory.getBean("a",A.class);
	System.out.println(a);
		
	}
}
