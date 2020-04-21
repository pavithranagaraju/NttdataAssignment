package com.nttdata.Model;

import java.util.Set;

public class Category {
private int Cid;
private String categoryName;
private Set Products;
public Set getProducts() {
	return Products;
}
public void setProducts(Set products) {
	Products = products;
}
@Override
public String toString() {
	return "Category id=" + Cid + ", categoryName=" + categoryName + ", Products=" + Products + "\n";
}
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
}
