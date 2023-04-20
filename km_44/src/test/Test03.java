package test;

import java.util.Scanner;

// 주민번호 입력받아 검증하고 결과 출력
// 990101-1234567 형태로 입력

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if (input.length() != 14) { // 에러를 물어볼떄도 뭘 먼저 잡을지가 중요. 글자수 검사가 먼저 안오고 -위치가 먼저오고 길이가 14가 아니라면 예외가 발생.
			System.out.println("글자수 입력 오류 입니다.");
			return;
		}
		if (input.charAt(6) != '-') {
			//if (input.indexOf('-') != 6)
			//if (!input.substring(6,7).equals("-")) // "1" 은 메모리에 참조값이 다르기 때문에 equals 로 비교 해야한다.
			System.out.println("-위치 입력 오류 입니다.");
			return;
		}
//		if (input.charAt(7) != '1' && input.charAt(7) != '2' ) {
//			System.out.println("성별 입력 오류 입니다.3");
//			return;
//		}
		
		char ch = input.charAt(7);
		
		if (ch < '1' || ch >  '4') {
			System.out.println("성별 입력 오류 입니다.");
			return;
		}
		
		String man = null;
		String femle = null;
		
		String a = input.substring(0, 2);
		String b = input.substring(2, 4);
		String c = input.substring(4, 6);		
		
		char d = input.charAt(7);
		
		//String sex = ch =='1' || ch == '3' ? "남자" : "여자"; 삼항 연산자를 사용
		
		if (d == '1' || d == 3) {
			man = "남자";
			System.out.printf("%s년 %s월 %s일생 %s입니다.",a,b,c,man);
		}
		else {
			femle = "여자";
			System.out.printf("%s년 %s월 %s일생 %s입니다.",a,b,c,femle);
		}
	}
}
