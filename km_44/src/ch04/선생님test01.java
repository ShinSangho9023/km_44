package ch04;

import java.util.Scanner;

public class 선생님test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 1 입력 : ");
		double val1 = sc.nextDouble();
		System.out.print("값 2 입력 : ");
		double val2 = sc.nextDouble();
		
		System.out.print("연산자 입력 : ");
		String operator = sc.next();
		
		// 분모가 0일때는 결과 출력 안하는 방법
		// 플레그 변수를 사용하기
		boolean is_print = true;
		
		// return 사용하기 
		
		double result = 0.0;
		
		// 객체의 값을 비교할 때는 equals 메서드를 사용한다.
		if(operator.equals("+")) {
			result = val1 + val2;
		}
		else if (operator.equals("-")) {
			result = val1 - val2;
		}
		else if (operator.equals("*")) {
			result = val1 * val2;
		}
		else if (operator.equals("/")) {
			if (val2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				is_print = false;
				return;// 이 문장을 만나면 메서드를 중단시키게 됨.
			}
			else {
				result = val1 / val2;
			}
		}
		else {
			System.out.println("연산자 오류!");
		}
		if (is_print) {
		System.out.printf("%.2f %s %.2f = %.2f", val1, operator, val2, result);
		}
	}	
}
