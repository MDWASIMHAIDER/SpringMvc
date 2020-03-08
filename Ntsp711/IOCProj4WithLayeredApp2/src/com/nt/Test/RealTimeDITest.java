package com.nt.Test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.MController.MainController;
import com.nt.vo.StudentVo;

public class RealTimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController controller=null;
		String result=null;
		StudentVo  vo=null;
		Scanner sc=null;
		String name=null,addrs=null,m1=null,m2=null,m3=null,sno=null;
		sc=new Scanner(System.in);
		System.out.println("Enter Student number");
		sno=sc.next();
		System.out.println("Enter Student name");
		name=sc.next();
		System.out.println("Enter Student address");
		addrs=sc.next();
		System.out.println("Enter Student marks1");
		m1=sc.next();
		System.out.println("Enter Student marks2");
		m2=sc.next();
		System.out.println("Enter Student marks3");
		m3=sc.next();
		vo=new StudentVo();
		vo.setSno(sno);
		vo.setSname(name);
		vo.setSadd(addrs);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		controller=factory.getBean("controller",MainController.class);
		try {
			result=controller.processResult(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Internal Problem ----> try again..");
			e.printStackTrace();
		}
		

	}

}
