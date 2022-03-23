package Chap11.EX01;

/* Final : 마지막 
 * 		- 필드명, 지역 변수명 : 상수 , final double PI = 3.14;
 * 			:  상수는 값을 변경할 수 없다.
 * 			:  클래스 영역 내의 상수 영역에 값에 복사 , 객체나 메소드가 사라질 경우에도 호출이 가능
 * 			
 		- 메소드명 : 오버라이딩이 불가한 메소드 ( 부모 클래스에서 자식 클래스에서 메소드 오버라이딩이 불가 ) 
 			: final void print(){}   
 		
 		- 클래스명 : 상속 불가한 클래스 
 				: final class A {} 	<== 자식 클래스를 두지 않는 마지막 클래스
 */

class A1 {
	int a = 3;			// 필드명, 지역 변수 명은 소문자를 사용, 여러 문자가 이어질 경우 첫자를 대문자
	final int B = 5;	// 상수명 대문자로 사용, 값을 변경 할 수 없다.
	A1 () {}
}
class A2 {
	int a;
	final int B;
	A2 () {
		a = 3;
		B = 5;
	}
}
class A3 {
	int a = 3;			// 필드 : 값을 변경
	final int B = 5;	// 상수 : 값을 변경 불가
	A3 () {
		a = 5;
	//	b = 10; 		// Final 은 값을 수정 할 수 없다.
	}
}
class B {
	void bcd () {		// 지역 변수 : 메소드에서 선언한 변수 ( 메소드 호출이 끝나면 지역 변수는 사라짐 )
		int a = 3;		// 스택 공간에 변수의 값이 할당. 메소드 호출이 끝나면 사라진다.
		final int B = 5;// 상수는 클래스 영역 영역에 복사가 되어서 메소드가 끝나더라도 상수 영역에 남아 있음.
		a = 7;
		//B = 9;		// final 은 값을 변경 할 수 없다.
	}
}
public class FinalModifier_1 {
	public static void main(String[] args) {

	}
}
