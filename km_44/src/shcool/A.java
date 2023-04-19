package shcool;

public class A { // public, absract(상속시킬려고 붙이는), final(상속못하게)
	
	public static final double X = 0.5;
	// public 다른 클래스에도 쓰게, static 한번만 불러서 쓸 수 있게 객체마다 있는게 아니라, final 상수처리 변경못해서 오류막게
	void test() {
		double y = 1111 * X;
	}
	
	class D { // 내부클래스 public, private, static
		
	}
}



class B {
	
	
}


abstract class C extends A {
	private B  ob; //public proteced, private, final, static
	
	void test() { // public, proteced, private, final, static, abstract
		
	}
	
	abstract void test2();// 애를 오버라이딩해야 
							//c클래스를 상속받은 클래스가 
	                       //추상화 상태에서 벗어날 수 있다.
							// 강제 오버라이딩하는 구조
}

class E extends C {
	public void test2() {
		// 이렇게 오버라이딩 하면 E 클래스가 abstract 안 붙혀도 오류가 안난다. 객체를 만들 수 있는 C 자식 클래스가 된다.
	}
}









