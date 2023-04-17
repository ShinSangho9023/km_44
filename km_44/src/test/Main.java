package test;

public class Main {

	public static void main(String[] args) {
		// 여기가 실행할 수 있는 클래스
		int i = 10;
		A a1 = new A();
		A a2 = new A(100);
		// a1 레퍼런스 변수(참조변수) 값을 가리키기 위한 변수
		// new라는건 heap에다가 저장하기 위한 키워드
		// A() : 생성자 (기본 생성자 아무값도 안넣어도 실행할 수 있는 생성자.)
		// 준비 작업을 위한 초기화 작업을하는 특수한 메서드
		
		// 맴버변수에 값을 집어넣거나 함수를 호출할 때.
		// a1.num = 3; 은 지정하는 것. 
		
		
		
		
		a1.num = 1;
		
		a1.test();
		// . 를하면 가르킴
		// final 키워드를 붙이면 값 변경 불가능.
		
		B b1 = new B();
		
		B b2 = new B(10, 10.5);
		
		b2.test();
		
		b2.toString();// object에서 물려받음
		System.out.println(b2.toString());
		
		
		C c = new C();
		c.setBounds(100,100,300,300);
		c.setTitle("내가 만든 창");
		c.setVisible(true);
		
		
	}
	
}
