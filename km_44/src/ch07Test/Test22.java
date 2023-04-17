package test;

public class Test22 {

	public static void main(String[] args) {

		String[] array1 = {"브레드", "윌크", "초코","소세지","치즈"};
		String[] array2 = new String[array1.length];
		
		System.out.print("원래 배열: ");
		
		for (int i = 0; i < array1.length; i++) {
			
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0, j = array1.length -1; i < array1.length; i++, j--) {
			
			array2[j] = array1[i]; 
			
		}

		System.out.print("역순배열 : ");
		for (int i = 0; i < array2.length; i++) {
			
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		System.out.println(array1.length);
		
	}

}
