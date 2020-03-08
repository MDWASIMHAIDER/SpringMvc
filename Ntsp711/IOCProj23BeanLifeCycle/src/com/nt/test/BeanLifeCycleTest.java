package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVoting;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		CheckVoting vot=ctx.getBean("voting",CheckVoting.class);
		System.out.println(vot.checkVotingEligibility());
		((AbstractApplicationContext) ctx).close();

	}

}
