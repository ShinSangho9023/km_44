package test;

import java.util.Calendar;
//Calendar 클래스
public class CalendarTest05 
{

	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH + 1); // 1월의 값이 0
		int day = c.get(Calendar.DATE );
		int week = c.get(Calendar.DAY_OF_WEEK); // 동적으로 작용 따로 수정해 줄 필요없다.
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int ampm = c.get(Calendar.AM_PM);
		
		System.out.println(Calendar.AM);
		
		//String names[] = {"일","월","화","수","목","금","토"};
		//String day1 = names [c.get(Calendar.DAY_OF_WEEK) - 1];
		
		String sun = null;
		String dayName = null;
		if (ampm == Calendar.AM) 
		{
			sun = "오전";
		}
		else 
		{
			sun = "오후";
		}
		
		//switch (c.get(calender.day_of_week)) {
		//  case calender.sunday: day = "일"; break;
		//	case calender.sunday: day = "월"; break;
		//	case calender.sunday: day = "화"; break;
		//	case calender.sunday: day = "수"; break;
		//	case calender.sunday: day = "목"; break;
		//	case calender.sunday: day = "금"; break;
		//	case calender.sunday: day = "토"; break;
		//	}
		
		switch (week) 
		{
		case 1 : dayName = "일"; break;
		case 2 : dayName = "월"; break;
		case 3 : dayName = "화"; break;
		case 4 : dayName = "수"; break;
		case 5 : dayName = "목"; break;
		case 6 : dayName = "금"; break;
		case 7 : dayName = "토"; break;
			default : break;
		}
		
		//2023년 4월 20일 목요일 오후 5시 42분 45초입니다.
		
		System.out.printf("%d년 %d월 %d일 %s요일 %s %d시 %d분 %d초 입니다.", year,month,day,dayName,sun,hour,min,sec);
	}
}
