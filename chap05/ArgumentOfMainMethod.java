package chap05;
public class ArgumentOfMainMethod {
	public static void main(String[] ar) {	// 메인 메소드[함수]
		// 메소드의 기본구조
		/*
		 	void main(String[] args) {			// void : 리턴 값이 없음을 뜻함.
		 		메소드 호출시 실행할 코드;				// main : 메소드 명
		 	}									// (인풋 매개변수) 
		 */
	
		String a = ar[0];				// "안녕하세요"  : 문자열 전송
		String b = ar[1];				// 3  : 정수
		String c = ar[2];				// 3.8 : 실수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println(b + 1);		// 31
		System.out.println(c + 1);		// 3.81
		System.out.println();
		
		// String 을 정수나 더블 형으로 변환해서 연산
		int d = Integer.parseInt(b);		// b(String) --> Integer 타입으로 변환
		double e = Double.parseDouble(c);	// c(String) --> Double 형으로 변환
	
		System.out.println(d + 1);
		System.out.println(e + 1);
	}
}
