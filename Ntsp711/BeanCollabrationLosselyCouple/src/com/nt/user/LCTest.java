package com.nt.user;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LCTest {

	public LCTest() {
		System.out.println("lctest 0-param constructor");
	}
	public static void main(String[] args) {
		FileSystemResource frs=new FileSystemResource("src/com/nt/confg/AppllicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(frs);
		Flipkart flipkart=(Flipkart)factory.getBean("fkt");
		String status=flipkart.shopping(new String[]{"shirt","pant","jeans"},new float[]{700,1200,2311});
		System.out.println(status);
	}

}
