package test1Pjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
//		TransporationWalk walk = new TransporationWalk();
//		walk.move();
		
//		컨테이너의 객체에 접근하는법
//		컨테이너에 접근하기 위한 명령어 : GenericApplicationContext
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(classpath :사용할 xml 파일 이름);
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
//		컨테이너에 있는 객체 bean 을 사용하기 위해 사용하는 명령어
//		ctx.getBean(bean객체이름,데이터타입);
		TransporationWalk transporationWalk =  ctx.getBean("tWalk",TransporationWalk.class);
		transporationWalk.move();
		
//		사용하고 난후 자원 반환해줘야 메모리 사용 하지 않는다.
		
		ctx.close();
		
		
		
		
	}

}
