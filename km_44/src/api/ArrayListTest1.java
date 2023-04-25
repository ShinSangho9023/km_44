package api;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String을 저장할 ArrayList 생성
		ArrayList<String> list = new ArrayList<>();
		// 객체만 저장할 수 있다.
		// 객체에 대한 주소값이 들어가는 것
		// 실제 값은 어딘가 다른 데에서 저장되어 있다.
		
		// 데이터를 여러 개 담는다면 arraylist다
		//스트링을 담을 열개짜리 공간
		
		System.out.println(list); // 한번에 모든 내용 다 보여줌
		System.out.println(list.size()); //배열에 추가된 요소 전체 개수를 반환한다.
		System.out.println(list.isEmpty());//배열이 비어 있는지 확인한다.

		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list); 
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
			list.add(1, "ddd"); // (배열 위치, 값) 중간에 끼어든다.
		System.out.println(list); 
			list.set(1, "xxx"); // (배열 위치, 값) 지우고 들어간다.
		System.out.println(list); 
		
		
		System.out.println(list.get(0)); // 그 자리에 있는 스트링 하나만 읽어내는 것.
		System.out.println(list); 
		System.out.println(list.remove(0)); // 그 자리에 있는 걸 꺼낸 다음에 삭제시킨다.
		System.out.println(list); 
		
		System.out.println(list.contains("ccc")); // 포함 되어 있는 걸 출력 불리언 값으로
		System.out.println(list.indexOf("ccc")); // 리턴 값이 숫자 몇번째에 있는 지를 알려준다. 없으면 -1
		System.out.println(list); 
		
		int a = 0;
		for (int i = 0; i < list.size(); i++) {
			a++;
			System.out.print(a + " - " +list.get(i));
			System.out.println();
		}
			
		
		for (String s : list)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	}

}
