package com.niit.vamshi;

import org.springframework.stereotype.Component;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.GenericApplicationContext;
@Component
public class Product {
	private String id;
	private String name;
	private String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
		
	}

