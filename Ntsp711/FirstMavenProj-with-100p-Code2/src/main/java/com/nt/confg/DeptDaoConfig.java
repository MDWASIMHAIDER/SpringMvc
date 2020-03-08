package com.nt.confg;

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
@PropertySource( "classpath:com/nt/commans/Dbdetails.properties" )
public class DeptDaoConfig {

	@Autowired
	private Environment env;//it uses to access property file values
	@Bean("hkds")
	public HikariDataSource createHkDs() {
		HikariDataSource hkds=null;
		hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getProperty("spring.driver-class"));
		hkds.setJdbcUrl(env.getProperty("spring.url"));
		hkds.setUsername(env.getProperty("spring.username"));
		hkds.setPassword(env.getProperty("spring.password"));
		return hkds;
	} 
	@Bean("jt")//it injects its obj to jdbctemplate using constructor injection
	public JdbcTemplate createJt() {
		return new JdbcTemplate(createHkDs());//here we r passing  all properties to jdbctemplate by calling hkds method
	}
}
