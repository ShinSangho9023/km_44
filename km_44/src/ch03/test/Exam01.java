package ch03.test;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		
		boolean result = false;
		// 시작값을 지정해줘야 함.
		
		if (input > 0) {
			result = true;
		}
		
		System.out.println("num의 값 :" + input);
		System.out.println("result의 값 : " + result);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : " );
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("이름은 " + name + "이고 " + "나이는 " + age + "세, " + "키는 " + height + "cm 입니다." );
		
		
		
	}
}
