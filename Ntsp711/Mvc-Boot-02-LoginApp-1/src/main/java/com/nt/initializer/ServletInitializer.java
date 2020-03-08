package com.nt.initializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.example.main.MvcBoot02LoginApp1Application;
import com.nt.config.MvcAppConfig;
import com.nt.config.RootAppConfig;
//this config optional
//@Import({RootAppConfig.class,MvcAppConfig.class})
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MvcBoot02LoginApp1Application.class);
	}

}
