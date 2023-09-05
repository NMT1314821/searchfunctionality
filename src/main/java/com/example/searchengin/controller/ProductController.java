package com.example.searchengin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchengin.model.Product;
import com.example.searchengin.service.ProductService;

import lombok.AllArgsConstructor;
@RestController
@RequestMapping("api")
public class ProductController 
{

	private ProductService productServ;
	
		public ProductController(ProductService productServ) {
		super();
		this.productServ = productServ;
	}

	@GetMapping("getall")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query)
	{
		List<Product> pro=productServ.searchProducts(query);
		return new ResponseEntity<>(pro,HttpStatus.OK);
	}
	
	@PostMapping("insert")
	public ResponseEntity<Product> saveData(@RequestBody Product product)
	{
		Product pr=productServ.saveData(product);
		return new ResponseEntity<>(pr,HttpStatus.CREATED);
	}
	
}
