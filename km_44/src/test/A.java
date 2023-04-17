package test;

public class A {

	// 맴버변수 : 값을 담는곳
	int num;
	
	// 메서드 (로컬변수) : 기능
	// void 리턴 타입 = 리턴 값이 없다.
	// 그 어떤 자료형도 올 수 있다.
	// public 접근 지정자 - 어디서도 접근가능
	// 
	public void test ( ) {
		System.out.println("A클래스의 test() 메소드");
		
	}
	
	// 이게 기본 생성자. 굳이 이렇게 적는건 여러 생성자 타입을 쓰고 싶을때.
	// void를 붙이면 안됨. 단순 메서드 취급
	// 다른 생성자를 하나 이상 만들어두면 기본 생성자가 자동생성 안됨.
	public A() {
//		this(10);//다른 생성자를 불러쓰고 싶을때 this 붙인다.
		System.out.println("A의 A()");
	}
	
	public A(int num) {
		this.num = num;
		System.out.println("A의 A(int)");
	}
	// 같은 클래스 끼리 메서드를 호출할때 this를 붙여준다. 헷갈리지 않도록
	// 생성자가 다른 생성자를 호출 할 때
	
	
	
	
	
}
