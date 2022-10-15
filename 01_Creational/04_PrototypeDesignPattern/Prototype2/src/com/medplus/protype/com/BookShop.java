package com.medplus.protype.com;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	
	//clonable method
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop shop = new BookShop();
		for (Book b: this.getBooks()) {
			shop.getBooks().add(b);
		}
		
		return shop ;
		
	}

	private String shopname ;
	
	List<Book> books = new ArrayList<>() ;

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	public void loadData() {
		// jdbc connection and getting the data
		
		for (int i=1 ;i<=10 ; i++ ) {
			 Book b = new Book();
			 b.setBid(i);
			 b.setBname("book" + i);
			 getBooks().add(b);
		}
		
	}

	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}

	
	
	
}
