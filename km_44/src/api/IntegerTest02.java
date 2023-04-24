package api;

import java.util.Scanner;

public class IntegerTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 진법 (2/8/10/16) : ");
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		System.out.print("정수입력 (" + num1 +"진수) : ");
		String num3 = Integer.toUnsignedString(num2, num1);
		System.out.println(num3);
		
		int num4 = Integer.parseInt(num3, num1);
		
		System.out.print("변환할 진법 (2/8/10/16) : ");
		int num5 = sc.nextInt();
		String num6 = Integer.toUnsignedString(num4, num5);
		System.out.printf("%s(%d) > %s(%d)",num3, num1, num6, num5);
		
	}
}


// 실행 예 1)
//출력창
//입력할 진법 (2/8/10/16) : 2
// 정수입력 (2진수) : 11111111
// 변환할 진법 (2/8/10/16) : 16
// 11111111(2) > FF(16)


//실행 예 2)
//출력창
//입력할 진법 (2/8/10/16) : 10
//정수입력 (2진수) : 255
//변환할 진법 (2/8/10/16) : 2
//255(10) > 1111111(2)



