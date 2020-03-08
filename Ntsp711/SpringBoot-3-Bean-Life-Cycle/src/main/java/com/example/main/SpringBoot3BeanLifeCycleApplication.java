package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.VotingCheck;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class SpringBoot3BeanLifeCycleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VotingCheck vote=null;
		ctx=SpringApplication.run(SpringBoot3BeanLifeCycleApplication.class, args);
		vote=ctx.getBean("vc",VotingCheck.class);
		System.out.println(vote.checkVotingEligibilty());
	}

}
