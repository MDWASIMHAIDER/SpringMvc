package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Engine;
import com.nt.beans.Vechile;

public class Test {

	/*public Test() {
		// TODO Auto-generated constructor stub
	}*/
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		Vechile vechile=factory.getBean("vechl",Vechile.class);
		vechile.move();
		
	}

}
