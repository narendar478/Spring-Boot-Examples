package com.app;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());
		System.out.println(args.getOptionValues("db"));
		System.out.println(Arrays.asList(args.getSourceArgs()));
		System.out.println(args.containsOption("nalla"));
		System.out.println(args.containsOption("db"));
		
		
	

}
}

