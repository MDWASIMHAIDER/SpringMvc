package com.nt.config;



import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan("com.nt.beans")
@Configuration
public class WishConfig {
	
	@Bean
	public Calendar getCalendar() {
		return  Calendar.getInstance();
	}
}
