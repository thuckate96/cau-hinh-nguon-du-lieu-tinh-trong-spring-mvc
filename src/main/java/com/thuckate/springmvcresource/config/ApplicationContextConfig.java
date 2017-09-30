package com.thuckate.springmvcresource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//file nay su dung de cau hinh view 
//Cau hinh de su dung mot hay nhieu bean 
@Configuration
//cau hinh de su dung @configuration
@ComponentScan("com.thuckate.springmvcresource.*")
public class ApplicationContextConfig {
	@Bean(name="viewResolve")
	public InternalResourceViewResolver getViewResolve(){
		InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
		viewResolve.setPrefix("WEB-INF/pages/");
		viewResolve.setSuffix(".jsp");
		return viewResolve;
	}
}
