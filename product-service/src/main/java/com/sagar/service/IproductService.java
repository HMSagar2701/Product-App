package com.sagar.service;

import java.util.List;

import com.sagar.entity.Product;

public interface IproductService {

	Product getProduct(Integer id);
	List<Product>getAllProduct(Product product);
	void createProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Integer id);
	
}
