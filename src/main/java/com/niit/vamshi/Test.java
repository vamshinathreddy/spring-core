package com.niit.vamshi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.vamshi");
		context.refresh();
		context.getBean("category");
		System.out.println("created buddie");
		Product p=(Product) context.getBean("product");
		p.setId("100");
		p.setName("dheeraj");
		p.setPrice("100");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		
	}

}
