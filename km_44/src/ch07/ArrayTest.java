package ch07;

public class ArrayTest {

	public static void main(String[] args) {
		int [] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		//new int[] 를 지워도 된다.
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			// i < num.length; 코드를 동적으로 읽어오는게 바람직한 코드다.
		}
		//for each 구문
		for (int i : num) {
			System.out.println(i);
		}
		//가장 가까운 배열을 가져와서 자동완성해준다. 컨트롤 스페이스
		for (int i = 0; i < num.length; i++) {
			
		}
	}
}
