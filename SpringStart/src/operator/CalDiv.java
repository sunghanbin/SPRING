package operator;

public class CalDiv implements Calculator{
	
	@Override
	public int sum(int firstNum, int secondNum) {
		
//		 ? = Sql 에서 case 문 같은것  
//		 secondNum 이 0 이아니면 (firstNum / secondNum) 0이라면 0 리턴 해준다.
//		 비교할 문     ? 맞다면 이곳 : 아니라면 이곳 
		return secondNum != 0 ? (firstNum / secondNum) : 0;
	}

}
