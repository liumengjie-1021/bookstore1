package com.bookstore.pojo;

public class Book {
	private String bookNumber;

	private String bookName;

	private String author;

	private String publisher;

	private Float price;

	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber == null ? null : bookNumber.trim();
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName == null ? null : bookName.trim();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher == null ? null : publisher.trim();
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TBook [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", publisher="
				+ publisher + ", price=" + price + "]";
	}

}
