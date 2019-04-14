package com.app.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.GenericService;

@Component
@Profile("uat")
public class UatService implements GenericService {

	@Value("${code}")
	private String code;

	@Override
	public void executeTask() {

		System.out.println("from UAT");
		System.out.println(code);
	}


}
