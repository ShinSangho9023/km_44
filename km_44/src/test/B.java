package test;

public class B extends A {
	// ���� �ȿ��� A�� ������ �Ȱ��� ����
	// ���ϼ� �ִ� �������̽�, �������� �����ϱ����ؼ��� ����.
	double dnum;
	
	public B() {
		super(); // ���� Ŭ������ �⺻������ ȣ��, ���������� �̷��� �����ִ�.
		 		 // �����ϸ� �⺻ ������ , �׿ܿ��� ����� ȣ�� 
				 // ����Ŭ������ ������ ù �ٿ����� ȣ�Ⱑ��
		System.out.println("B�� B()");
	}
	
	public B(int n, double d) {
		super(n); // 
		num = n;
		dnum = d;
		System.out.println("B�� B(int, double)");
	}
}
