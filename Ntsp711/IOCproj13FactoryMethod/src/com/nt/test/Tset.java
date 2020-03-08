package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Tset {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		Class c1=factory.getBean("c1",Class.class);
		Calendar calendar=factory.getBean("c2",Calendar.class);
		System.out.println(c1.getClass());
		System.out.println(calendar.getClass());
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeInMillis());
		String s=factory.getBean("s2",String.class);
		System.out.println(s+" "+s.getClass());
		String s3=factory.getBean("s3",String.class);
		System.out.println(s3+" "+s3.getClass());
	}

}
