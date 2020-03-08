package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.confg.AppConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class SimpleJdbcInsert_Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		dto=new EmployeeDTO();
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		service=ctx.getBean("empservice",EmployeeService.class);
		dto.setEid(9003);
		dto.setEname("saif");
		dto.setDesg("actor");
		dto.setSalary(150000);
		System.out.println(service.saveEmp(dto));
		((AbstractApplicationContext) ctx).close();
	}

}
