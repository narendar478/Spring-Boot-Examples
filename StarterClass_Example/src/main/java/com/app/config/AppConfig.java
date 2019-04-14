package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.model.Product;

@Configuration
public class AppConfig {

	@Bean
	public Product prod()
	{
		Product p=new Product();
		p.setProdId(25);
		p.setProdName("mobile");
		return p;
		
	}
	
}
