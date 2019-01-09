package ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ems.member.Student;

public class StudentDao {
	
	
	
//	 map {키,밸류} 형태의 자료형 
	private Map<String,Student> studentDB = new HashMap<String,Student>();
	
	
//	다오의 메소드 만들기
//	 데이터 베이스와 연결하지 않고 메인 클래스에서 만들어놓은 배열을들을 가지고 사용한다. 
//	이클래스는  dao 처럼 exqutequery나 updatequery  와 비슷한 기능을 하려고 흉내낸 클래스.
	public void insert(Student student) {
		studentDB.put(student.getsNum(),student);
//		 put - hashMap 의 메소드중 값을 넣는 메소드 이다 .
//		키로 학생의 번호를 넣고, 밸류에는 모든 정보를 넣는다.
	}
	
	public Student select(String sNum) {
		return studentDB.get(sNum);
//		파라미터에 숫자를 넣주면 get 해당하는 숫자의 정보를 가져온다.
		
	}
	
	public void update(Student student) {
		
		studentDB.put(student.getsNum(),student);
//		insert 와 동일 하다.
	}
	
	public void delete(String sNum) {
		studentDB.remove(sNum);
//		해당하는 숫자의 내용을 삭제 한다.
	}
	
	public Map<String, Student> getStudentDB() {
		return studentDB;
//		???????
	}

}
