package com.nt.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {DaoConfig.class,ServiceConfig.class})
public class AppConfig {

}
