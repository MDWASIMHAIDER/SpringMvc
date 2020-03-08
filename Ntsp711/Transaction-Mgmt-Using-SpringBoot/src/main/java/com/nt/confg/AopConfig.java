package com.nt.confg;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@Import(DataSource.class)
@ComponentScan(basePackages= {"com.nt.dao,com.nt.service"})
@Configuration
@EnableTransactionManagement
public class AopConfig {
	@Bean("dstm")
	public DataSourceTransactionManager createTransactionManager() {
		DataSourceTransactionManager dstm=null;
		dstm=new DataSourceTransactionManager();
		dstm.setDataSource(DataSource.createDs());
		return dstm;
	}
}