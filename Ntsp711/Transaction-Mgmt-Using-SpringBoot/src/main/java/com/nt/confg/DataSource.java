package com.nt.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

public class DataSource {
	@Bean(name="ds")
	public static HikariDataSource createDs() {
		HikariDataSource ds=null;
		ds=new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("tiger");
		return ds;
	}
	
	@Bean(name="jt")
	public JdbcTemplate createJdbcTemplate() {
	    JdbcTemplate jt=null;
		jt=new JdbcTemplate(createDs());
		return jt;
	}
}
