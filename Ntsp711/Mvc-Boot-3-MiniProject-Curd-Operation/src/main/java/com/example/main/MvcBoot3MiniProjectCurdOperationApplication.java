package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.MvcWebAppConfig;
import com.nt.config.RootAppConfig;

@SpringBootApplication
@Import({RootAppConfig.class,MvcWebAppConfig.class})
public class MvcBoot3MiniProjectCurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcBoot3MiniProjectCurdOperationApplication.class, args);
	}

}
