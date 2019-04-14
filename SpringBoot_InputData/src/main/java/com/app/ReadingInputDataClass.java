package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReadingInputDataClass implements CommandLineRunner{

	@Value("${info.id}")
	private int id;
	@Value("${info.name}")
	private String name;
	@Value("${info.sal}")
	private double sal;
	
	
	@Override
	public void run(String... args) throws Exception {

		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(sal);
	}

}
