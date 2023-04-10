package ch04test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int input = sc.nextInt();
		
		if (input % 2 == 0) {
			System.out.println(input + " : 짝수입니다.");
		}
		else { 
			System.out.println(input + " : 홀수 입니다.");
		}
		
		
	}

}
