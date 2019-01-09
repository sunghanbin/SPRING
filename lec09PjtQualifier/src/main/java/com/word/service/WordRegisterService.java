package com.word.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	

	/* @Autowired
	 * 는 생성자 뿐만 아니라 프로퍼티 나 메소드에서 도 사용이 가능 하다.
	 * 단, 조건은 클래스의 디폴트 생성자 가 있어야 가능 하다. 생성자에 오토와이어드가 있다면 가능하지만
	 * 객체가 생성이 되어야 프로퍼티나 메소드를 사용가능 한데
	 * 디폴트 생성자가 없다면 클래스안에 있는 프로퍼티나 메소드가 생성이 되지않기 떄문이다? */
	/*@Resource
	 * 와 @Autowired 차이
	 * 			@Resource			@Autowired
	 * 		객체의 이름이 일치한것에		객체의 타입이 일치한 것에
	 * 		주입 한다					주입 한다.
	 * */
	@Autowired
	@Qualifier("usedDao")
	private WordDao wordDao;

	public WordRegisterService() {
	}
	
//	<constructor-arg ref ="wordDao"/> 를 주석 처리 했기 때문에 기존 의존객체 주입 으로는 에러가 나게 된다.
//	하지만 @Autowired 키워드를 사용하게 되면  아래 생성자에서 파라미터로 받는 타입이 같은 것이 스프링 컨테이너에 존재
//	하면 그 객체를 자동 주입 하게 된다.
//   디폴트 생성자  파라메터를 받는다. 파라메터는 wordDao
	
	public WordRegisterService(WordDao wordDao) {
//		wordDao 파라메터로 들어온값을 여기에 할당 하겠다.
		this.wordDao = wordDao;
	}
//	메소드 제작
	public void register(WordSet wordSet) {

		String wordkey = wordSet.getWordKey();
//		verify 는 제작한 메소드 boolean 형 들어온 파라메터 가 널과 같다면 true 아니라면 false
		if(verify(wordkey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered");
			
		}
	}
	
	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
//		 wordSet 이 널과 같다면 true 아니라면 false 
		return wordSet == null ? true : false;
		
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}
