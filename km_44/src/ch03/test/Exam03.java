package ch03.test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int ���� = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int ���� = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int ���� = sc.nextInt();
		
		int total = ���� + ���� + ����;
		double avg = total / 3.0;
		
		System.out.printf("���� : %d ��� : %.2f", total, avg);
	}
}
