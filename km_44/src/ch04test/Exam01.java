package ch04test;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int b = sc.nextInt();
		System.out.print("����° ���� �Է� : ");
		int c = sc.nextInt();
		
		int big;
		
//		if (a > b && a > c) {
//			big = a;
//		}
//		else if (b > c && b > a ) {
//			
//			big = b;
//		}
//		else {
//			big = c;
//		}
		
		big = a;
		
		if (b > big) {
			
			big = b;
		}
		
		if (c > big) {
			
			big = c;
		}
		
		System.out.printf("%d,%d,%d �� ���� ū ���� %d�Դϴ�.",a,b,c,big);
	}

}
