package ch04;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true) {
			
			printMainMenu();
			
			int input = sc.nextInt();
			
			switch (input) {
				case 1: 
					System.out.println("\"1. 전체 일정 보기 메뉴를 선택했습니다.\"");
					break;
				case 2:
					System.out.println("\"2. 일정 등록 보기 메뉴를 선택했습니다.\"");
					break;
					
				case 3:
					System.out.println("\"2. 일정 검색 보기 메뉴를 선택했습니다.\"");	
					break;
				case 4:
					System.out.println("\"2. 일정 삭제 보기 메뉴를 선택했습니다.\"");	
					break;
				case 0:
					System.out.println("\"2. 프로그램을 종료합니다.\"");
					return;//System.exit(0);//return;//System.exit(0);
				default : 
					System.out.println("없는 번호입니다 다시 입력하세요");
					
			}
			
			
			
			
			
			
			
		}

	}
	//private = 이 클레스 안에서만 사용가능하다.
	//void = 값을 어떤 변수에 반환하지 않는다.
	//static = 객채를 생성하지 않아도 사용이 가능
	
	private static void printMainMenu() {
		System.out.println("[일정 관리]");
		System.out.println("1. 전체일정 보기");
		System.out.println("2. 일정 등록");
		System.out.println("3. 일정 검색");
		System.out.println("4. 일정 삭제");
		System.out.println("0. 종료");
		System.out.print("* 번호 선택 : ");
	}
}
