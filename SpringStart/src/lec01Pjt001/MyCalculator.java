package lec01Pjt001;

import operator.Calculator;

public class MyCalculator {

	public int fNum, sNum;
	public Calculator calculator;
//                                          �ܺ� ��ü�� ����� �Ķ���͸� �ް� �ִ�. �ܺ��� ��ü���� �̷��� �ҷ��� 
//	��										����ϴ°��� ����  �ϴ°��� ��. �̷��Ի���ϴ� �̰� Ŭ������ �����̳� ��� �θ� ���ִ�. 
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
