package ch03.test;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("��ȯ �� : x=%d, y=%d \n", x, y);
		
		int temp = x;
		
		x = y;
		
		y = temp;
		
		System.out.printf("��ȯ �� : x=%d, y=%d", x, y);
		
	}
}
