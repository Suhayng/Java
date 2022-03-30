package Chap16.EX09;

// 제너릭 메소드의 범위 지정 :

class A {	// 일반 클래스의 제너릭 메소드
	
	// Number : Boolean, Charactor 를 제외한 6개의 타입 (Byte, Short, Integer, Long. Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue()); 	// Number 타입의 메소드 t.intValue()
	}
}
interface MyInterface {
	void print();	// public abstract 가 생략됨.
}

class B {
	public <T extends MyInterface> void method2 (T t) {	// T에 타입이 올 수 있는 것은 MyInterface를 구현한 클래스만 올 수 있다.
		t.print();
	}
}

public class BoundTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();	// 일반 클래스 객체 생성
		a.<Double>method1(5.8);
		a.method1(22.5);			// 매개 변수로 던지는 값이 타입을 식별 할 수 있는 경우 생략 가능
		a.<Long>method1(100000L);	// Long
		a.<Float>method1(100.5555F);	// Float
		
		
	}
}
