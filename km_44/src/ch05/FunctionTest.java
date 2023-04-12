package ch05;

public class FunctionTest {
//static이라는 키워드
	// 클레스 안에 변수와 메서드를 사용하기 
	// 위해선 객체를 선언해줘야 한다
	// A a = new A();
	
// 변수나 메서드 앞에 static를 붙이게 되면 객채를 생성안하고도
//호출이 가능해진다. 자바가 실행될 때 클레스 로딩 타임으로 객체 선언보다 앞에 온다.
//그래서 메인은 바로 실행가능
	
	
//String[] 스트링 타입의 배열
	
	
	
	public static void main(String[] args) {
		
		int num1 =10;
		int num4 =20;
		FunctionTest t = new FunctionTest(); //객체 생성 메모리가 올라감 
		int sum = t.add(num1, num4);
		System.out.println(num1 + "+" + num4 + "=" + sum + "입니다." );
		
	}
	// 메서드 선언  여기서 int는 리턴타입이라고 말한다.
	//static이 없으면 메모리에 올라가 있지 않기 때문에 
	//호출하려고 하면 오류가 발생
	// 하지만 객체를 생성하고 나서는 사용가능
	public int add(int n1, int n2) {
		
		int result = n1 + n2;
		return result;
	}
	// 메서드 안에 선언되는 변수들은 로컬 변수라고 불린다
	// 맴버 변수는 객체가 생성될 때 메모리에 올라가고 
	// 객체가 소멸될때 사라진다. 
}
