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
					System.out.println("\"1. ��ü ���� ���� �޴��� �����߽��ϴ�.\"");
					break;
				case 2:
					System.out.println("\"2. ���� ��� ���� �޴��� �����߽��ϴ�.\"");
					break;
					
				case 3:
					System.out.println("\"2. ���� �˻� ���� �޴��� �����߽��ϴ�.\"");	
					break;
				case 4:
					System.out.println("\"2. ���� ���� ���� �޴��� �����߽��ϴ�.\"");	
					break;
				case 0:
					System.out.println("\"2. ���α׷��� �����մϴ�.\"");
					return;//System.exit(0);//return;//System.exit(0);
				default : 
					System.out.println("���� ��ȣ�Դϴ� �ٽ� �Է��ϼ���");
					
			}
			
			
			
			
			
			
			
		}

	}
	//private = �� Ŭ���� �ȿ����� ��밡���ϴ�.
	//void = ���� � ������ ��ȯ���� �ʴ´�.
	//static = ��ä�� �������� �ʾƵ� ����� ����
	
	private static void printMainMenu() {
		System.out.println("[���� ����]");
		System.out.println("1. ��ü���� ����");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� ����");
		System.out.println("0. ����");
		System.out.print("* ��ȣ ���� : ");
	}
}
