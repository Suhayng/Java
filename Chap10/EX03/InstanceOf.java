package Chap10.EX03;

// Instanceof : 객체 내부의 캐스팅의 가능 여부를 알 수 있도록 하는 키워드
	// 업캐스팅한 객체 내부에 어떤 타입이 존재하는지 True, False 로 리턴 
	// 다운 캐스팅시 런타임 오류가 발생될 수 있다. , 런타임 오류를 방지 시켜준다.
	// 다운 캐스팅시 해당 타입이 객체에 존재 할 때 다운 캐스팅 하도록 설정
	
class A {
	int m;
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A {
	int n;
	void b() {
		System.out.println("n : " + n);
	}
}

public class InstanceOf {
	public static void main(String[] args) {

		// 1. instanceof  :  객체명  instanceof  타입
		
		A aa = new A();			// aa는 A 타입만 가진다.
		A ab = new B();			// ab는 A, B, 포함하고 A만 사용(접근)
		
		System.out.println( aa instanceof A); 		// true
		System.out.println( ab instanceof A); 		// true
		System.out.println( aa instanceof B); 		// false
		System.out.println( ab instanceof B); 		// true
		
		if ( aa instanceof B ) {	// aa 객체에 B 타입이 포함 되어 있을 경우에만 캐스팅을 한다.		
			B b = (B)aa;			// 런타임시 오류를 방지할 목적
			System.out.println("aa를 B로 캐스팅 했습니다. ");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅 불가 ");
		}
		
		if ( ab instanceof B ) {	// ab에 B타입이 존재하는 경우 다운 캐스팅
			B b = (B)ab;
			System.out.println("ab를 B 타입으로 캐스팅 했습니다. ");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅 불가");
		}
		
		if ( "안녕" instanceof String ) {	// 객체의 데이터 타입을 확인, 
			System.out.println("\"안녕\"은 String 클래스입니다. ");
		} else {
			System.out.println("\"안녕\"은 String 클래스가 아닙니다. ");
		}
		
	}
}
