package api;

public class MateTest {

	public static void main(String[] args) {
		//Math m = new Math(); �� Math Ŭ������ ��ü�� �ʿ� ����.
		
		int i = Math.abs(-3);
		System.out.println(i);// ���밪 ���ϴ� �޼���

		System.out.println(Math.round(1.7)); // �ݿø�
		System.out.println(Math.ceil(-1.7)); // ���� ����� ū ����
		System.out.println(Math.floor(1.7)); // �־��� ���ں��� �۰ų� ���� ���� ū ������ ��ȯ �Ҽ��� ������ ���� ������ ���� �κи��� ��ȯ�մϴ�.
		
		System.out.println(Math.pow(2, 10)); // 2�� 10�� ���� ���ϱ�
		System.out.println(Math.sqrt(2)); // ��Ʈ 2 ���ϱ�
		
		System.out.println(Math.random()); // 0 �̻� 1 �̸��� ������ ��, 1�� �ȳ���. �Է°� ���� �����ϳ��� �������� ����
		
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
