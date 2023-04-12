package ch05;

public class MyDate {

	private int year;
	private int month;
	private int day;
	
	public MyDate(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;		
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMaxDays(int year, int month) {
		
		int maxDays = 0;
		
		switch (month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : maxDays = 31;
				break;
			case 4 :
			case 6 :
			case 9 :	
			case 11 : 
				maxDays = 30;
				break;
			case 2 : 
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {		
					maxDays = 29;
				}
				else {
					maxDays = 28;
				}
				break;
		}
		return maxDays;
	}
	
	public boolean isValid() {
		
		if (year < 1 || month < 1 || month > 12 || day < 1 || day > getMaxDays(year, month)) {
			
			return false;
				
		}else return true;

		}
	}
