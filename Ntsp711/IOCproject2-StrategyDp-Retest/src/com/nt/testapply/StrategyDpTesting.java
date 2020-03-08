package com.nt.testapply;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.comp.Engine;
import com.nt.comp.Vechile;
import com.nt.factory.VechileFactory;

public class StrategyDpTesting {

	public StrategyDpTesting() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		/*Vechile vechile=null;
		Engine engine=null;
		vechile=VechileFactory.getVechileInstance("diesel");
		vechile.journey("hyd", "bhagalpur");*/
	FileSystemResource res=new FileSystemResource("src/com/nt/confg/ApplicationContext.xml");
	XmlBeanFactory factory=new XmlBeanFactory(res);
	Engine engine=(Engine)factory.getBean("vec");
	engine.start();
		
	}
}
