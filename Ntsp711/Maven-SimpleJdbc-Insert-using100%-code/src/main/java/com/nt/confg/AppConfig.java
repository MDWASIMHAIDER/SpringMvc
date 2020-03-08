package com.nt.confg;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {persistence_beans_confg.class,service_beans_confg.class})
public class AppConfig {

}
