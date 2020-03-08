package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.MvcAppConfig;
import com.nt.config.RootAppConfig;

@SpringBootApplication
@Import({RootAppConfig.class,MvcAppConfig.class})
public class MvcBoot02LoginApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(MvcBoot02LoginApp1Application.class, args);
	}

}
