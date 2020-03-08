package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voting;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		Voting vot=ctx.getBean("vot",Voting.class);
		System.out.println(vot.checkVotingEligibilty());
		((AbstractApplicationContext) ctx).close();
		

	}

}
