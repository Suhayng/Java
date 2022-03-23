package Chap12.EX1;

//추상클래스는 객체화 할 수 없다. 
abstract class D {		//클래스 내부에 추상 메소드가 올 경우 abstract 클래스가 되어야 한다. 
				//자식 클래스에서 반드시 오류없이 메소드를 재정의 하는것을 보장. 	
	abstract void print();        //추상 메소드, 구현부가 없는, 선언만 된 메소드 
}

class E extends D { //자식 클래스는 추상클래스의 매소드를 재정의 . 
	@Override
	void print() {
		System.out.println("E 클래스의 print()") ; 	
	}			
}
public class AbstractClass_3 {		//p.jangwoo@gmail.com

	public static void main(String[] args) {
		//1. 객체화 해서 출력.  (객체 3개 생성후 print () 메서드 출력, 타입은 D로 생성 ) 
			//매번 자주 사용하는 경우 
		D d1 = new E(); //자식 클래스 생성자를 호출 해서 부모 타입으로 생성. 
		D d2 = new E(); 
		D d3 = new E(); 
			//메소드 호출 
			d1.print();
			d2.print();
			d3.print();
			System.out.println("===================="); 
		
		
			
		//2. 익명 클래스를 생성 해서 출력 ( print() 메서드 3번출력 )
			//객체 생성 없이 임시로 사용하는 경우 
			
			
			// 추상 클래스는 객체화 할 수 없다. 익명 클래스 를 생성후 사용가능
			D dd1 = new D() {
				//D추상 클래스의 자식 클래스 영역 (익명 (클래스이름이 없는) 클래스 )
				@Override
				void print() {
					System.out.println("익명 클래스 1");
					
				}
			};
			
			D dd2 = new D() {
				@Override
				void print() {
					System.out.println("익명 클래스 2");					
				}
			};
			D dd3 = new D() {
				@Override
				void print() {
					System.out.println("익명 클래스 3");
					
				}
			};
			
			dd1.print();
			dd2.print();
			dd3.print();
		
		
		
		

	}

}
