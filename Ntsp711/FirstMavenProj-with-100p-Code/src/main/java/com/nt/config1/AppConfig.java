package com.nt.config1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {DeptDAOConfig.class,DeptServiceConfig.class})
public class AppConfig {
	
}
