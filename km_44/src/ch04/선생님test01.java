package ch04;

import java.util.Scanner;

public class ������test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� 1 �Է� : ");
		double val1 = sc.nextDouble();
		System.out.print("�� 2 �Է� : ");
		double val2 = sc.nextDouble();
		
		System.out.print("������ �Է� : ");
		String operator = sc.next();
		
		// �и� 0�϶��� ��� ��� ���ϴ� ���
		// �÷��� ������ ����ϱ�
		boolean is_print = true;
		
		// return ����ϱ� 
		
		double result = 0.0;
		
		// ��ü�� ���� ���� ���� equals �޼��带 ����Ѵ�.
		if(operator.equals("+")) {
			result = val1 + val2;
		}
		else if (operator.equals("-")) {
			result = val1 - val2;
		}
		else if (operator.equals("*")) {
			result = val1 * val2;
		}
		else if (operator.equals("/")) {
			if (val2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				is_print = false;
				return;// �� ������ ������ �޼��带 �ߴܽ�Ű�� ��.
			}
			else {
				result = val1 / val2;
			}
		}
		else {
			System.out.println("������ ����!");
		}
		if (is_print) {
		System.out.printf("%.2f %s %.2f = %.2f", val1, operator, val2, result);
		}
	}	
}
