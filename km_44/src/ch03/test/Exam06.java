package ch03.test;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð��� �� ������ �Է��ϼ��� : ");
		int sce = sc.nextInt();
		
		int hour = sce / 3600;
		int min = (sce % 3600) / 60;
		int scend = (sce % 3600) % 60;
		int scend2 = sce%60;
		System.out.printf("%d�ʴ� %d�ð� %d�� %d���Դϴ�.", sce, hour,min,scend );
		System.out.println(scend2);
	}

}
