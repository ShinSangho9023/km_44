package ch06.bank;

public class AccountTest {

	public static final String BANK_NO = "123";
	public static final String AREA_NO ="1234";
	
	public static void main(String[] args) {
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "ȫ�浿", 500);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "��ö��", 1500);
		transfer(a1, a2, 300);
		
		
		//deposit(a1, 1250);
		
	}
	
	public static void deposit(Account a, long amount) {
		a.deposit(amount);
		System.out.println("=========[�Ա�]==========");
		System.out.printf("%s ���¿� %d���� �Ա� �Ǿ����ϴ�.\n", a.getAccNo(),a.getBalance());
		System.out.printf("���� �ܰ�: %d�� �Դϴ�.", a.getBalance());
		System.out.println("=========================");
	}
	
	public static void transfer(Account from, Account to, long amount) {
		
		
		if(from.transfer(amount, to)) {
			System.out.println("=========[��ü]==========");
			System.out.printf("%s ���¿��� %s���·� %d���� ��ü �Ǿ����ϴ�.\n", from.getAccNo(),to.getAccNo(),amount);
			System.out.printf("���� �ܰ�: %d�� �Դϴ�.\n", from.getBalance());
			System.out.println("=========================");
			
		}
		else
		 {
			System.out.println("�ܰ� �����ؼ� ��ü�� �����߽��ϴ�.");
		}
		
		
	}

}
