package com.nt.config1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;
@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource("classpath:com/nt/commans/detail.properties")
public class DeptDAOConfig {
	
	@Autowired
	private Environment env;
	@Bean(name="hkds")
	public HikariDataSource createHkDs() {
		HikariDataSource hkds=null;
		hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getProperty("spring.driver-class"));
		hkds.setJdbcUrl(env.getProperty("spring.url"));
		hkds.setUsername(env.getProperty("spring.username"));
		hkds.setPassword(env.getProperty("spring.password"));
		return hkds;
	}
	
	@Bean("jt")
	public JdbcTemplate createJt() {
		return new JdbcTemplate(createHkDs());
	}
}
