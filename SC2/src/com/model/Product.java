package com.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@Column(name="PRODUCT_ID")
	int productId;
	@Column(name="PRODUCT_NAME")
	String productName;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CATEGORY_ID")
	Category category;	
	double price;
	String description;
	int review;	
	@Lob
	@Basic(fetch=FetchType.LAZY)
	 protected byte[] image;
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Column(name="STOCK_AVAILABILITY")
	int stockAvailability;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public int getStockAvailability() {
		return stockAvailability;
	}
	public void setStockAvailability(int stockAvailability) {
		this.stockAvailability = stockAvailability;
	}
	

}
