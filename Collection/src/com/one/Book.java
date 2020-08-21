package com.one;

public class Book {
	public int bookId;
	public String author;
	public float price;
	
	
	public Book(int bookId, String author, float price) {

		this.bookId = bookId;
		this.author = author;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", price=" + price + "]";
	}
	
}
