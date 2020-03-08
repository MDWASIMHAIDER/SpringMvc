package com.nt.confg;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {ServiceConfig.class,DaoConfig.class})
public class AppConfig {

}
