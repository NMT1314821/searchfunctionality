package com.example.searchengin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.searchengin.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>
{
	
	
	//native sql queries having two attributes value and nativeQuery=true
	
	//always write in the string format
	
	//--->native slq query
	/*@Query(value="select * from products p where "+
	"p.name LIKE CONCAT('%',:query, '%')"+
	"Or p.descri LIKE CONCAT('%',:query, '%')",nativeQuery =true) */
	
	@Query("select p from Product p where " +
	"p.name LIKE CONCAT('%',:query, '%')" +
	"Or p.descri LIKE CONCAT('%',:query, '%')")
	
	public List<Product> searchProducts(String query);
	
	
	
	 

}
