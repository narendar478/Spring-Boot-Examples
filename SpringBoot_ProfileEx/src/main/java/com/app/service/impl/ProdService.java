package com.app.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.GenericService;

@Component
@Profile("prod")
public class ProdService implements GenericService {

	
	@Value("${code}")
	private String code;
	
	@Value("${a}")
	private int a;
	
	@Value("${b}")
	private int b;
	
	@Value("${c}")
	private int c;
	
	@Value("${d}")
	private int d;

	@Value("${driver}")
	private String driver;
	
	@Value("${host}")
	private String host;
	@Override
	public void executeTask() {

		System.out.println("from Production");
		System.out.println(code);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(driver);
		System.out.println(host);
	}


}
