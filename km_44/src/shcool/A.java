package shcool;

public class A { // public, absract(��ӽ�ų���� ���̴�), final(��Ӹ��ϰ�)
	
	public static final double X = 0.5;
	// public �ٸ� Ŭ�������� ����, static �ѹ��� �ҷ��� �� �� �ְ� ��ü���� �ִ°� �ƴ϶�, final ���ó�� ������ؼ� ��������
	void test() {
		double y = 1111 * X;
	}
	
	class D { // ����Ŭ���� public, private, static
		
	}
}



class B {
	
	
}


abstract class C extends A {
	private B  ob; //public proteced, private, final, static
	
	void test() { // public, proteced, private, final, static, abstract
		
	}
	
	abstract void test2();// �ָ� �������̵��ؾ� 
							//cŬ������ ��ӹ��� Ŭ������ 
	                       //�߻�ȭ ���¿��� ��� �� �ִ�.
							// ���� �������̵��ϴ� ����
}

class E extends C {
	public void test2() {
		// �̷��� �������̵� �ϸ� E Ŭ������ abstract �� ������ ������ �ȳ���. ��ü�� ���� �� �ִ� C �ڽ� Ŭ������ �ȴ�.
	}
}









