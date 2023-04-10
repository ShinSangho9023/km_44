package ch04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt(); 
		System.out.print("숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("사칙연산 기호를 입력하세요\n");
		String 기호 = sc.next();
		
		if (기호.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (기호.equals("-")) {	
			System.out.println(num1 - num2);
		}
		else if (기호.equals("*")) {	
			System.out.println(num1 * num2);
		}
		else if (기호.equals("/")) {	
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}

}
