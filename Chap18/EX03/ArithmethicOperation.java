package Chap18.EX03;

import java.util.Scanner;

// 1. 스캐너를 사용해서 double 의 두 수를 인풋 받습니다.
// 2. 방법 1. 람다식을 사용해서 인풋 받은 두 값을 사칙연산(+,-,*,/)을 구현해서 출력
//익명 이너클래스 -> 람다식
// 3. 방법 2. 인터페이스를 구현한 자식 객체 사용해서 인풋 받은 두 값을 사칙연산(+,-,*,/)을 구현해서 출력
// 4. 방법 3. 익명 이너 클래스를 사용해서 인풋 받은 두 값을 사칙연산(+,-,*,/)을 구현해서 출력
// 5. ArithmeticException 처리 : 0 으로 나누면 예외 발생

@FunctionalInterface
interface Arithmetic {
	void arithmethicOpr(double a, double b);
}

class ArithmeticImpl implements Arithmetic{
	@Override
	public void arithmethicOpr(double a, double b) {
		System.out.println("a+b : "+(a+b)+" , "+"a-b : "+(a-b)+ " , " + "a*b : " +(a*b)+" , " + "a/b :"+ (a/b));
	}
}

public class ArithmethicOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 공백을 구분해서 입력하세요");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
	
		// 1. 람다식 : 인터페이스의 추상메소드를 익명 이너 클래스로 생성한 것의 약식 표현이ㅏㄷ.
		
		Arithmetic a1 = (x,y) -> {System.out.println("a+b : "+(x+y)+" , "+"a-b :"+(x-y)+" , " +"a*b : " +(x*y)+ " , " + "a/b :"+ (x/y));};
		
		a1.arithmethicOpr(a, b); 
		
		// 2. 인터페이스를 구현한 클래스 생성 후 메소드 호출
		
		Arithmetic a2 = new ArithmeticImpl();
		a2.arithmethicOpr(a, b);
		
		// 3. 익명 이너 클래스로 출력
		Arithmetic a3 = new Arithmetic() {
			
			@Override
			public void arithmethicOpr(double a, double b) {
				System.out.println("a+b : "+(a+b)+" , "+"a-b : "+(a-b)+ " , " + "a*b : " +(a*b)+" , " + "a/b :"+ (a/b));
			
			}
		};
			
		
		


	
	}
}