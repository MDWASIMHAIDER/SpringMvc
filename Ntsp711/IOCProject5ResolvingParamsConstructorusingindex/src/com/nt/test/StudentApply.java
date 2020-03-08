package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.StudentInfo;

public class StudentApply {

	public StudentApply() {
		System.out.println("studentapply-0 param constructor");
	}
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/ApplicationContext.xml");
		StudentInfo std=(StudentInfo)factory.getBean("st");
		System.out.println(std);
	}

}
