package ch07Test;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("�迭�� ũ�� : ");
		input = sc.nextInt();
		
		
		int sum=0;
		int arr [] = new int [input];
		
		if (input < 2) {
			System.out.println("2 �̻��� ���� �Է��ϼ���");
		}else {
		
		System.out.print("�迭�� ũ�� : "+ input);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			int inputArr =sc.nextInt();
			arr [i] = inputArr;
			System.out.printf("�迭 [%d] = %d\n",i,inputArr);
			sum += inputArr;
			
		}
		
		System.out.printf("%d + %");
		
		System.out.print(sum);
		}
	}
}
