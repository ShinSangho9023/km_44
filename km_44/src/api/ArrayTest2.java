package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
//		num.add(new Integer(1));
//		num.add(2);
		
		System.out.println("나가고 싶으면 -1을 입력");
		
		while(true)
		{
			System.out.print("정수입력 : ");
			int n = sc.nextInt();
			if (n == -1) break;
			num.add(n);
		}
		
		int a = 0;
		for (int i = 0; i < num.size(); i++) {
			a++;
			System.out.print(a + "번째 값 - " + "\"" + num.get(i) + "\"" );
			System.out.println();
		}
	}
}
