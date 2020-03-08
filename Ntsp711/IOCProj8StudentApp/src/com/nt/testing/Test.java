package com.nt.testing;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.StudentController;

public class Test {

		public static void main(String[] args) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
	StudentController controller=factory.getBean("contrl",StudentController.class);
	System.out.println(controller.process("101", "wasim", "67","76", "78"));
}
}
