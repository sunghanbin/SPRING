package com.brms.book.dao;


import java.util.HashMap;
import java.util.Map;

import com.brms.book.Book;

public class BookDao {
	
//	데이터 베이스 역활 대신
	private Map<String,Book> bookDB =
			new HashMap<String,Book>();
			
	public void insert(Book book) {
		bookDB.put(book.getbNum(),book);
	}
	
	public Book select(String bNum) {
		return bookDB.get(bNum);		
	}
	
	public Map<String,Book> getBookDB(){
		return bookDB;
	}

}
