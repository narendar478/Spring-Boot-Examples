package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.app.model.Employee;
import com.app.model.Product;

@SpringBootApplication
public class StarterClassExampleApplication implements CommandLineRunner {

	@Autowired
	private Employee e;
	@Autowired
	private Product p;
	
	
	public static void main(String[] args) {

		SpringApplication sp=new SpringApplication(StarterClassExampleApplication.class);

		sp.setBannerMode(Banner.Mode.OFF);

		//ApplicationContext ac=SpringApplication.run(StarterClassExampleApplication.class, args);
		
		//System.out.println("Welcome");
		
		ApplicationContext ac=sp.run(args);
		
		//System.out.println(ac.getClass().getName());


	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("This is Runner");
		System.out.println(e);
		System.out.println(p);
		
	}

	@Bean
	public Employee emp()
	{
		Employee e=new Employee();
		e.setEmpId(10);
		e.setEmpName("Narendar");
		e.setEmpSal(25000.00);
		return e;
		
	}
	
	
}
