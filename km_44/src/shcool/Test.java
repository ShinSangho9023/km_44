package shcool;

public class Test {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Double b = new Double(1.1);
		Number c = new Integer(1);
		Number d = new Double(2.2);
		Object e = new Integer(3);
		String f = new String("aaa");
		Object g = new String("ccc");
		
		
		System.out.println(a instanceof Integer); //정확한 타입 일치
		System.out.println(a instanceof Number); // 상속관계에서의 상위타입
		System.out.println(a instanceof Object); // 
		//System.out.println(a instanceof Double);// 상속관계가 아닌 비교
		System.out.println(c instanceof Double);// 상속관계이면서 타입이 일치하는
		//System.out.println(b instanceof String); // 상속관계가 아닌
		System.out.println(g instanceof String);
		System.out.println(f instanceof String);
		System.out.println(e instanceof String);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); //몇비트인지
		System.out.println(Math.PI);
		//이런 식으로 쓰면 의도가 전해짐. 가독성이 좋음
		
		//if (x == 1) {} // 이건 뭘 뜻하는지 모름
		
		//if (x == calender.SUNDAY) {} // 어떤 날짜를 비교하는 것 같음.
		
	}

}
