package ch07Test;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("배열의 크기 : ");
		input = sc.nextInt();
		
		
		int sum=0;
		int arr [] = new int [input];
		
		if (input < 2) {
			System.out.println("2 이상의 값을 입력하세요");
		}else {
		
		System.out.print("배열의 크기 : "+ input);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			int inputArr =sc.nextInt();
			arr [i] = inputArr;
			System.out.printf("배열 [%d] = %d\n",i,inputArr);
			sum += inputArr;
			
		}
		
		System.out.printf("%d + %");
		
		System.out.print(sum);
		}
	}
}
