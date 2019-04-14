package com.app;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	// 1) Before JDK 1.7--Anonymous inner class
	/*@Bean
	public CommandLineRunner c()
	{
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {

				System.out.println("Runner from anonymous inner class");
			}
		};
	}*/

	
	
	// 2) JDK 1.8 onwards--lamda expressions
	
	@Bean
	public CommandLineRunner c()
	{
		
		return (args)->{
			System.out.println("from lamda expression");
			System.out.println(Arrays.asList(args));
		};
	}
	
	
	
	
	
}
