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
		
		System.out.println("������ ������ -1�� �Է�");
		
		while(true)
		{
			System.out.print("�����Է� : ");
			int n = sc.nextInt();
			if (n == -1) break;
			num.add(n);
		}
		
		int a = 0;
		for (int i = 0; i < num.size(); i++) {
			a++;
			System.out.print(a + "��° �� - " + "\"" + num.get(i) + "\"" );
			System.out.println();
		}
	}
}
