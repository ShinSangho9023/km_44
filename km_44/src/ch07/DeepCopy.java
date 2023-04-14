package ch07;

public class DeepCopy {

	public static void main(String[] args) {

		int num1 [] = {10, 20,30, 40,50};
		int num2 [] = new int[num1.length];
		
		//깊은 복사 static 클레스 haep 상에서는 다른 주소값을 가지게 된다.
		System.arraycopy(num1, 0, num2, 0, num1.length); // 깊은 복사
		
		num2[0] = 1;
		
		System.out.println("=== num1 ====");
		for (int i : num1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=== num2 ====");
		for (int i : num2) {
			System.out.print(i+" ");
		}
	}

}
