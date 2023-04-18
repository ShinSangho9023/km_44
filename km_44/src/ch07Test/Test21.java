package ch07Test;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		int b = 0;
		
		System.out.print("Original : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("蹂�寃쏀븯怨� �떢�� �쐞移�1�쓣 �엯�젰�븯�꽭�슂: ");
		int input1 = sc.nextInt();
		b = a[input1];
		System.out.print("蹂�寃쏀븯怨� �떢�� �쐞移�2�쓣 �엯�젰�븯�꽭�슂: ");
		int input2 = sc.nextInt();
		a[input1] = a[input2];
		a[input2] = b; 
		
		System.out.print("new : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	
		
		
		
	}

}
