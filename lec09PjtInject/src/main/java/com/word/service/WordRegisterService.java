package com.word.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	
	
	/*@Inject 는 @Autowired 기능 은 동일하지만 
	 * required 기능만 없을 뿐이다 (사실상 사용할일이 많이 없으므로 같은 기능이라고 봐도 될것같다.) 
	 * @Autowired 에서의 @Qualifier 와 동일한기능으로 인젝트 에서는
	 * @Named 기능이있다. 
	 * xml 파일을 건들지 않고
	 * 어노테이션에서 바로 설정할수있다. 여기서는 컨테이너 빈객체의 id 를 넣어주면 된다. 
	 * @Named(value="~~")
	 * */
	@Inject
	@Named(value="wordDao1")
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
