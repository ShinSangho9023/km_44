// 반복문 //계속 반복하다가 제대로 입력받으면 빠져나온다.
// 입력
// 검증
// 입력 오류일때는 다시 입력


// 결과 출력
package api;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest04 
{

	public static void main(String[] args) 
	{
		// 000000-0000000 형식
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		String input = null;
		Calendar c = Calendar.getInstance();
		
		a:
		while(true) 
		{
			System.out.print("주민등록번호 (000000-0000000) 형식) :");
			input = sc.next();
			int 만나이 = 0;
			String man = null;
			String femle = null;
			int nowMonth = c.get(Calendar.MONTH) + 1;
			
			// 변수 ----------------------------------------------
			
			if (input.length() != 14) 
			{ 
				System.out.println("글자수 입력 오류 입니다.");
				continue  a;
			} //체크 
			
			for (int i = 0; i < input.length(); i++) 
			{
				if (i != 6) 
				{
					if (input.charAt(i) < '0' || input.charAt(i) > '9') 
					{
					System.out.println("숫자를 입력하세요");
					continue a;
					}
				}
			}// 체크
				
			char sex = input.charAt(7);
			
			if (input.charAt(6) != '-') 
			{
				System.out.println("-위치 입력 오류 입니다.");
				continue  a;
			}// 체크
			
			if (sex < '1' || sex >  '4') 
			{
				System.out.println("성별 입력 오류 입니다.");
				continue  a;
			}// 체크
			
			int month = Integer.parseInt(input.substring(2,4));
			int year = Integer.parseInt(input.substring(0, 2));
			int day = Integer.parseInt(input.substring(4,6));
			int maxDay = 0;
			System.out.println(month);
			
			switch (month) 
			{
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : maxDay = 31;
			break;
			case 4 :
			case 6 :
			case 9 :	
			case 11 : 
				maxDay = 30;
				break;
			case 2 : 
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
				{		
					maxDay = 29;
				}
				else 
				{
					maxDay = 28;
				}
				break;
			default: ;
			}
			
			if (month < 0 || month > 12) 
			{
				System.out.println("월은 1~12로 입력하세요");
				continue  a;
			}
			
			if (day > maxDay || day < 0) {
				System.out.println("일을 제대로 입력하세요");
				continue  a;
			}
			
			// 오류문 끝남 -----------------------------------
			 
			if (sex == '1' || sex == '2' ) 
			{
				year += 1900;
				만나이 = 2023 - year;
			}
			
			if (sex == '3' || sex == '4' ) 
			{
				year += 2000;
				만나이 = 2023 - year;
			}
			
			if (month > nowMonth) 
			{
				만나이 -= 1;
			}
			
			if (sex == '1' || sex == 3) 
			{
				man = "남자";
				System.out.printf("%s년 %d월 %d일생 만 %d세 %s입니다.",year,month,day,만나이,man );
				return;
			}
			else 
			{
				femle = "여자";
				System.out.printf("%s년 %d월 %d일생 만 %d세 %s입니다.",year,month,day,만나이,femle );
				return;
			}
		}
	}
}