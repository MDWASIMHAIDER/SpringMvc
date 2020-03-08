package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages="com.nt.controller")
@Import({ServiceConfig.class,PersistanceConfig.class})
public class RootAppConfig {

}
