package ch03.test;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ������ �Է��ϼ��� : ");
		int price = sc.nextInt();
		
		int ������ = price / 50000;
		
		int ���� = (price % 50000) / 10000;
		
		int ��õ�� = ((price % 50000) % 10000) / 5000;
		
		int õ�� = (((price % 50000) % 10000) % 5000) / 1000;
		
	    int �Ž����� = (((price % 50000) % 10000) % 5000) % 1000;
	    
	    System.out.printf("%d�� 5������ %d�� ������ %d��, 5õ���� %d��, õ���� %d���� �����ϰ� %d���� �����ϴ�.",
	    		price,������,����,��õ��,õ��,�Ž�����);		
	}
}
