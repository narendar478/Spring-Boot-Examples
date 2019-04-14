package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.prf")
@Component
public class TestRunner implements CommandLineRunner {
	
	private int id;
	private String email;
	
	
	

	@Override
	public String toString() {
		
		return "TestRunner [id=" + id + ", email=" + email + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	@Override
	public void run(String... args) throws Exception {
	System.out.println(this);
		
	}

}
