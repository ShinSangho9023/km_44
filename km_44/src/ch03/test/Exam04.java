package ch03.test;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목1 : ");
		int sub1 = sc.nextInt();
		
		System.out.print("과목2 : ");
		int sub2 = sc.nextInt();
		
		System.out.print("과목3 : ");
		int sub3 = sc.nextInt();
		
		double avg = (sub1 +sub2 + sub3) / 3.0;
					
		String result = (avg >= 60 && sub1 >= 40 && sub2 >= 40 && sub3 >= 40) ? "합격" : "불합격"; 
		System.out.printf("평균 : %.2f \n%s", avg, result);		
		
	}
}
