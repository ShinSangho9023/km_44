package api;

import java.util.ArrayList;
import java.util.Scanner;

import shcool.Student;

public class SchoolTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>(); // 일단 빈 배열을 만들어 둔 것.
		
		// 학생 정보를 반복적으로 입력받아 저장
		
		while(true) {
			
			Student Student = new Student();
			
			// 학생의 이름,학번, 전화번호, 국영수점수를 입력받아 Student 객체 타입으로 arraylist에 저장
			System.out.print("국어 점수 입력하세요");
			Student.setKor(sc.nextInt());
			System.out.print("영어 점수 입력하세요");
			Student.setEng(sc.nextInt());
			System.out.print("수학 점수 입력하세요");
			Student.setMath(sc.nextInt());
			System.out.print("id 입력하세요");
			Student.setId(sc.next());
			System.out.print("이름 입력하세요");
			Student.setName(sc.next());
			System.out.print("전화번호 입력하세요");
			Student.setPhone(sc.next());
			list.add(Student); 
			
			// 리스트에 이 객체를 넣어주는 것. 여기가 이해가 안됬던 거였음. 배열과 객체 생성은 별개로 해도 됨.
			// 게다가 요 자료구조는 이름이 중복되어도 상관없기 때문에 이런식으로 만들어도 무방하다.
			
			//y 입력하면 계속 n입력하면 종료
			System.out.println("계속 입력하시겠습니까? (y/n)");
			String a = sc.next();
			
			if (a.equalsIgnoreCase(("n"))) 	break;

		}
		
		//모든 학생정보 출력
		//System.out.println(list);
		
		// 학번 이름 총점 평균
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId()+ " ");
			System.out.print(list.get(i).getName()+ " ");
			System.out.print(list.get(i).getTotal()+ " ");
			System.out.println(list.get(i).getAverage()+ " ");
			// 도트로 메서드를 이어준다. 
			//"\t" > 탭으로 밀어주기
			
			
//		for (Student st : list) 
//			{
//			System.out.print(list.get(i).getId()+ " ");
//			System.out.print(list.get(i).getName()+ " ");
//			System.out.print(list.get(i).getTotal()+ " ");
//			System.out.println(list.get(i).getAverage()+ " ");
//			}
			
			//전체 학생의 평균 점수
		}
		
		double avg = 0.0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			avg += list.get(i1).getAverage();
		}
		
//		double avg = 0.0;
//		for (Student st : list) {
//			avg += st.getAverage();
//		}
//		avg /= list.size();
		
		System.out.print("전체 학생 평균 : " + avg / list.size());
		
	}
}




