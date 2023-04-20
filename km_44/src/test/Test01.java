package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) { 
		//키보드로 문자열을 입력받아 출력, 거꾸로 다시 출력
		//abc > cba
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		
		
		for (int i = s.length() -1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));
		}
		
		
		// 배열로 할 수 있을까? 
		 StringBuffer sb = new StringBuffer(s);
		 System.out.println(sb.reverse());
		
		 String a = new String();
		 StringBuffer b = new StringBuffer();
		 
		 
		 
		
		 
		 b.append("a");
		 b.append(1);
		 
		 
		
		
		
		
		
	}

}
