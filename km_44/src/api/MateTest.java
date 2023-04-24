package api;

public class MateTest {

	public static void main(String[] args) {
		//Math m = new Math(); 이 Math 클래스는 객체가 필요 없다.
		
		int i = Math.abs(-3);
		System.out.println(i);// 절대값 구하는 메서드

		System.out.println(Math.round(1.7)); // 반올림
		System.out.println(Math.ceil(-1.7)); // 가장 가까운 큰 정수
		System.out.println(Math.floor(1.7)); // 주어진 숫자보다 작거나 같은 가장 큰 정수를 반환 소수점 이하의 값을 버리고 정수 부분만을 반환합니다.
		
		System.out.println(Math.pow(2, 10)); // 2의 10승 제곱 구하기
		System.out.println(Math.sqrt(2)); // 루트 2 구하기
		
		System.out.println(Math.random()); // 0 이상 1 미만의 임의의 수, 1은 안나옴. 입력값 없이 숫자하나를 랜덤으로 리턴
		
		for (int i1 = 0; i1 <= 10; i1++) 
		{
			System.out.print((int) (Math.random() * 101));
			System.out.print(", ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
