package com.brms;



import org.springframework.context.support.GenericXmlApplicationContext;

import com.brms.book.Book;
import com.brms.book.service.BookRegisterService;
import com.brms.book.service.BookSearchService;

public class MainClass {

	public static void main(String[] args) {
		
		String[] bNums = {"793","79w3","79e3","79d3","79q3"};
		String[] bTitle = {"html","css","jQuery","java","spring"};
		
		String[] mIds = {"rabbit","hippo","raccoon","elephan","lion"};
		String[] mPws = {"454","4869","45688","77777","11111"};
		String[] mNames = {"agatha","barbara","chris","doris","elva"};
		
//		스프링컨테이너생성
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		
		// 더미 도서목록 등록
		// 스프링컨테이너를 생성한다. 자료형은 객체자료형으로써 BookRegisterService 로 선언하고
		// getBean으로 사용할 객체를 생성한다.
		BookRegisterService bookRegisterService = 
				ctx.getBean("bookRegisterService", BookRegisterService.class);
		for (int i = 0; i < bNums.length; i++) {
			Book book = new Book(bNums[i], bTitle[i], true,null);
			bookRegisterService.register(book);

		}
//		더미 도서목록 등록한것을 셀렉트하여 하나씩 출력해보기
		BookSearchService bookSearchService =
				ctx.getBean("bookSearchService",BookSearchService.class);
		System.out.println("/bNum/bTitle/mIds/mPws/mNames");
		System.out.println("--------------------------------");
		for(int i = 0;i<bNums.length;i++) {
			Book book = bookSearchService.searchBook(bNums[i]);
			System.out.print(book.getbNum()+"\t");
			System.out.print(book.getbTitle()+"\t");
			System.out.print(book.isbCanRental()+"\t");
			System.out.println(book.getbMember() == null ? null : book.getbMember());
			
			
		}
		
		ctx.close();
	}

}
