package Chap12.EX1;

abstract class Abc {
	abstract void cry();    // 
	abstract void fly(); 
}
class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("야옹");		
	}

	@Override
	void fly() {
		System.out.println("날지 못합니다. ");
	}
}
class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("꼬끼오");
	}

	@Override
	void fly() {
		System.out.println("하늘을 훨훨 나릅니다. ");
	}
	
}

public class Ex_AbstractClass {   //p.jangwoo@gmil.com 

	public static void main(String[] args) {
			//1. 자식 클래스 Cat, Eagle  클래스를 생성후 출력 
			Abc a1 = new Cat(); 
			Abc a2 = new Eagle(); 
			
			a1.cry();
			a1.fly();
			a2.cry();
			a2.fly();
		
			//2. 익명 클래스 생성후 출력, 
			Abc a3 = new Abc() {
				void cry() {
					System.out.println("고양이는 야옹");
				}
				void fly() {
					System.out.println("껑충 뜁니다. ");
				}
			};
			Abc a4 = new Abc() {
				void cry() {
					System.out.println("독수리는 꼬끼오");
				}
				void fly() {
					System.out.println("훨훨 납니다 ");
				}
			};
			
			a3.cry();
			a3.fly();
			a4.cry();
			a4.fly();
			
		
	}

}
