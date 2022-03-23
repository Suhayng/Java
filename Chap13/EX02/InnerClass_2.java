package Chap13.EX02;
/*
 * 이너클래스에서 외부클래스의 필드와 메소드 접근 방법 

 오버라이딩 : 1. 부모와 자식이 상속 관계가 있어야 한다. 
           2.  <<인스턴스 메서드 오버라이딩 >>
           3. 인스턴스 필드, static 필드, static 메소드는 오버라이딩 되지 않는다. 
 */


class A {
	int a = 3;
	int b = 4; 
	int c = 33;
	int d = 44; 
	void abc() {   //주의 : 오버라이딩이 아니다. 외부 내부 클래스의 동일한 메소드는 별개의 공간에 위치 
		System.out.println("A 클래스의 메소드 abc()");
	}
	class B {    //이너클래스에서 외부 클래스의 중복된 필드나 메소드 호출할 경우 : A.this. 
					// super 는 상속관계에서 부모 클래스를 지칭 
		int a = 5;
		int b = 6; 
		void abc() {   //오버 라이딩이 아니라 별개의 메소드 입니다. 
			System.out.println("B 클래스의 abc()");
		}
		void bcd() {
			// 1. 자기자신의 필드와 메소드 호출 (이너클래스의 필드와 메소드 
			System.out.println(a);  //5     this.a
			System.out.println(b);  //6		this.b
			abc();     // this.abc()  
			//2. Outer 클래스의 필드와 메소드 호출 
			System.out.println(A.this.a);  //3   A.this.a : Outer Class의 필드값 호출 : 
			System.out.println(A.this.b);  //4       <<주의 : super를 사용하면 안된다. >>
			A.this.abc();
			//3. Outer 클래스의 필드와 메소드 호출 
			System.out.println(c);  //33
			System.out.println(d);  //44
		}
	}		
}

public class InnerClass_2 {

	public static void main(String[] args) {
		//1. 외부 클래스 객체 생성 
		A a = new A();
		//2. 이너클래스 객체 생성 
		A.B b = a.new B();   
		b.bcd();
		
		System.out.println("====================");
		
		//3.내부 클래스의 필드와 메소드 호출 
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
		// 2:30분 ~ 3:20분까지 : 면담 
		// 교재 : 연습문제  : 371  ~ 377    <=== 10장 상속과 다형성 
		 //              : 392 ~ 393     <=== 11장 자바 제어자 , final, abstract
		//				 : 421 ~ 423     < == 12장 추상클래스와 인페이스 
		
		
		
		
	}

}
