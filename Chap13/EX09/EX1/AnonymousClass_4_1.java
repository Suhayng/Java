package Chap13.EX09.EX1;

interface A{
	void cry();
	void fly();
}
class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {
	public static void main(String[] args) {
		C c = new C();
		//1. 클래스는 존재 (x) + 참조 변수 (0)
		A a = new A() {			//참조 변수 a 생성 
			@Override
			public void cry() {
				System.out.println("멍멍");
				
			}
			@Override
			public void fly() {
				System.out.println("하늘을 못 나릅니다. ");
				
			}
		};
		c.abc(a);
		System.out.println("==============");
		
		//2. 클래스는 존재 (x) + 참조 변수 (x)
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("멍멍");
				
			}
			@Override
			public void fly() {
				System.out.println("못나릅니다.");
				
			}
		});
	}

}
