// �ݺ��� //��� �ݺ��ϴٰ� ����� �Է¹����� �������´�.
// �Է�
// ����
// �Է� �����϶��� �ٽ� �Է�


// ��� ���
package api;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest04 
{

	public static void main(String[] args) 
	{
		// 000000-0000000 ����
		// ���� ����
		Scanner sc = new Scanner(System.in);
		String input = null;
		Calendar c = Calendar.getInstance();
		
		a:
		while(true) 
		{
			System.out.print("�ֹε�Ϲ�ȣ (000000-0000000) ����) :");
			input = sc.next();
			int ������ = 0;
			String man = null;
			String femle = null;
			int nowMonth = c.get(Calendar.MONTH) + 1;
			
			// ���� ----------------------------------------------
			
			if (input.length() != 14) 
			{ 
				System.out.println("���ڼ� �Է� ���� �Դϴ�.");
				continue  a;
			} //üũ 
			
			for (int i = 0; i < input.length(); i++) 
			{
				if (i != 6) 
				{
					if (input.charAt(i) < '0' || input.charAt(i) > '9') 
					{
					System.out.println("���ڸ� �Է��ϼ���");
					continue a;
					}
				}
			}// üũ
				
			char sex = input.charAt(7);
			
			if (input.charAt(6) != '-') 
			{
				System.out.println("-��ġ �Է� ���� �Դϴ�.");
				continue  a;
			}// üũ
			
			if (sex < '1' || sex >  '4') 
			{
				System.out.println("���� �Է� ���� �Դϴ�.");
				continue  a;
			}// üũ
			
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
				System.out.println("���� 1~12�� �Է��ϼ���");
				continue  a;
			}
			
			if (day > maxDay || day < 0) {
				System.out.println("���� ����� �Է��ϼ���");
				continue  a;
			}
			
			// ������ ���� -----------------------------------
			 
			if (sex == '1' || sex == '2' ) 
			{
				year += 1900;
				������ = 2023 - year;
			}
			
			if (sex == '3' || sex == '4' ) 
			{
				year += 2000;
				������ = 2023 - year;
			}
			
			if (month > nowMonth) 
			{
				������ -= 1;
			}
			
			if (sex == '1' || sex == 3) 
			{
				man = "����";
				System.out.printf("%s�� %d�� %d�ϻ� �� %d�� %s�Դϴ�.",year,month,day,������,man );
				return;
			}
			else 
			{
				femle = "����";
				System.out.printf("%s�� %d�� %d�ϻ� �� %d�� %s�Դϴ�.",year,month,day,������,femle );
				return;
			}
		}
	}
}