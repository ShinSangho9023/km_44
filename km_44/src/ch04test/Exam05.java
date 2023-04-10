package ch04test;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ÅÂ¾î³­ ÇØ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int year = sc.nextInt();
		int month = 0;
		
		month = (year - 3) % 12;
		String ¶ì ="";
		
		
		switch (month) {
		
		case 1: 
			¶ì = "Áã";
			break;
		case 2: 
			¶ì = "¼Ò";
			break;
		case 3: 
			¶ì = "È£¶ûÀÌ";
			break;
		case 4: 
			¶ì = "Åä³¢";
			break;
		case 5: 
			¶ì = "¿ë";
			break;
		case 6: 
			¶ì = "¹ì";
			break;
		case 7: 
			¶ì = "¸»";
			break;
		case 8: 
			¶ì = "¾ç";
			break;
		case 9: 
			¶ì = "¿ø¼þÀÌ";
			break;
		case 10: 
			¶ì = "´ß";
			break;
		case 11: 
			¶ì = "°³";
			break;
		case 0: 
			¶ì = "µÅÁö";
		}
		
		System.out.printf("%d³â»ýÀº %s ÀÔ´Ï´Ù",year,¶ì);

	}

}
