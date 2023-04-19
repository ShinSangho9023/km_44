package shcool;

public class School 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		Teacher t = new Teacher();
		
		//Person p = new Student();
		//Person p2 = new Teacher();
		// 상속관계일 때 왼쪽이 상위타입이면 괜찮다. 
		// 왼쪽이 하위타입이면 안된다.
		// 상위타입의 변수는 하위타입을 참조할 수 있다.
		Student s2 = new Student("홍길동","990101-111111", "010-1111-1111",100,90,80);
		Teacher t2 = new Teacher("김철수","880101-111111", "010-2222-2222",100000);
		 
		System.out.println(s2.getKor() + s2.getEng() + s2.getMath());
		System.out.println(s2.getTotal()); //int 형으로 총점을 리턴하는 메소드
		System.out.println(s2.getAverage());
		System.out.println(s2.getGrade()); // 90"A" 80"B" 70"C" 60"D" 50"F"
		
		System.out.println(s2.toString());// 투 스트링을 호출해서 쓴다.
		System.out.println(t2.toString());
		
		test(s2); // 앞에 this가 안붙은건 static 메서드라서
		test(t2); // 같은 static 메서드 끼리는 객체 생성 없이 호출하는게 가능하다.
	}
	
	public static void test (Person p) 
	{
		System.out.println(p.toString());
		if (p instanceof Student ) 
		{
			Student s = (Student) p; //여러번 해야 할때는 따로 변수를 해야 편하다.
			System.out.println(((Student)p).getKor()); // 국어점수 출력 //괄호를 주어서 연산할때 우선 순위를 주낟.
		}
		else if (p instanceof Teacher)
		{
			// 급여 출력
		}
		
		// instanceof는 확실히 나누어야 할 때 사용.
		// 강제 형변환이지만 진짜 뭘 바꾸는 건 아니고 알려주는 것뿐.
		
	}
	
}
