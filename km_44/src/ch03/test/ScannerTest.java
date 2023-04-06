package ch03.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt(); // B타입 결과반환만	
		System.out.println("입력한 나이는 " + age + "살 입니다");
		
		System.out.print("이름 입력 : ");
		String name = sc.next();		
		System.out.println("이름은 " + name + "입니다");
		sc.nextLine();// 위에 있던 \n과 \r를 소모시키기 위한 코드
		
		
		System.out.print("주소 입력: ");
		String address = sc.nextLine(); // Line 은 개행할 때까지 실행
		System.out.println("주소는 " + address + "입니다.");
	}
}
