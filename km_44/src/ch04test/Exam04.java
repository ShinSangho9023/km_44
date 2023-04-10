package ch04test;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		int maxDay = 0;
		
		switch (month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : maxDay = 31;
				break;
			case 4 :
			case 6 :
			case 9 :	
			case 11 : 
				maxDay = 30;
				break;
			case 2 : 
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {		
				maxDay = 29;
				}
				else {
				maxDay = 28;
				}
				break;
			default: System.out.println("�� �Է� ����!");
		}
		
		System.out.println(year + "�� " + month + "���� " + maxDay + "�ϱ��� �ֽ��ϴ�");
	}
}
