package ch06;

class count {
	public int serialNumber;
	public static int counter = 0; //객체생성 없이도 곧바로 호출
	public int nonStaicNumber;
	
	public count() {
		counter++; //객체와 공유되는 데이터 객체가 만들어질 때마다 증가
		serialNumber = counter;
		nonStaicNumber++;
		
	}
	
}




public class CountTest {

	public static void main(String[] args) {
		
		
		count c1 = new count();
		count c2 = new count();
		count.counter++; //클레스 변수는 모든 객체에 의해서 공유된다.
		count c3 = new count();
		System.out.println("c1 serialNumber=" +c1.serialNumber);
		System.out.println("c2 serialNumber=" +c2.serialNumber);
		System.out.println("c3 serialNumber=" +c3.serialNumber);
		System.out.println("c3 nonStatic =" + c3.nonStaicNumber);
		//일반적인 맴버 변수는 객체 생성시 마다 초기화가 된다.
	}

}
