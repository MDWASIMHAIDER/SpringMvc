package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.service.CustomerServive;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(new FileSystemResource("src/com/nt/confg/applicationContext.xml"));
		BeanFactoryPostProcessor bfpp=factory.getBean("ppc",PropertyPlaceholderConfigurer.class);
		bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory)factory);
		CustomerServive service=ctx.getBean("service",CustomerServive.class);
		//calcInrAmount(int cno,String cname,float pamt,float rate,float time)
		float res=service.calculateInterestAmount(1032, "Avnish", 10000f, 3f, 10f);
		System.out.println(res);

	}



}
