package com.app;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class RunnerOne implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {

		System.out.println("from Runner one");
		
		System.out.println(Arrays.asList(args));// command line args output
		System.out.println(args[1]);
		
	}

	@Override
	public int getOrder() {
		return 10;
	}

}
