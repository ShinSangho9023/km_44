package test;

public class StringBufferTest06 {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = new String("abc");
		StringBuffer c = new StringBuffer("abc");
		StringBuffer d = new StringBuffer("abc");
		
		System.out.println(a == b); // �޸��� ���� �ƴ϶� ��ü�� ���ϴ� ��. 
		System.out.println(a.equals(b)); // �޸��� ���� ���ϴ� ��.
		System.out.println(c == d);
		System.out.println(c.equals(d)); // ������ ��� Ŭ������ ���� ���� �� �ִ����� �غ��� �ȴ�. 
	}

}
