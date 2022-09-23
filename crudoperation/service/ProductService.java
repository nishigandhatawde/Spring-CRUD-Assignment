package com.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.entity.Product;
import com.crudoperation.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {

		return repository.save(product);
	}
//save product
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
//get product
	public List<Product> getProducts() {
		return repository.findAll();
	}

	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);

	}

	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
//delete product
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product removed ||" + id;
	}
//update product
	public Product updateProdut(Product product) {
		
		Product existingProduct=repository.findById(product.getProdId()).orElse(null);
		existingProduct.setProdName(product.getProdName());
		existingProduct.setProdPrice(product.getProdPrice());
		existingProduct.setProdQuantity(product.getProdQuantity());
		return repository.save(existingProduct);
	}
}