package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner{
	
	@Value("${my.key}")
	private String name;

	public void run(String... args) throws Exception {
		
		System.out.println(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}

	
	
}
