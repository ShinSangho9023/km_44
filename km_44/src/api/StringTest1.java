package api;

public class StringTest1 {
//java. lang.String �׽�Ʈ
	public static void main(String[] args) {
		String a = null;
		String b = null; // �̷��� �ϸ� �ʱ�ȭ�� �Ȱ�
		String c = "";
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		String g = new String("abc");
		String x = new String("ABC");
		
		//System.out.println(a); // �ʱ�ȭ�� �ȵ� ������ ����� �� ����.
		System.out.println(b); //c.lenth ���̰� 0 
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println(d == e);
		System.out.println(f == g);// ��ü�� ������ ���� �� �ٸ� ����� ����Ѵ�.
		//��ü�� �����ڸ� �̿��ؼ� ���ϴ� �� ������ ���� ��ü������ ���ϴ� ��
		
		System.out.println(f.equals(g));// �̰� String ��ü���� ���� �� Object�̱� ������ �ٸ� Ÿ���� �־ ��. ��ҹ��� ���� ���x
		
		System.out.println(f.equalsIgnoreCase("ABC")); // ��ҹ��ڸ� ���ָ鼭 ���ϴ� �޼��� ���̴� ���ƾ� ��. 
		
		String s = "abcdefg"; //���⵵ ��ġ�� �ִ�. 0123456 �迭ó��. ������ �ִ� �б� �����̴�.
		System.out.println(s.length()); // �̷��� ���� ���� ����, ���ڿ��� ����
		
		System.out.println(s.charAt(1));  // ���° �������� �б�. ��Ȯ�� ���� Ÿ���� �߿� char Ÿ�Թ�ȯ?
		System.out.println(s.substring(3,6)); // �κ� ���ڿ� �б�. 3 ���� 6 ������. ������ �׷��� ���ο� ��Ʈ���� ���� �����Ѵ�.
		System.out.println(s.substring(4)); //�̷��� 4������ ������ ����. �ִ� �����ε����� �̷��� �ΰ��� ����. **��Ʈ�� �ڷ��� 
		System.out.println(s.substring(2,5).length()); // "cde" �� ��µ�.
		System.out.println(s.substring(s.length() - 1)); // "g" �� ��µ� ���� ���� ������ ���� ��ȣ�� ������ ��ȣ���� 6���� ������
		System.out.println(s.indexOf('c')); // ���ڸ� ã�Ƽ� ������ �� ��ġ�� ���ڷ�, ��ã���� -1 ��ȯ
		System.out.println(s.indexOf("de")); // �����ε� 
		System.out.println(s.contains("def")); // ��ġ�� ������� ã�⸸ �Ѵ�. 
		System.out.println(s.compareTo("abb")); 
		// ���ذ��� �񱳴���� ���ԵǾ����� ��� ������ ���ڿ� ������ ���̰��� ���� 
		// �񱳴��� ���� �ٸ� ���ڿ��� ���  �񱳰� �Ұ����� ������ ���ڿ� �ƽ�Ű���� �������� ��
		// 0�̸� ���� ��ġ, ��
		
//		if (result < 0) { ������ ù��° ��ü�� �ι�° ��ü���� �տ� �´�.
//		    System.out.println(str1 + " comes before " + str2 + " in the dictionary.");
//		} else if (result > 0) { ����� ù��° ��ü�� �ι�° ��ü �ڿ��´�.
//		    System.out.println(str1 + " comes after " + str2 + " in the dictionary.");
//		} else {
//		    System.out.println(str1 + " and " + str2 + " are the same in the dictionary.");
//		}
		//��ҹ��� ������.
		
		
		System.out.println(s.toUpperCase()); // ������ �빮�ڷ� �����.
		System.out.println(s.toLowerCase()); //���ڿ� ���� ��� ���ڵ��� �ҹ��ڷ� ��ȯ�մϴ�. �̶�, ��ȯ ��Ģ�� ������ ������(Locale)�� ���� ����˴ϴ�.
		
		// Ư�����ڸ� �ڿ��� ���� ã��
		System.out.println(s.lastIndexOf('d'));
		
		// "abc"�� �����ϴ°�? startsWith
		System.out.println(s.startsWith("a"));
		
		// "fg" �����°� ? endsWith
		System.out.println(s.endsWith("g"));
		
		s = "a";
		s = s + "b";
		s = s  + "c";
		System.out.println(s);
		
		s = "010-1111-2222";
		String s2 = s.replaceAll("-", "/");
		System.out.println(s2);
		
		String s3[] = s.split("-");
		System.out.println(s3[0]);

		//���ϴ� �޼����, ã���� �� ��ȯ, ��ã���� �� ��ȯ�ϴ��� �˾ƺ���
	}

}
