package com.nt.confg;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {Service.class,Peristance.class})
public class AppConfig {

}
