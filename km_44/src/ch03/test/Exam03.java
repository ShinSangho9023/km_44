package ch03.test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int 국어 = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int 영어 = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int 수학 = sc.nextInt();
		
		int total = 국어 + 영어 + 수학;
		double avg = total / 3.0;
		
		System.out.printf("총점 : %d 평균 : %.2f", total, avg);
	}
}
