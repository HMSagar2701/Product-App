package com.sagar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Product {
	@Id
	private Integer productId;
	@Column(name="product_code")
	private String productCode;
	@Column(name="name")	
	private String name;
	@Column(name="quality")
	private int quality;
	@Column(name="price")
	private float price;
	@Column(name="desc")
	private String description;
	
}
