package ch04test;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
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
		
		System.out.printf("%d,%d,%d 중 가장 큰 수는 %d입니다.",a,b,c,big);
	}

}
