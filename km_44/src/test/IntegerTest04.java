package test;
//Wrapper Class

public class IntegerTest04 {

	public static void main(String[] args) {
		int i = 100;
		String s = "123";
		
		//int > integer
		Integer in = new Integer(i); //int 들어온 숫자를 포장해서 객체로 생성한다.
		
		// String > Integer
		Integer is = new Integer(s); // 스트링을 객체로 포장해서 생성
		
		//Integer > int 
		int i2 = in.intValue();
		
		// Integer > String 
		String s2 = in.toString();
		
		//int > String 
		String s3 = Integer.toString(i);
		
		//String > int ****************************** 꼭 암기 ************************************
		int i3 = Integer.parseInt(s);
		
		
		String s4 = Integer.toString(i, 7); // 두번째 매개변수는 진수 자리 지금은 7 진수이다.
		
		int i4 = Integer.parseInt("10", 2); // 두번째 매개변수가 애가 무슨 진수인지 정해준다.
		
		System.out.println(i4);
		
		
		int d = 100;
		// Double , double 전환도 형식 그대로 배껴서 할 수 있음. 
		
		
	}

}
