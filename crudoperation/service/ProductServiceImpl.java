package com.crudoperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudoperation.entity.Product;
@Service
public class ProductServiceImpl extends ProductService{

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return super.saveProduct(product);
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return super.saveProducts(products);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return super.getProducts();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return super.getProductById(id);
	}

	@Override
	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return super.getProductByName(name);
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return super.deleteProduct(id);
	}

	@Override
	public Product updateProdut(Product product) {
		// TODO Auto-generated method stub
		return super.updateProdut(product);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
