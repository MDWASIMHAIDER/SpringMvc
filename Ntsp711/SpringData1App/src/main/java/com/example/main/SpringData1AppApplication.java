package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.dao.Employee_Detail;
import com.nt.service.EmployeeService;
import com.nt.service.EmployeeServiceImpl;

@SpringBootApplication
@Import(value=AppConfig.class)
public class SpringData1AppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		Employee_Detail detail=null;
		ctx=SpringApplication.run(SpringData1AppApplication.class, args);
		service=ctx.getBean("service",EmployeeServiceImpl.class);
		detail=new Employee_Detail();
		detail.setEno(1001);detail.setEname("wasim");detail.setDesg("sr-software");detail.setSalary(100000);
		System.out.println(service.registerEmp(detail));
	}

}
