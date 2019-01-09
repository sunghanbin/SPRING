package lec01Pjt001;

import operator.Calculator;

public class MyCalculator {

	public int fNum, sNum;
	public Calculator calculator;
//                                          외부 객체를 사용해 파라메터를 받고 있다. 외부의 객체들을 이렇게 불러서 
//	ㅅ										사용하는것을 주입  하는것이 다. 이렇게사용하는 이곳 클래스가 컨테이너 라고 부를 수있다. 
	public MyCalculator(int fNum, int sNum, Calculator calculator) {
		this.fNum = fNum;
		this.fNum = sNum;
		this.calculator = calculator;

	}
	
	public void result() {
		int value = calculator.sum(this.fNum,this.sNum);
		System.out.println("result : "+ value);
	}

	public int getfNum() {
		return fNum;
	}

	public void setfNum(int fNum) {
		this.fNum = fNum;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	

}
