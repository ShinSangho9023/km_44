package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		double d;
		String s1, s2;
		// �������ٰ��� �Է��� �� ����Ű�� ���´�. �׷��� ���۸� sc.nextLine();���� ������ �Ѵ�. ���� �Է¹޾Ҵٰ� �ؽ�Ʈ�������� ������ �Է¹����� �̷��� �����߻�
		System.out.print("���ڿ�:");
		s1 = sc.next();
		
		sc.nextLine();
		
		System.out.print("����:");
		i = sc.nextInt();
		
		System.out.print("�Ǽ�:");
		d = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("���ڿ�:");
		s2 = sc.nextLine();
		
		System.out.println(s1 + "," + i + "," + d + ","+s2);
	}

}
