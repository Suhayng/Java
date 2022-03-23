package Chap11.EX05;

// 추상 클래스를 사용해서 기능 구현 하는 경우
abstract class Animal {
	abstract void cry();			// 추상 메서드 : 선언만 되어 있고 구현부가 없는 메서드
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal {

	@Override
	void cry() {
		System.out.println("멍멍");
	}
	
}

public class AbstractModifier_3 {
	public static void main(String[] args) {
		
		Animal a1 = new Cat();		// 추상 클래스는 타입으로는 지정 될 수 있다.
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();
		
		// 추상 클래스는 객체화 할 수 없다.
		// Animal a3 = new Animal();	// 추상 클래스는 객체화 될 수 없다.
		
		
	
	}
}
