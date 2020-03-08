package com.nt.testClient;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ClientApp {

	/*public ClientApp() {
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		System.out.println("Client Main");
		//locate or hold spring conifurtion file  where resource(I) implement class is FileSystemResource
		Resource res=new FileSystemResource("src/com/nt/conf/ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wmg");
		String result=generator.generateMessage();
		System.out.println(result);
	}

}
