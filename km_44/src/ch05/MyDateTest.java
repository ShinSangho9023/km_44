package ch05;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(28, 2, 2023);
		if (date1.isValid()) {
			
			System.out.println("유효한 날짜입니다");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다");
		}

		MyDate date2 = new MyDate(29, 2, 2024);
		if (date2.isValid()) {
			
			System.out.println("유효한 날짜입니다");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다");
		}

	}

}
