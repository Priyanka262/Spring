package com.incapp.SpringJavaBook;

public class JavaBook {
	private double price;
	private String name;
	private AuthorDetail authordetail;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AuthorDetail getAuthordetail() {
		return authordetail;
	}
	public void setAuthordetail(AuthorDetail authordetail) {
		this.authordetail = authordetail;
	}
}
