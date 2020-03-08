package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		Bank bk=ctx.getBean("bnk",Bank.class);
		
	/*	here ctx.getbean gives the obj of bank sub class  by using cglib library then it cals 
		method replacer class method intersetreplacer()  will be accesed and override the method of main class
		and execute overidden method of sub class/proxy class
*/		
		//System.out.println("intr amount "+bk.calcIntrAmt(10000, 15));
		
		System.out.println(bk.test("hel"));
	}

}
