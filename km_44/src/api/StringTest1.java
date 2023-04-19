package api;

public class StringTest1 {
//java. lang.String 테스트
	public static void main(String[] args) {
		String a = null;
		String b = null; // 이렇게 하면 초기화가 된것
		String c = "";
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		String g = new String("abc");
		String x = new String("ABC");
		
		//System.out.println(a); // 초기화가 안된 변수는 사용할 수 없음.
		System.out.println(b); //c.lenth 길이가 0 
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println(d == e);
		System.out.println(f == g);// 객체의 내용을 비교할 땐 다른 방법을 써야한다.
		//객체를 연사자를 이용해서 비교하는 건 정말로 같은 객체인지를 비교하는 것
		
		System.out.println(f.equals(g));// 이게 String 객체간의 내용 비교 Object이기 때문에 다른 타입을 넣어도 됨. 대소문자 같이 취급x
		
		System.out.println(f.equalsIgnoreCase("ABC")); // 대소문자를 봐주면서 비교하는 메서드 길이는 같아야 함. 
		
		String s = "abcdefg"; //여기도 위치가 있다. 0123456 배열처럼. 하지만 애는 읽기 전용이다.
		System.out.println(s.length()); // 이러면 숫자 수가 나옴, 문자열의 길이
		
		System.out.println(s.charAt(1));  // 몇번째 글자인지 읽기. 정확한 리턴 타입이 중요 char 타입반환?
		System.out.println(s.substring(3,6)); // 부분 문자열 읽기. 3 부터 6 전까지. 원본은 그래도 새로운 스트링을 만들어서 리턴한다.
		System.out.println(s.substring(4)); //이러면 4번부터 끝까지 리턴. 애는 오버로딩으로 이렇게 두개가 가능. **스트링 자료형 
		System.out.println(s.substring(2,5).length()); // "cde" 가 출력됨.
		System.out.println(s.substring(s.length() - 1)); // "g" 가 출력됨 점을 쓰면 점부터 시작 괄호가 있으면 괄호부터 6부터 끝까지
		System.out.println(s.indexOf('c')); // 문자를 찾아서 있으면 그 위치를 숫자로, 못찾으면 -1 반환
		System.out.println(s.indexOf("de")); // 오버로딩 
		System.out.println(s.contains("def")); // 위치와 상관없이 찾기만 한다. 
		System.out.println(s.compareTo("abb")); 
		// 기준값에 비교대상이 포함되어있을 경우 서로의 문자열 길이의 차이값을 리턴 
		// 비교대상과 전혀 다른 문자열인 경우  비교가 불가능한 지점의 문자열 아스키값을 기준으로 비교
		// 0이면 같은 위치, 값
		
//		if (result < 0) { 음수면 첫번째 객체가 두번째 객체보다 앞에 온다.
//		    System.out.println(str1 + " comes before " + str2 + " in the dictionary.");
//		} else if (result > 0) { 양수면 첫번째 객체가 두번째 객체 뒤에온다.
//		    System.out.println(str1 + " comes after " + str2 + " in the dictionary.");
//		} else {
//		    System.out.println(str1 + " and " + str2 + " are the same in the dictionary.");
//		}
		//대소문자 구별함.
		
		
		System.out.println(s.toUpperCase()); // 양쪽을 대문자로 맞춘다.
		System.out.println(s.toLowerCase()); //문자열 내의 모든 문자들을 소문자로 변환합니다. 이때, 변환 규칙은 지정된 로케일(Locale)에 따라 적용됩니다.
		
		// 특정문자를 뒤에서 부터 찾기
		System.out.println(s.lastIndexOf('d'));
		
		// "abc"로 시작하는가? startsWith
		System.out.println(s.startsWith("a"));
		
		// "fg" 끝나는가 ? endsWith
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

		//뭘하는 메서드고, 찾으면 뭘 반환, 못찾으면 뭘 반환하는지 알아봐라
	}

}
