package ch04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt(); 
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("��Ģ���� ��ȣ�� �Է��ϼ���\n");
		String ��ȣ = sc.next();
		
		if (��ȣ.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (��ȣ.equals("-")) {	
			System.out.println(num1 - num2);
		}
		else if (��ȣ.equals("*")) {	
			System.out.println(num1 * num2);
		}
		else if (��ȣ.equals("/")) {	
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		
	}

}
