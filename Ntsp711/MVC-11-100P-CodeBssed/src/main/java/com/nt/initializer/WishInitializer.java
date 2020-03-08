package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;


public class WishInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		System.out.println("initializer");
		AnnotationConfigWebApplicationContext rootCtx=null,childCtx=null;
		ContextLoaderListener listener=null;
		DispatcherServlet  servlet=null;
		ServletRegistration.Dynamic register=null;
		rootCtx=new AnnotationConfigWebApplicationContext();
		rootCtx.register(RootAppConfig.class);
		childCtx=new AnnotationConfigWebApplicationContext();
		childCtx.register(WebMvcAppConfig.class);
		listener=new ContextLoaderListener(rootCtx);
		ctx.addListener(listener);
		servlet=new DispatcherServlet(childCtx);
		register=ctx.addServlet("ds", servlet);
		register.addMapping("*.htm");
		register.setLoadOnStartup(2);
	}

}
