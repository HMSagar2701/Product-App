package com.sagar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.entity.Product;
import com.sagar.service.IproductService;

@RestController
@RequestMapping("/v1")
public class ProductController {
	@Autowired
	IproductService productService ;
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(String id){
		
		return null;
	}

	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProduct(String id){
		
		return null;
	}

	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(Product product){
		
		return null;
	}
	
	@PutMapping("/product")
	public ResponseEntity<Product> deleteProduct(String id){
		return null;
	}
	}

