package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.GenericService;

@Component
public class RunnerClass implements CommandLineRunner {

	@Autowired
	private GenericService service;
	
	public void run(String... args) throws Exception {

		service.executeTask();
	}

}
