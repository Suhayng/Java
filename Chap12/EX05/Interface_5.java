package Chap12.EX05;

//1. 방법1 : 객체를 생성후 구현 
//2. 익명 클래스를 이용하는 방법 

//인터페이스 선언 :  기업의 최고 프로그래머 (PM)
interface A {
	double PI = 3.14; 	//public static final
	void run();			//public abstract 
}
class B implements A {
	@Override
	public void run() {		// public 주의 
		System.out.println("달립니다");		
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		//1. 객체 생성후 출력 
		A a1 = new B(); 
		a1.run(); 
		
		//2. 익명 객체로 출력 
		A a2 = new A() {
			public void run() {
				System.out.println("훨훨 납니다. ");
			}
		};
		a2.run();
	}

}
