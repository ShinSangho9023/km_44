package ch05;

public class FunctionTest {
//static�̶�� Ű����
	// Ŭ���� �ȿ� ������ �޼��带 ����ϱ� 
	// ���ؼ� ��ü�� ��������� �Ѵ�
	// A a = new A();
	
// ������ �޼��� �տ� static�� ���̰� �Ǹ� ��ä�� �������ϰ�
//ȣ���� ����������. �ڹٰ� ����� �� Ŭ���� �ε� Ÿ������ ��ü ���𺸴� �տ� �´�.
//�׷��� ������ �ٷ� ���డ��
	
	
//String[] ��Ʈ�� Ÿ���� �迭
	
	
	
	public static void main(String[] args) {
		
		int num1 =10;
		int num4 =20;
		FunctionTest t = new FunctionTest(); //��ü ���� �޸𸮰� �ö� 
		int sum = t.add(num1, num4);
		System.out.println(num1 + "+" + num4 + "=" + sum + "�Դϴ�." );
		
	}
	// �޼��� ����  ���⼭ int�� ����Ÿ���̶�� ���Ѵ�.
	//static�� ������ �޸𸮿� �ö� ���� �ʱ� ������ 
	//ȣ���Ϸ��� �ϸ� ������ �߻�
	// ������ ��ü�� �����ϰ� ������ ��밡��
	public int add(int n1, int n2) {
		
		int result = n1 + n2;
		return result;
	}
	// �޼��� �ȿ� ����Ǵ� �������� ���� ������� �Ҹ���
	// �ɹ� ������ ��ü�� ������ �� �޸𸮿� �ö󰡰� 
	// ��ü�� �Ҹ�ɶ� �������. 
}
