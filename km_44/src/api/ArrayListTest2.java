package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList <Data> list = new ArrayList <Data>();
		Scanner sc = new Scanner(System.in);
		
		Data d = null;
		
		d = new Data();
		d.setNum(1);
		d.setName("모니터");
		list.add(d);
		
		d = new Data();
		d.setNum(2);
		d.setName("키보드");
		list.add(d);
		
		System.out.println(list);
		
		Data input = new Data();
		input.setName(sc.next());
		input.setNum(sc.nextInt());
		list.add(input);
		// 입력한 값이 리스트에 있는지 위치 출력
		// 검색을 하려면 equals를 오버라이딩 해서 메서드를 만들어 놔야 한다.
		// object에서 상속받은 equals를 오버라이딩
		
		
		int i = list.indexOf(input);
		
		if (i == -1) {
			System.out.println("데이터가 없습니다.");
		}
		else {
			System.out.println(i + "번째에 있습니다.");
		}
	}
}

