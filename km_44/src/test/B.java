package test;

public class B extends A {
	// 여기 안에는 A의 모든것이 똑같은 상태
	// 통일성 있는 인터페이스, 다형성을 구현하기위해서도 쓴다.
	double dnum;
	
	public B() {
		super(); // 상위 클래스의 기본생성자 호출, 묵시적으로 이렇게 써져있다.
		 		 // 생략하면 기본 생성자 , 그외에는 명시적 호출 
				 // 하위클래스의 생성자 첫 줄에서만 호출가능
		System.out.println("B의 B()");
	}
	
	public B(int n, double d) {
		super(n); // 
		num = n;
		dnum = d;
		System.out.println("B의 B(int, double)");
	}
}
