package test;

public class Main {

	public static void main(String[] args) {
		// ���Ⱑ ������ �� �ִ� Ŭ����
		int i = 10;
		A a1 = new A();
		A a2 = new A(100);
		// a1 ���۷��� ����(��������) ���� ����Ű�� ���� ����
		// new��°� heap���ٰ� �����ϱ� ���� Ű����
		// A() : ������ (�⺻ ������ �ƹ����� �ȳ־ ������ �� �ִ� ������.)
		// �غ� �۾��� ���� �ʱ�ȭ �۾����ϴ� Ư���� �޼���
		
		// �ɹ������� ���� ����ְų� �Լ��� ȣ���� ��.
		// a1.num = 3; �� �����ϴ� ��. 
		
		
		
		
		a1.num = 1;
		
		a1.test();
		// . ���ϸ� ����Ŵ
		// final Ű���带 ���̸� �� ���� �Ұ���.
		
		B b1 = new B();
		
		B b2 = new B(10, 10.5);
		
		b2.test();
		
		b2.toString();// object���� ��������
		System.out.println(b2.toString());
		
		
		C c = new C();
		c.setBounds(100,100,300,300);
		c.setTitle("���� ���� â");
		c.setVisible(true);
		
		
	}
	
}
