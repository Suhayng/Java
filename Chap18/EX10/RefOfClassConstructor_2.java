package Chap18.EX10;

interface A {
	B abc(int k);	//리턴 타입이 B 객체를 리턴
}
class B {
	B () {
		System.out.println("첫 번째 생성자");
	}
	B(int k){
		System.out.println("두 번째 생성자");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {

		// 익명 이너 클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return  new B(3);
			}
		};
		
		//람다식 표현
		A a2 = (int k) -> {return new B(3);};	//전체 구분
		A a3 = k -> new B(3);
		
		//클래스 생성자 참조
		A a4 = B::new;		//B의 두번째 생성자 호출
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
	
	
	
	}
}
