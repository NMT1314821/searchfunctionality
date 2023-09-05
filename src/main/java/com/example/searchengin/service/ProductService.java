package com.example.searchengin.service;

import java.util.List;

import com.example.searchengin.model.Product;

public interface ProductService 
{
	
	public Product saveData(Product product);

	public List<Product> searchProducts(String query);
}
