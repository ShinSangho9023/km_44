package ch06;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getCompany();
		c1.addTotal(100);
		System.out.printf("���� total ��: %d\n", c1.getTotal());
		
		Company c2 = Company.getCompany();
		
		c2.addTotal(200);
		System.out.printf("���� total ��: %d\n", c2.getTotal());
		
	}

}
