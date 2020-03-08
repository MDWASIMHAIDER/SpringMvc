package com.nt.user;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class ClientApp {

	public ClientApp() {
		System.out.println("ClientApp.ClientApp()-0 param constructor");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		FileSystemResource res=new FileSystemResource("src/com/nt/confg/ApplicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Flipkart flipkart=(Flipkart)factory.getBean("fkt");
		String status=flipkart.shopping(new String[] {"shirt","pant"},new float[] {700,1288});
		System.out.println(status);
	}

}
