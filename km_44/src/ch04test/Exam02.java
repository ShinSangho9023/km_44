package ch04test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int input = sc.nextInt();
		
		if (input % 2 == 0) {
			System.out.println(input + " : ¦���Դϴ�.");
		}
		else { 
			System.out.println(input + " : Ȧ�� �Դϴ�.");
		}
		
		
	}

}
