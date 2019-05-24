package com.ww.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@Import(PersistenceConfig.class)
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.ww.dao","com.ww.service","com.ww.controller" })
public class RootConfig extends WebMvcConfigurerAdapter {

}
