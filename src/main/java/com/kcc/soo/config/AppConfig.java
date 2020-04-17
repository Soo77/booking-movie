package com.kcc.soo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "com.kcc.soo", excludeFilters = {
    @Filter(type = FilterType.REGEX, pattern = "com.kcc.soo.web.*")})

@EnableWebMvc
public class AppConfig {

}
