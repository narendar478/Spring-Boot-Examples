package com.app.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.GenericService;

@Component
@Profile("default")
public class DevService implements GenericService {
	
	@Value("${code}")
	private String code;
	
	@Value("${a}")
	private int a;
	@Value("${b}")
	private int b;
	@Value("${c}")
	private int c;
	

	@Override
	public void executeTask() {

		System.out.println("from Development");
		System.out.println(code);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
