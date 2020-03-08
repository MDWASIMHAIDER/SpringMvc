package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.TicketVO;

public class TicketApply {
	public TicketApply() {
		System.out.println("TicketApply.0-param constructor");
	}
	public static void main(String[] args)throws Exception {
	Scanner sc=null;
	String result=null;
	TicketVO vo=null;
	MainController controller=null;
	String name=null;
	String age=null;
	String addrs=null;
	String CNumber=null;
	String gender=null;
	String sStation=null;
	String dStation=null;
	String distance=null;
	BeanFactory factory;
	sc=new Scanner(System.in);
	System.out.println("Enter passenger named");
	name=sc.next();
	System.out.println("Enter passenger age");
	age=sc.next();
	System.out.println("Enter passenger address");
	addrs=sc.next();
	System.out.println("Enter passenger sourse station");
	sStation=sc.next();
	System.out.println("Enter passenger destination station");
	dStation=sc.next();
	System.out.println("Enter passenger gender");
	gender=sc.next();
	System.out.println("Enter passenger journey distance");
	distance=sc.next();
	System.out.println("Enter passenger contact number");
	CNumber=sc.next();
	vo=new TicketVO();
	vo.setpName(name);
	vo.setGender(gender);
	vo.setpAddrs(addrs);
	vo.setpAge(age);
	vo.setConatctNumber(CNumber);
	vo.setSourceStation(sStation);
	vo.setDestStation(dStation);
	vo.setDistance(distance);
	factory=new XmlBeanFactory(new ClassPathResource("com/nt/confg/ApplicationContext.xml"));
	controller=factory.getBean("controller1",MainController.class);
	try {
		result=controller.processTicket(vo);
		System.out.println(result);
	}
	catch(Exception e) {
		System.out.println("Internal Problem ----> try again..");
		e.printStackTrace();
	}
	
	}

}
