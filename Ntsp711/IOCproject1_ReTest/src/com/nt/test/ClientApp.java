package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.FileSystemResource;


import com.nt.beans.WishMessageGenerator;

public class ClientApp {

	public ClientApp() {
		System.out.println("client constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main called");
		//locate or hold spring bean conf file
		FileSystemResource res=new FileSystemResource("src/com/nt/conf/applicationcontext.xml");
		System.out.println("after resource");
		//create or active logical ioc conatiner
		@SuppressWarnings("deprecation")
		/*XmlBeanFactory factory=new XmlBeanFactory(res);
		WishMessageGenerator bean=(WishMessageGenerator)factory.getBean("wms");
		String result=bean.messageGenerator();
		System.out.println(result);*/
		XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("after factory");
		//get bean class object
		WishMessageGenerator bean=(WishMessageGenerator)factory.getBean("wsg");
		System.out.println("after generator");
		//WishGenerator bean=factory.getBean("wsg",WishGenerator.class);
		//call business method
		String result=bean.messageGenerator();
		System.out.println(result);

	}

}
