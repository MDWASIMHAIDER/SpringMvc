package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.nt.beans.Courier;
import com.nt.beans.Flipkart;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class SpringBoot3CoreStrategyDpApplication {

	public static void main(String[] args) {
		Flipkart fp=null;
		ApplicationContext ctx=null;
		ctx=SpringApplication.run(SpringBoot3CoreStrategyDpApplication.class, args);
		fp=ctx.getBean("fpkt",Flipkart.class);
	System.out.println(fp.shopping(new String[] {"shirt","jeans"}));
	}

}
