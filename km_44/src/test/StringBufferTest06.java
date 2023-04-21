package test;

public class StringBufferTest06 {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = new String("abc");
		StringBuffer c = new StringBuffer("abc");
		StringBuffer d = new StringBuffer("abc");
		
		System.out.println(a == b); // 메모리의 값이 아니라 객체를 비교하는 것. 
		System.out.println(a.equals(b)); // 메모리의 값을 비교하는 것.
		System.out.println(c == d);
		System.out.println(c.equals(d)); // 하지만 모든 클래스의 값을 비교할 수 있는지는 해봐야 안다. 
	}

}
