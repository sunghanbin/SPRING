package TestHardPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext Gxa = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk transportationWalk =  Gxa.getBean("tWalk",TransportationWalk.class);
		transportationWalk.move();
		
		Gxa.close();

	}

}
