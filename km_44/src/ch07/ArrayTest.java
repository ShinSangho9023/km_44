package ch07;

public class ArrayTest {

	public static void main(String[] args) {
		int [] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		//new int[] �� ������ �ȴ�.
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			// i < num.length; �ڵ带 �������� �о���°� �ٶ����� �ڵ��.
		}
		//for each ����
		for (int i : num) {
			System.out.println(i);
		}
		//���� ����� �迭�� �����ͼ� �ڵ��ϼ����ش�. ��Ʈ�� �����̽�
		for (int i = 0; i < num.length; i++) {
			
		}
	}
}
