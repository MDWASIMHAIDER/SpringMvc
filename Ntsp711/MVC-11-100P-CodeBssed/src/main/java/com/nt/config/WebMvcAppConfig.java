package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@EnableWebMvc//it enables RequestMappingHandlerMapping internally
@Configuration
@ComponentScan("com.nt.controller")
public class WebMvcAppConfig {
	
	@Bean
	public ViewResolver getResolver() {
		InternalResourceViewResolver resolver=null;
		System.out.println("App config");
		//resolver=new InternalResourceViewResolver("/WEB-INF/pages/",".jsp");
		resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");//alternate way
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
