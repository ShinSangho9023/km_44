package test;

import java.util.Scanner;

// �ֹι�ȣ �Է¹޾� �����ϰ� ��� ���
// 990101-1234567 ���·� �Է�

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if (input.length() != 14) { // ������ ������� �� ���� �������� �߿�. ���ڼ� �˻簡 ���� �ȿ��� -��ġ�� �������� ���̰� 14�� �ƴ϶�� ���ܰ� �߻�.
			System.out.println("���ڼ� �Է� ���� �Դϴ�.");
			return;
		}
		if (input.charAt(6) != '-') {
			//if (input.indexOf('-') != 6)
			//if (!input.substring(6,7).equals("-")) // "1" �� �޸𸮿� �������� �ٸ��� ������ equals �� �� �ؾ��Ѵ�.
			System.out.println("-��ġ �Է� ���� �Դϴ�.");
			return;
		}
//		if (input.charAt(7) != '1' && input.charAt(7) != '2' ) {
//			System.out.println("���� �Է� ���� �Դϴ�.3");
//			return;
//		}
		
		char ch = input.charAt(7);
		
		if (ch < '1' || ch >  '4') {
			System.out.println("���� �Է� ���� �Դϴ�.");
			return;
		}
		
		String man = null;
		String femle = null;
		
		String a = input.substring(0, 2);
		String b = input.substring(2, 4);
		String c = input.substring(4, 6);		
		
		char d = input.charAt(7);
		
		//String sex = ch =='1' || ch == '3' ? "����" : "����"; ���� �����ڸ� ���
		
		if (d == '1' || d == 3) {
			man = "����";
			System.out.printf("%s�� %s�� %s�ϻ� %s�Դϴ�.",a,b,c,man);
		}
		else {
			femle = "����";
			System.out.printf("%s�� %s�� %s�ϻ� %s�Դϴ�.",a,b,c,femle);
		}
	}
}
