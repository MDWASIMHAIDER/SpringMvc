package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@EnableWebMvc//it give requestMappingHandlerMapping mapper it works as dispatcherServlet
@ComponentScan(basePackages="com.nt.controller")
public class MvcAppConfig {
	//todo view resolver in properties file
}
