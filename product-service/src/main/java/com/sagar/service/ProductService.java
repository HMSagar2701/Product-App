package com.sagar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sagar.entity.Product;
import com.sagar.repository.IProductRepository;
@Component
public class ProductService implements IproductService {
	
	@Autowired
	IProductRepository productRepository;
	@Override
	public Product getProduct(Integer id) {
		Optional<Product> product=productRepository.findById(id);
		return product.get();
	}

	@Override
	public List<Product> getAllProduct(Product product) {
		List<Product> productList = productRepository.findAll();
		return productList;
	}

	@Override
	public void createProduct(Product product) {
		productRepository.save(product);		
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
	}

}
