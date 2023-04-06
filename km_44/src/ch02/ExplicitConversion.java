package ch02;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 =1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; 
		// 형변환하고 연산함
		
		int iNum4 = (int)(dNum1 + fNum2); 
		// 연산 먼저하고 형변환
		
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
