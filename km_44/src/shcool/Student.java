package shcool;

public class Student extends Person 
{
	// 변수
	private int kor;
	private int eng;
	private int math;
	// 현재 상속받은 변수 3개 총 6개 변수가 있음.
	
	
	
	
	//생성자 -------------------------------------------
	public Student( ) 
	{
		super();
	}// 기본생성자
	
	public Student(String name, String id, String phone, int kor, int eng, int math) 
	{
		super(name, id, phone); //상속받은 변수가 이때 채워짐 상위 객체 생성됨 상속받은 거라 private 접근 가능.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		//setName(name);
	}// 변수 초기화 생성자
	
	// 겟터 셋터 ------------------------------------
	public int getKor() 
	{
		return kor;
	}
	public void setKor(int kor) 
	{ 
		
		this.kor = kor;
	}
	
	public int getEng() 
	{
		return eng;
	}
	public void setEng(int eng) 
	{
		this.eng = eng;
	}
	
	public int getMath() 
	{
		return math;
	}
	public void setMath(int math) 
	{
		this.math = math;
	}
	
	// 메서드 --------------------------------------------------
	
	public int getTotal () 
	{	
		int getTotal = kor + eng + math;
		return getTotal;
	} // 총점 구하는 메서드
	
	public double getAverage () 
	{	
		double getAvg = getTotal() / 3.0; // 같은 클래스는 이렇게 호출해서 사용가능.
		return getAvg;
	} // 평균 구하는 메서드
	
	public String getGrade () 
	{
		double avg = getAverage();
		
		if (avg >= 90) 
		{	
			return "A";
		}
		else if (avg >= 80 && avg < 90 ) 
		{
			return "B";
		}
		else if (avg >= 70 && avg < 80 ) 
		{
			return "C";
		}
		else if (avg >= 60 && avg < 70 ) 
		{
			return "D";
		}
		else 
		{
			return "F";
		}
	
		/* String s = null;
		 * switch ((int)(getAverage() / 10)) {
		 * 	case 10
		 * 	case 9 s = "A"; break;
		 * 	default s = "F" }
		 * return s;*/
		
	}// 등급을 반환하는 메서드
	
	@Override // 항상 붙일 것.
	public String toString() {
		return super.toString() + " 국어: " + kor + " 영어: " + eng + " 수학: " + math;
		
	}
	
	
}// 클래스
