package com.word.service;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	// 선언
	private WordDao wordDao;
	
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
