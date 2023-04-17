package shcool;

public class Student extends Person {
	
	private int kor;
	private int eng;
	private int math;
	// 현재 상속받은 변수 3개 총 6개 변수가 있음.
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) { 
		
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	
	
}
