package ch04;

public class WhileExample01 {

	public static void main(String[] args) {
		int num = 1; //���� ����
		int sum = 0; //���� ���� ����� ���ÿ� �ʱ�ȭ
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

	
}
