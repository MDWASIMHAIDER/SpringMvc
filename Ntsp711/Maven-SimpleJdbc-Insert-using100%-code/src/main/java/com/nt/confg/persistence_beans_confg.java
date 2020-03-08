package com.nt.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class persistence_beans_confg {
	@Bean
	public HikariDataSource createDataSource() {
		HikariDataSource ds=null;
		ds=new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("tiger");
		return ds;
	}
	@Bean
	public SimpleJdbcInsert createSimpleJdbcInsert() {
		SimpleJdbcInsert sji=null;
		sji=new SimpleJdbcInsert(createDataSource());
		return sji;
	}
}
