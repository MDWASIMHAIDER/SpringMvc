package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		service=ctx.getBean("pfb",BankService.class);
		System.out.println("Simple intesrest "+service.calcIntrAmt(49000, 3, 3));
		System.out.println("-----------------------------------------------------");
		/*System.out.println("Simple intesrest "+service.calcIntrAmt(52000, 3, 3));
		System.out.println("Simple intesrest "+service.calcIntrAmt(49000, 3, 3));
*/		//System.out.println("Addition of numbers "+service.add(12320, 4000));
	}

}
