package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("Client App main()");
		//locate spring bean configuration file or holding the path
		FileSystemResource res=new FileSystemResource("src/com/nt/conf/applicationContext.xml");
		//activate beanfactory container ioc
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get bean class object
		WishGenerator bean=(WishGenerator)factory.getBean("wsg");
		//WishGenerator bean=factory.getBean("wsg",WishGenerator.class);
		//call business method
		String result=bean.generateWishMsg();
		System.out.println(result);
	}//main

}//class
