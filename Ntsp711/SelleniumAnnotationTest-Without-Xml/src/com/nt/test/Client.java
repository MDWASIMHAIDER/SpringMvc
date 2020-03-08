package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.College;
import com.nt.beans.Teacher;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(com.nt.config.FullyCodeConfig.class);
		College c=ctx.getBean("collegeBean", College.class);//here default class name become bean id(college)
		System.out.println(c);
		c.test("wasim");
		Teacher t=c.getTeacher();
		t.teacherInfo();
	//	System.out.println("client call");
		((AbstractApplicationContext) ctx).close();
		

	}

}
