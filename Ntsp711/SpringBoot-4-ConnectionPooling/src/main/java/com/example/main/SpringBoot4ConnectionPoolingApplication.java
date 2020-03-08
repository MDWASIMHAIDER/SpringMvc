package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.EmpService;


@SpringBootApplication
@ComponentScan(basePackages={"com.nt.service","com.nt.dao"})
public class SpringBoot4ConnectionPoolingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmpService service=null;
		ctx=SpringApplication.run(SpringBoot4ConnectionPoolingApplication.class, args);
		service=ctx.getBean("serviceimpl",EmpService.class);
		System.out.println(service.findEmpCount()+"  count value");
		System.out.println("by desg "+service.findEmployeesByDesg("clerk"));
		
	}

}
