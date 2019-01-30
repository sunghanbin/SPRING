package com.brms.book.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;


// implements(구현) 로 InitializingBean,DisposableBean 클래스에서 구현하여  빈객체의 생성과종료 생명주기를 관리할수있다.1번방법 
public class BookSearchService implements InitializingBean,DisposableBean{
	
	@Autowired
	private BookDao bookDao;
	
	public BookSearchService() {}
	
	public Book searchBook(String bNum) {
		Book book = bookDao.select(bNum);
		return book;
	}

	@Override
	public void destroy() throws Exception {
		//System.out.println("bean객체 생성");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//System.out.println("bean객체 소멸");
		
	}

}
