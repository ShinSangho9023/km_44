package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) { 
		//Ű����� ���ڿ��� �Է¹޾� ���, �Ųٷ� �ٽ� ���
		//abc > cba
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		
		
		for (int i = s.length() -1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));
		}
		
		
		// �迭�� �� �� ������? 
		 StringBuffer sb = new StringBuffer(s);
		 System.out.println(sb.reverse());
		
		 String a = new String();
		 StringBuffer b = new StringBuffer();
		 
		 
		 
		
		 
		 b.append("a");
		 b.append(1);
		 
		 
		
		
		
		
		
	}

}
