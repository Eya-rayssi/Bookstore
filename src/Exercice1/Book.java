package Exercice1;

import java.sql.*;

public class Book {
	private int id;
	private String title;
	private String author;
	private float price;
	private Date releasedate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}

	public Date getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	public Book(int id, String title, String author, float price, Date releasedate) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price=price;
		this.releasedate = releasedate;
	}
	@Override
	public String toString() {
		return "title of the book is"+title+"his author is "+author+"and it price is "+price+"released at"+releasedate;
	}
	
	
}