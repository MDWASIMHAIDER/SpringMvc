package com.nt.applytest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Vechile;

public class DpWithSpringBeanConfig {
	public DpWithSpringBeanConfig() {
		System.out.println("DpWithSpringBeanConfig 0-param constructor");
	}
	public static void main(String[] args) {
FileSystemResource res=new FileSystemResource("src/com/nt/config/ApplicationContext.xml");
XmlBeanFactory factory=new XmlBeanFactory(res);
Vechile vechile=(Vechile) factory.getBean("vec");
vechile.journey("hyd","bgp");
	}

}
