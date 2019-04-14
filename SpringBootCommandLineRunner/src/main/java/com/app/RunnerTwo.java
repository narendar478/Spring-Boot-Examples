package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class RunnerTwo implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		System.out.println("from Runner two");
	}

}
