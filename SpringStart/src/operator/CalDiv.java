package operator;

public class CalDiv implements Calculator{
	
	@Override
	public int sum(int firstNum, int secondNum) {
		
//		 ? = Sql ���� case �� ������  
//		 secondNum �� 0 �̾ƴϸ� (firstNum / secondNum) 0�̶�� 0 ���� ���ش�.
//		 ���� ��     ? �´ٸ� �̰� : �ƴ϶�� �̰� 
		return secondNum != 0 ? (firstNum / secondNum) : 0;
	}

}
