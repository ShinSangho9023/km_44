package ch04;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int num = 0;
		
		while(true) {
			
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			total += num; 
				
			if (num == 0) {
				System.out.print("�հ� : " + total);
				return;
			}
		}
	}
}
