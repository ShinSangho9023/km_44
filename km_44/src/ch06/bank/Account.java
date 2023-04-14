package ch06.bank;

public class Account {
	private String accNo; // 계좌번호
	private String customer; // 고객 이름
	private long balance; // 잔고
	//명시적 초기화를 안해도 묵시적으로 초기화가 된다.
	
	public Account(String accNo, String customer, long balance) {
		
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}// 객체가 생성될 때 초기화하기 위한 특별한 메서드
	
	public Account(String accNo, String customer ) {
		this(accNo, customer, 0); // 이러한 다른 생성자를 호출
	}// 생성자 오버로딩 매개변수 리스트가 반드시 달라야 한다.

	
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
	
	//입금
	public void deposit(long amount) {
		balance += amount;
	}
	
	// 출금 
	public boolean withdraw (long amount) {
		boolean result = false;
		if (balance >= amount) {
			balance -= amount;
			result = true;
		}
		return result;
	}
	
	
	//이체 
	public boolean transfer (long amount, Account target) {
		
		boolean result = false;
		if (balance >= amount) {
			balance -= amount; // withdraw(amount);
			target.deposit(amount);
			result = true;
	
		}
		return result;
	}
	public void printAccInfo() {
		System.out.printf("계좌번호: %s, 계좌주:%s, 잔고 : %d\n", accNo, customer, balance);
	}
}
