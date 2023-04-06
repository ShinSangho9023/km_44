package ch03;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 =10;
		int i =2;
		
		boolean value = ((num1 = num1 + 10) < 10) & ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) | ((i = i + 2) < 10);
		//i 값은 그곳까지 실행이 안되어서 똑같이 2값이 나온다 (연산 안됨)
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}	

}
