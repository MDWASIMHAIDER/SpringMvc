package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.College;
import com.nt.beans.Student;
import com.nt.beans.User;

public class CollcetionsTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/confg/ApplicationContext.xml");
		//list colllection apply
		Student st=factory.getBean("stu",Student.class);		
		System.out.println(st);
		System.out.println("=====================");
		///set collection apply
		User us=factory.getBean("usr",User.class);
		System.out.println(us);
		System.out.println("=======================");
		College cg=factory.getBean("clg",College.class);
		System.out.println(cg);
		
	}

}
