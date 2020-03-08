package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class FactoryBeanTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		ScheduleReminder sc=ctx.getBean("scremd",ScheduleReminder.class);
		System.out.println("get class "+sc.getClass());
		System.out.println(sc.reminderOfTheDay());
		((AbstractApplicationContext) ctx).close();
	}

}
