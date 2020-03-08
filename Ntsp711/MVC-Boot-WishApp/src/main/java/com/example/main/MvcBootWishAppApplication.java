package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMsgGenerator;
import com.nt.config.WishConfig;

@SpringBootApplication
@Import(WishConfig.class)
public class MvcBootWishAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator msg=null;
		ctx=SpringApplication.run(MvcBootWishAppApplication.class, args);
		msg=ctx.getBean("wmg",WishMsgGenerator.class);
		String msg1=msg.generateMessage();
		System.out.println(msg1);
	}

}
