package ch03.test;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int input = sc.nextInt();
		System.out.println();
		
		boolean result = false;
		// ���۰��� ��������� ��.
		
		if (input > 0) {
			result = true;
		}
		
		System.out.println("num�� �� :" + input);
		System.out.println("result�� �� : " + result);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : " );
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("�̸��� " + name + "�̰� " + "���̴� " + age + "��, " + "Ű�� " + height + "cm �Դϴ�." );
		
		
		
	}
}
