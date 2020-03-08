package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.StudentController;

public class TestApply {

	public TestApply() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=null;
			DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/nt/confg/applicationContext.xml");
			StudentController controller=factory.getBean("contrl", StudentController.class);
			sc=new Scanner(System.in);
			System.out.println("Enter student nnumber");
			String sno=sc.next();
			System.out.println("Enter student name");
			String name=sc.next();
			System.out.println("Enter student marks1");
			String m1=sc.next();
			System.out.println("Enter student marks2");
			String m2=sc.next();
			System.out.println("Enter student marks3");
			String m3=sc.next();
			System.out.println(controller.process(sno,name,m1,m2,m3));

	}

}
