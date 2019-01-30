package com.brms.book.service;






import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;

public class BookRegisterService {
//	책 등록
	@Autowired
	private BookDao bookDao;
	
//	디폴트 생성자
	public BookRegisterService() {}
	
	public void register(Book book) {
		bookDao.insert(book);
	}

//	이것이 스프링 컨테이너에서  태그로  상속한 메소드들이다. 사용법은 메서드 명을 동일하게 만들어주면된다.
	public void initmethod() {
		System.out.println("빈객체 생성");

	}
	
	public void destroyMethod() {
		System.out.println("빈객체 소멸");

	}
}
