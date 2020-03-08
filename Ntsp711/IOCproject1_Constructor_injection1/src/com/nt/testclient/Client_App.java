package com.nt.testclient;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessage;

public class Client_App {
	
	public static void main(String[] args) {
		
			System.out.println("Client main");
			//loads or hold spring confi file resourse inertface and fsr is implemet class
			Resource res=new FileSystemResource("src/com/nt/conf/ApplicationContext.xml");
			//xml bean creates logical ioc conatiner
			BeanFactory factory=new XmlBeanFactory(res);
			WishMessage generator=(WishMessage)factory.getBean("wmg");
			String result=generator.messageGenetrate();
			System.out.println(result);

	}

}
