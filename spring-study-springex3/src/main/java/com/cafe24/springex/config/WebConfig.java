package com.cafe24.springex.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc//mvc 붙어있는애들 한번에 
@ComponentScan({"com.cafe24.springex.controller"})
public class WebConfig {
	
	
}
