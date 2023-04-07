package ch03.test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);				
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : " );
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "세, " + "키는 " + height + "cm 입니다." );		
		
		System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.2f cm 입니다.", name, age, height);
		// 변수를 쓰거나 실제 값을 써도 된다.
		// %s 문자열, %d는 정수형, %f는 실수형		
	}

}
