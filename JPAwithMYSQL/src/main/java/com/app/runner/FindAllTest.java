package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class FindAllTest  implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		
		/*Product p=new Product();
		p.setProdId(10);
		p.setProdCode("MOB");
		p.setProdCost(1000);
		p.setVendorCode("mobile");

		repo.save(p);*/
		System.out.println("Impl for REPO class is"+repo.getClass().getName());
		// 1) selecting all columns and rows
		//repo.findAll().forEach(System.out::println);
		// 2) Using Example
		Product p=new Product();
		//p.setProdCode("MOB");
		p.setVendorCode("mobile");
		//p.setProdCost(1000);
		//p.setProdId(3);
		Example<Product> ex=Example.of(p);
		//repo.findAll(ex).forEach(System.out::println);
		
		// 3) Sorting
		
		//repo.findAll(Sort.by(Direction.DESC, "prodCode")).forEach(System.out::println);
		// 4) Pageable
		
		PageRequest pageable=PageRequest.of(0, 1);
		//repo.findAll(pageable).forEach(System.out::println);
		
		// 5) Example and Sort
		
		//repo.findAll(ex, Sort.by(Direction.DESC, "prodCode")).forEach(System.out::println);
		// 6) Example and Pageable
		
		//repo.findAll(ex, pageable).forEach(System.out::println);
		
// -----------findBy methods(selecting particular columns and rows)------------------------
		
		Product p1=repo.findByProdCode("TV");
		//System.out.println(p1);
		
		//repo.findByProdCodeLike("TV").forEach(System.out::println);
		//repo.findByProdCodeIsNull().forEach(System.out::println);
		//repo.findByProdCostOrProdCode(1000.00, "AC").forEach(System.out::println);
		//repo.findByProdCostIn(Arrays.asList(1000.0,2000.0,3000.0)).forEach(System.out::println);
		System.exit(0);
		
		
	}

}
