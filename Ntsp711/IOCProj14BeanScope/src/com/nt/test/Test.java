package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Vechile;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		Vechile vechile=factory.getBean("vc",Vechile.class);
		Vechile vechile1=factory.getBean("vc",Vechile.class);
		System.out.println(vechile);
		System.out.println(vechile.hashCode());
		System.out.println(vechile1.hashCode());
		System.out.println(vechile.hashCode()==vechile1.hashCode());

	}

}
