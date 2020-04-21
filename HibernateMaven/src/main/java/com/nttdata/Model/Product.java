package com.nttdata.Model;

public class Product {
private int Pid;
private String ProductName,description;
private Category category;
private double price;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}



@Override
public String toString() {
	return "Product [Pid=" + Pid + ", ProductName=" + ProductName + ", description=" + description + ", price=" + price
			+ "]  ";
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}

}
