package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.WishMessageGeneratorService;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.service")
public class SpringBBoot1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGeneratorService service=null;
		ctx=SpringApplication.run(SpringBBoot1Application.class, args);//it will create n return ioc container
		service=ctx.getBean("wish" ,WishMessageGeneratorService.class);
		System.out.println(service.generateWishMessage("wasim"));
	}

}
