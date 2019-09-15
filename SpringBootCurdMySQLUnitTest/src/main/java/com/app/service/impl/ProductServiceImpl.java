package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductRepository repo;

	public Integer saveProduct(Product p) {
		p=repo.save(p);
		Integer prodId=p.getProdId();
		return prodId;
	}

	public void deleteProduct(Integer prodId) {
		repo.deleteById(prodId);
	}

	public Product getProductById(Integer prodId) {
		Optional<Product> p=repo.findById(prodId);
		if(p.isPresent()) {
			return p.get();
		}else {
			return new Product();
		}
	}

	public List<Product> getAllProducts() {
		List<Product> prods=repo.findAll();
		return prods;
	}

	@Override
	public boolean isProductExist(Integer id) {
		return repo.existsById(id);
	}
}
