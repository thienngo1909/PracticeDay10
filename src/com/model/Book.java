package com.model;

public class Book {
	public char code;
	public String title,authors;
	public int price;
	
	public Book() {
		
	}
	
	public Book(char a,String b,int c, String d) {
		this.code = a;
		this.title = b;
		this.price =c;
		this.authors = d;
	}
	
	public void displayInfo() {
		System.out.println("Code: "+this.code);
		System.out.println("Title: "+this.title);
		System.out.println("Price: "+this.price);
		System.out.println("Authors: "+this.authors);
	}
	
	public int getPrice() {
		return price;
	}
	public void maxPrice(Book b1,Book b2, Book b3) {
		System.out.println("Book max price: ");
		if(b1.price>b2.price&&b1.price>b3.price)
			b1.displayInfo();
		else if(b2.price>b1.price && b2.price>b3.price)
			b2.displayInfo();
		else
			b3.displayInfo();
	}

}
