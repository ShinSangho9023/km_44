package ch06;

class count {
	public int serialNumber;
	public static int counter = 0; //��ü���� ���̵� ��ٷ� ȣ��
	public int nonStaicNumber;
	
	public count() {
		counter++; //��ü�� �����Ǵ� ������ ��ü�� ������� ������ ����
		serialNumber = counter;
		nonStaicNumber++;
		
	}
	
}




public class CountTest {

	public static void main(String[] args) {
		
		
		count c1 = new count();
		count c2 = new count();
		count.counter++; //Ŭ���� ������ ��� ��ü�� ���ؼ� �����ȴ�.
		count c3 = new count();
		System.out.println("c1 serialNumber=" +c1.serialNumber);
		System.out.println("c2 serialNumber=" +c2.serialNumber);
		System.out.println("c3 serialNumber=" +c3.serialNumber);
		System.out.println("c3 nonStatic =" + c3.nonStaicNumber);
		//�Ϲ����� �ɹ� ������ ��ü ������ ���� �ʱ�ȭ�� �ȴ�.
	}

}
