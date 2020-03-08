package com.nt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nt.beans.College;
import com.nt.beans.MathTeacher;
import com.nt.beans.Principal;
import com.nt.beans.Teacher;

@Configuration
@ComponentScan(basePackages="com.nt.beans") //commented because no class confured with annotation
@PropertySource("classpath:com/nt/prop/collegeInfo.properties")//for accesssing property file
public class FullyCodeConfig {
	/*	@Bean//another way of making class as bean method name bean id
	//	@Bean(name= {"colbean","basebean"})//we are giving multiple bean id to the bean(alias name)
		public College collegeBean() {//here method name collegeBean becomes bean id
		//	College college=new College(principalBean());//constructor injection
			College college=new College();
			college.setPrincipal(principalBean());//setter injection
			college.setTeeacher(teacherBean());
			return college;
			//return new College();
		}
		@Bean
		public Principal principalBean() {
			Principal principal=new Principal();
			principal.setTeach(teacherBean());
			return principal;
		}
		@Bean
		public Teacher teacherBean() {
			Teacher teacher=new MathTeacher();
			return teacher;
		}*/
}
