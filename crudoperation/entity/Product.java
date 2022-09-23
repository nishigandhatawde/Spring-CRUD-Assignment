package com.crudoperation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	@Column
	private String prodName;
	@Column
	private int prodQuantity;
	@Column
	private double prodPrice;

	public Product() {

	}

	public Product(int prodId, String prodName, int prodQuantity, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodQuantity = prodQuantity;
		this.prodPrice = prodPrice;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodQuantity=" + prodQuantity
				+ ", prodPrice=" + prodPrice + "]";
	}
}
