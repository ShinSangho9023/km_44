package ch03.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int age = sc.nextInt(); // BŸ�� �����ȯ��	
		System.out.println("�Է��� ���̴� " + age + "�� �Դϴ�");
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();		
		System.out.println("�̸��� " + name + "�Դϴ�");
		sc.nextLine();// ���� �ִ� \n�� \r�� �Ҹ��Ű�� ���� �ڵ�
		
		
		System.out.print("�ּ� �Է�: ");
		String address = sc.nextLine(); // Line �� ������ ������ ����
		System.out.println("�ּҴ� " + address + "�Դϴ�.");
	}
}
