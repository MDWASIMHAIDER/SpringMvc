package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.Wish.WishMessage;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.wish")
public class SpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage wm=null;
		ctx=SpringApplication.run(SpringBoot2Application.class, args);
		wm=ctx.getBean("wish",WishMessage.class);
		wm.wishing();
		
	}

}
