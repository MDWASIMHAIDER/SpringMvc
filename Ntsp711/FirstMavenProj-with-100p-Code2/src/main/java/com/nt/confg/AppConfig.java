package com.nt.confg;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {DeptDaoConfig.class,DeptServiceConfig.class})
public class AppConfig {

}
