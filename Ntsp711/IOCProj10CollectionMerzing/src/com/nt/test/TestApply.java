package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EngCourse;

public class TestApply {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
		EngCourse course=factory.getBean("ecourse",EngCourse.class);
		EngCourse course1=factory.getBean("ecourse1",EngCourse.class);
		System.out.println(course);
		System.out.println(course1);
	}

}
