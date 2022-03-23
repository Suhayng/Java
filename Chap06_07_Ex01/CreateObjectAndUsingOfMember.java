package Chap06_07_Ex01;

// 클래스(class) : 객체를 생성하기 위한 틀(템플릿), 설계도, 붕어빵의 틀
// 객체(Object) : 클래스를 복사해서 RAM에서 작동되는 실행코드 ( 집, 붕어빵 )
		// 객체 = 인스턴스
		// 인스턴스화 (객체화) 시킨다. (메인 메소드에서 객체를 인스턴트화 시켜줘야한다.)
		// A a = new A();			<== 클래스를 객체화 시켜서 메모리에 로드

class A {			// 외부 클래스
	int m = 3;		// 필드 (변수) : 클래스 블락에서 선언된 변수를 필드라 호칭 
					// 필드는 인스턴스화 (객체) 시켜야 사용이 가능
					// 필드는 메모리의 Heap 영역에 생성 
	
	void print() {	// 메소드 : 절차 지향 언어의 함수 , 객체 지향 언어에서 함수를 메소드라 호칭
		System.out.println("객체 생성 및 활용");
	}
}

class B {			// 외부 클래스
	String name = "홍길동";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName () {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void pirntPhone() {
		System.out.println(phone);
	}
}


public class CreateObjectAndUsingOfMember {
	public static void main(String[] args) {
		
		A a = new A();		// Class A를 객체화 (인스턴스화) 시킨다. (RAM에 로드 시킨다.)
		System.out.println(a.m);
		a.print();
		
		System.out.println("===================");
		
		A b = new A();		// Class A를 객체화 (인스턴트화) 시켜서 RAM에 로드 
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("==================");
		
		B bb = new B();		// B Class 를 bb 라는 이름으로 객체화 시킨다.
		bb.printName();		// bb 객체의 메소드를 호출
		bb.printAge();		// bb 객체의 메소드를 호츨
		bb.pirntPhone();	
		
		B cc = new B(); 
		cc.printName();
		cc.printAge();
		cc.pirntPhone();
	}
}
