package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeService;

public class MappingSqlTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		service=ctx.getBean("empservice",EmployeeService.class);
		System.out.println(service.findEmpByDesg("CLERK-sr"));
		System.out.println("=========================");
		System.out.println(service.findEmpByEid(201));
		System.out.println("================================");
		System.out.println(service.updateEmpByEid(201,"manager"));
		((AbstractApplicationContext) ctx).close();
	}

}
