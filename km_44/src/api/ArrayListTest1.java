package api;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String�� ������ ArrayList ����
		ArrayList<String> list = new ArrayList<>();
		// ��ü�� ������ �� �ִ�.
		// ��ü�� ���� �ּҰ��� ���� ��
		// ���� ���� ��� �ٸ� ������ ����Ǿ� �ִ�.
		
		// �����͸� ���� �� ��´ٸ� arraylist��
		//��Ʈ���� ���� ����¥�� ����
		
		System.out.println(list); // �ѹ��� ��� ���� �� ������
		System.out.println(list.size()); //�迭�� �߰��� ��� ��ü ������ ��ȯ�Ѵ�.
		System.out.println(list.isEmpty());//�迭�� ��� �ִ��� Ȯ���Ѵ�.

		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list); 
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
			list.add(1, "ddd"); // (�迭 ��ġ, ��) �߰��� ������.
		System.out.println(list); 
			list.set(1, "xxx"); // (�迭 ��ġ, ��) ����� ����.
		System.out.println(list); 
		
		
		System.out.println(list.get(0)); // �� �ڸ��� �ִ� ��Ʈ�� �ϳ��� �о�� ��.
		System.out.println(list); 
		System.out.println(list.remove(0)); // �� �ڸ��� �ִ� �� ���� ������ ������Ų��.
		System.out.println(list); 
		
		System.out.println(list.contains("ccc")); // ���� �Ǿ� �ִ� �� ��� �Ҹ��� ������
		System.out.println(list.indexOf("ccc")); // ���� ���� ���� ���°�� �ִ� ���� �˷��ش�. ������ -1
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
