package ch04test;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �ظ� �Է��ϼ��� : ");
		int year = sc.nextInt();
		int month = 0;
		
		month = (year - 3) % 12;
		String �� ="";
		
		
		switch (month) {
		
		case 1: 
			�� = "��";
			break;
		case 2: 
			�� = "��";
			break;
		case 3: 
			�� = "ȣ����";
			break;
		case 4: 
			�� = "�䳢";
			break;
		case 5: 
			�� = "��";
			break;
		case 6: 
			�� = "��";
			break;
		case 7: 
			�� = "��";
			break;
		case 8: 
			�� = "��";
			break;
		case 9: 
			�� = "������";
			break;
		case 10: 
			�� = "��";
			break;
		case 11: 
			�� = "��";
			break;
		case 0: 
			�� = "����";
		}
		
		System.out.printf("%d����� %s �Դϴ�",year,��);

	}

}
