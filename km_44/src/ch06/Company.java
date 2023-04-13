package ch06;
// singleton pattern�� ����� Ŭ����

public class Company {
		
	// 2. �ڱ��ڽ��� ��ü�� �ɹ��� static�ϰ� �����Ѵ�.
	private static Company c = new Company();
	private int total;
	
	
	//1. �ܺο��� ��ü�� �������� ���ϵ��� ���������ڸ� private�� �Ѵ�.
	private Company() {
		System.out.println("Company ��ü ����");
	}
	//3. �ܺο��� �ش� Ŭ������ ��ü�� ������ �� �� �ִ� getter�� ����
	public static Company getCompany() {
		return c;
	}
	//��� total ������ �����͸� ��´�.
	public void addTotal(int total) {
		this.total += total;
	}
	public int getTotal() {
		return total;
	}
	
}
