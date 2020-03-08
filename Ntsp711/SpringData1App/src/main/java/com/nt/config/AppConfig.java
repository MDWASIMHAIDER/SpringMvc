package com.nt.config;

import javax.persistence.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages="com.nt.service")
@EntityScan(basePackages="com.nt.dao")
@EnableJpaRepositories(basePackages="com.nt.dao")
public class AppConfig {

}
