package api;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// �� Ÿ���� Object�� �ϸ� ��� �ڷ�Ÿ�� ���� ���尡��
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "1¯��");
		map.put(3, "2¯��");
		map.put(5, "3¯��");
		map.put(2, "4¯��");
		map.put(4, "5¯��");
		
		System.out.println(map);
		System.out.println(map.get(1));
		//������ ������ ����.
		//Ű�� ������ �ȴ�.
		System.out.println(map.get(4));
		map.put(1, "1¯��");
		System.out.println(map); // �̷� ������ ���� �ߺ���Ű�� ���� �ٲٴ°� �ȴ�.
		
		System.out.println(map.get(7)); 

	}

}
