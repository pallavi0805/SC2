package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Category {
	@Id
	@Column(name="CATEGORY")
	int category
	@Column(name="CATEGORY_NAME")
	String categoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int catego) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
