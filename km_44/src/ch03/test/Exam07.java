package ch03.test;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		int 오만원 = price / 50000;
		
		int 만원 = (price % 50000) / 10000;
		
		int 오천원 = ((price % 50000) % 10000) / 5000;
		
		int 천원 = (((price % 50000) % 10000) % 5000) / 1000;
		
	    int 거스름돈 = (((price % 50000) % 10000) % 5000) % 1000;
	    
	    System.out.printf("%d은 5만원권 %d장 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다.",
	    		price,오만원,만원,오천원,천원,거스름돈);		
	}
}
