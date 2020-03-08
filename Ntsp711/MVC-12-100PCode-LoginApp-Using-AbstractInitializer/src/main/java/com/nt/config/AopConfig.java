package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class AopConfig {
	@Autowired
	private DataSource ds;
	
	@Bean("DsTx")
	public DataSourceTransactionManager createDsTx() {
		DataSourceTransactionManager dxtx=null;
		dxtx=new DataSourceTransactionManager(ds);
		return dxtx;
	}
}
