package ch03.test;

public class Account {

	String accNo; //���¹�ȣ
	String owner; // ������
	long balance; // �ܰ�
	
	//������
	public Account(String accNo, String owner, long balance ) {
		
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	// �Ա� 
	public void deposit(long amount) {
		balance += amount;
	}
	
	//�ܰ� ��ȸ
	public long getBalance() {
		return balance;
	}
	
	// ���
	
	public void withdraw(long amount) {
		balance -= amount;
	}
	
	// �������� ��� DŸ��
	public void printAccountInfo() {
		System.out.println("���¹�ȣ: " + accNo);
		System.out.println("������: " + owner);
		System.out.println("�ܰ�: " + balance);
	}
}
