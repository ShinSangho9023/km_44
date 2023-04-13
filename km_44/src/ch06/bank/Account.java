package ch06.bank;

public class Account {
	private String accNo; // ���¹�ȣ
	private String customer; // �� �̸�
	private long balance; // �ܰ�
	
	public Account(String accNo, String customer, long balance) {
		
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(String accNo, String customer ) {
		this(accNo, customer, 0);
	}
	
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccNo() {
		return accNo;
	}

	public long getBalance() {
		return balance;
	}
	
	//�Ա�
	public void deposit(long amount) {
		balance += amount;
	}
	
	// ��� 
	
	public boolean withdraw (long amount) {
		boolean result = false;
		if (balance >= amount) {
			balance -= amount;
			result = true;
		}
		
		return result;
	}
	
	//��ü 
	public boolean transfer (long amount, Account target) {
		
		boolean result = false;
		if (balance >= amount) {
			balance -= amount; // withdraw(amount);
			target.deposit(amount);
			result = true;
	
		}
		return result;
	}
}
