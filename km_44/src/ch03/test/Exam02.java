package ch03.test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);				
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : " );
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("�̸��� " + name + "�̰� " + "���̴� " + age + "��, " + "Ű�� " + height + "cm �Դϴ�." );		
		
		System.out.printf("�̸��� %s�̰� ���̴� %d��, Ű�� %.2f cm �Դϴ�.", name, age, height);
		// ������ ���ų� ���� ���� �ᵵ �ȴ�.
		// %s ���ڿ�, %d�� ������, %f�� �Ǽ���		
	}

}
