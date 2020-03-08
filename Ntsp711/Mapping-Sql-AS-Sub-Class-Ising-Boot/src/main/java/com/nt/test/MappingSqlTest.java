package com.nt.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.confg.AppConfig;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import(value=AppConfig.class)
public class MappingSqlTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		//ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		ctx=SpringApplication.run(MappingSqlTest.class, args);
		service=ctx.getBean("empservice",EmployeeService.class);
		System.out.println(service.findEmpByDesg("CLERK-sr"));
		System.out.println("=========================");
		System.out.println(service.findEmpByEid(201));
		System.out.println("================================");
		System.out.println(service.updateEmpByEid(201,"manager"));
		((AbstractApplicationContext) ctx).close();
	}

}
