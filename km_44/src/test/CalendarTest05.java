package test;

import java.util.Calendar;
//Calendar Ŭ����
public class CalendarTest05 
{

	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH + 1); // 1���� ���� 0
		int day = c.get(Calendar.DATE );
		int week = c.get(Calendar.DAY_OF_WEEK); // �������� �ۿ� ���� ������ �� �ʿ����.
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int ampm = c.get(Calendar.AM_PM);
		
		System.out.println(Calendar.AM);
		
		//String names[] = {"��","��","ȭ","��","��","��","��"};
		//String day1 = names [c.get(Calendar.DAY_OF_WEEK) - 1];
		
		String sun = null;
		String dayName = null;
		if (ampm == Calendar.AM) 
		{
			sun = "����";
		}
		else 
		{
			sun = "����";
		}
		
		//switch (c.get(calender.day_of_week)) {
		//  case calender.sunday: day = "��"; break;
		//	case calender.sunday: day = "��"; break;
		//	case calender.sunday: day = "ȭ"; break;
		//	case calender.sunday: day = "��"; break;
		//	case calender.sunday: day = "��"; break;
		//	case calender.sunday: day = "��"; break;
		//	case calender.sunday: day = "��"; break;
		//	}
		
		switch (week) 
		{
		case 1 : dayName = "��"; break;
		case 2 : dayName = "��"; break;
		case 3 : dayName = "ȭ"; break;
		case 4 : dayName = "��"; break;
		case 5 : dayName = "��"; break;
		case 6 : dayName = "��"; break;
		case 7 : dayName = "��"; break;
			default : break;
		}
		
		//2023�� 4�� 20�� ����� ���� 5�� 42�� 45���Դϴ�.
		
		System.out.printf("%d�� %d�� %d�� %s���� %s %d�� %d�� %d�� �Դϴ�.", year,month,day,dayName,sun,hour,min,sec);
	}
}
