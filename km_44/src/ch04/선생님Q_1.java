package ch04;

import java.util.Scanner;

public class ������Q_1 {

	public static void main(String[] args) {
		Scanner sc = Scanner(System.in);
		
		System.out.print("�� 1 �Է� : ");
		double val1 = sc.nextDouble();
		System.out.print("�� 2 �Է� : ");
		double val2 = sc.nextDouble();
		
		System.out.print("������ �Է� : ");
		String operator = sc.next();
		double result = 0.0;
		switch (operator) {
		
		case "+": result = val1 + val2;
			break;
		case "-": result = val1 - val2;
			break;
		case "*": result = val1 * val2;
			break;
		case "/": 
			if (val2 == 0) {
				return;
			}
			else {
				result = val1 / val2;
			}
			break;	
		default: System.out.println("������ ����");
		
		System.out.printf("%.2f %s %.2f = %.2f", val1, operator, val2, result);
		}

	}

}
