package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.bean.Product;

@Component
public class RunnerClass implements CommandLineRunner {
	
	@Autowired
	private Product prod;
	@Override
	public void run(String... args) throws Exception {

		System.out.println(prod);
	}

}
