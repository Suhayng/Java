package Chap13.EX01;

//이너클래스(inner Class) : 클래스 내부의 클래스 
    // 1. 인스턴스 이너클래스 : static 이 없는 내부 클래스 
			//외부 객체를 먼저 생성후 자신의 객체 생성 후 사용가능 
			// A a = new A() ;   외부 객체 (a)
			// A.B b = a.new B(); 	내부 객체 (b)

    // 2. Static (정적) 이너클래스 : static 있는 내부 클래스 
			
    // 3. 지역 이너클래스 : 클래스의 인스턴스 메소드 내부에 있는 클래스 
  
    // 특징 : 1. Outer Class의 접근제어자 제한 없이 접근,
         //  2. 다른 객체를 생성하지 않고, 객체의 필드나 메소드 접근을 빠르게 하기위해 이너클래스를 사용.

	//클래스 파일 : A.class , A$B.class      <= byte 코드 ( 중간언어로 컴파일된 파일 ) 


class A {        // Outer Class : 모든 접근 제어자를 내부 클래스에서 접근 가능 
	public int a = 3;			//다른 패키지에서 접근 가능, 같은패티지에서 접근 가능
	protected int b = 4;		//다른 패키지에서 접근 가능(상속), 같은 패키지에서 접근 가능
	int c = 5;					//다른 패키지에서 접근 불가능, 같은 패키지에서 접근 가능
	private int d = 6;			//다른 패키지에서 접근 불가능, 같은 패키지에서 접근 불가능, 같은 클래스에서 접근 
	
	void abc() {
		System.out.println("A 클래스이 메소드 abc() 입니다. ");
	}
	
	// Inner Class 
	class B {  // 인스턴스 내부 클래스 : 외부 클래스가 객체화 되어야 사용가능 
		void bcd() {    //Outer Class의 필드접근 가능여부 확인 
			System.out.println(a);  // this.a
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();    // Outer Class의 메소드 접근 가능 여부 확인 
		}
	}
	
}

public class InnerClass_1 {
	public static void main(String[] args) {	
		//1. 외부 객체 생성 (1단계) - 인너클래스를 사용하기 위해서는 외부 클래스 객체를 먼저 생성 
		A a = new A();
		
		//2. 내부 클래스 객체 생성 (2단계) 
		A.B b = a.new B();    // A.B : 외부클래스.내부클래스  b : 내부클래스 인스턴스변수
							  // a.new B();   <=== 외부인스턴스명.new 내부클래스생성자호출 
		
		//3. 내부 클래스의 메소드 호출 
		b.bcd();
		

	}

}
