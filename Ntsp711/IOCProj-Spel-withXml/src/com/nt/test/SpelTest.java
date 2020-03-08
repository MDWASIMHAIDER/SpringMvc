package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.StudentInfo;

public class SpelTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentInfo st=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		st=ctx.getBean("st",StudentInfo.class);
		System.out.println(st);

	}

}
