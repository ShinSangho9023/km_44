package api;

import java.util.Scanner;

public class IntegerTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� ���� (2/8/10/16) : ");
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		System.out.print("�����Է� (" + num1 +"����) : ");
		String num3 = Integer.toUnsignedString(num2, num1);
		System.out.println(num3);
		
		int num4 = Integer.parseInt(num3, num1);
		
		System.out.print("��ȯ�� ���� (2/8/10/16) : ");
		int num5 = sc.nextInt();
		String num6 = Integer.toUnsignedString(num4, num5);
		System.out.printf("%s(%d) > %s(%d)",num3, num1, num6, num5);
		
	}
}


// ���� �� 1)
//���â
//�Է��� ���� (2/8/10/16) : 2
// �����Է� (2����) : 11111111
// ��ȯ�� ���� (2/8/10/16) : 16
// 11111111(2) > FF(16)


//���� �� 2)
//���â
//�Է��� ���� (2/8/10/16) : 10
//�����Է� (2����) : 255
//��ȯ�� ���� (2/8/10/16) : 2
//255(10) > 1111111(2)



