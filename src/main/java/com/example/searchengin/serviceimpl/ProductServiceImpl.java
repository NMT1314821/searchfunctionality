package com.example.searchengin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.searchengin.model.Product;
import com.example.searchengin.repository.ProductRepository;
import com.example.searchengin.service.ProductService;
import lombok.AllArgsConstructor;
@Service
public class ProductServiceImpl implements ProductService
{
	
	private ProductRepository productRepo;
	
	public ProductServiceImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public Product saveData(Product product) 
	{
		
		return productRepo.save(product);
	}

	@Override
	public List<Product> searchProducts(String query) {
		
		List<Product>allp=productRepo.searchProducts(query);
		return allp;
	}

}
