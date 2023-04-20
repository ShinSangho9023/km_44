package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		double d;
		String s1, s2;
		// 변수에다가가 입력할 때 엔터키가 남는다. 그래서 버퍼를 sc.nextLine();으로 비워줘야 한다. 숫자 입력받았다가 넥스트라인으로 문장을 입력받을때 이럴때 오류발생
		System.out.print("문자열:");
		s1 = sc.next();
		
		sc.nextLine();
		
		System.out.print("정수:");
		i = sc.nextInt();
		
		System.out.print("실수:");
		d = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("문자열:");
		s2 = sc.nextLine();
		
		System.out.println(s1 + "," + i + "," + d + ","+s2);
	}

}
