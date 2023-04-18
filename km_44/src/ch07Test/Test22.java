package ch07Test;

public class Test22 {

	public static void main(String[] args) {

		String[] array1 = {"釉뚮젅�뱶", "�쐧�겕", "珥덉퐫","�냼�꽭吏�","移섏쫰"};
		String[] array2 = new String[array1.length];
		
		System.out.print("�썝�옒 諛곗뿴: ");
		
		for (int i = 0; i < array1.length; i++) {
			
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0, j = array1.length -1; i < array1.length; i++, j--) {
			
			array2[j] = array1[i]; 
			
		}

		System.out.print("�뿭�닚諛곗뿴 : ");
		for (int i = 0; i < array2.length; i++) {
			
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		System.out.println(array1.length);
		
	}

}
