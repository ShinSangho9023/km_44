package shcool;

public class Test {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Double b = new Double(1.1);
		Number c = new Integer(1);
		Number d = new Double(2.2);
		Object e = new Integer(3);
		String f = new String("aaa");
		Object g = new String("ccc");
		
		
		System.out.println(a instanceof Integer); //��Ȯ�� Ÿ�� ��ġ
		System.out.println(a instanceof Number); // ��Ӱ��迡���� ����Ÿ��
		System.out.println(a instanceof Object); // 
		//System.out.println(a instanceof Double);// ��Ӱ��谡 �ƴ� ��
		System.out.println(c instanceof Double);// ��Ӱ����̸鼭 Ÿ���� ��ġ�ϴ�
		//System.out.println(b instanceof String); // ��Ӱ��谡 �ƴ�
		System.out.println(g instanceof String);
		System.out.println(f instanceof String);
		System.out.println(e instanceof String);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); //���Ʈ����
		System.out.println(Math.PI);
		//�̷� ������ ���� �ǵ��� ������. �������� ����
		
		//if (x == 1) {} // �̰� �� ���ϴ��� ��
		
		//if (x == calender.SUNDAY) {} // � ��¥�� ���ϴ� �� ����.
		
	}

}
