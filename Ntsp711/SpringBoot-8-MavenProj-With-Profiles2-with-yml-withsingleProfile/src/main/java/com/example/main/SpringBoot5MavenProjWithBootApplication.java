package com.example.main;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.service.DeptService;
import com.nt.service.DeptServiceImpl;

@SpringBootApplication
@Import(AppConfig.class)
public class SpringBoot5MavenProjWithBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DeptService service=null;
		ctx=SpringApplication.run(SpringBoot5MavenProjWithBootApplication.class, args);
		service=ctx.getBean("service",DeptServiceImpl.class);
		System.out.println(service.getCount()+"count");
		System.out.println(service.getAllDeptNumber("cleaning"));
		System.out.println("profile is "+Arrays.deepToString(ctx.getEnvironment().getActiveProfiles()));
	}

}
