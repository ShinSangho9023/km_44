package api;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// 값 타입을 Object로 하면 모든 자료타입 전부 저장가능
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "1짱구");
		map.put(3, "2짱구");
		map.put(5, "3짱구");
		map.put(2, "4짱구");
		map.put(4, "5짱구");
		
		System.out.println(map);
		System.out.println(map.get(1));
		//저장한 순서가 없다.
		//키만 넣으면 된다.
		System.out.println(map.get(4));
		map.put(1, "1짱아");
		System.out.println(map); // 이런 식으로 값을 중복시키면 값을 바꾸는게 된다.
		
		System.out.println(map.get(7)); 

	}

}
