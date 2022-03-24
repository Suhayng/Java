package Chap14.EX07;

/* Exception - Check Exception - 컴파일 오류, 반드시 예외처리
			 - unChecked Exception, RunTime Exception - 실행시에 예외
  예외 처리 방식 - try catch - 자식이 직접 예외를 처리
  			 - throws - 예외 처리를 미루는 것(전가), 메소드 블락안의 예외를 메소드 호출시 호출하는 쪽에 미루는 것.
  			 		 throw : 예외를 강제 발생
*/

// 1. Exception 이 발생되는 메서드 내부에서 자신이 직접 예외를 처리한 경우
class A {
	void abc() {
		bcd();		// bcd(); 호출
	}
	void bcd() {
		try {
		Class cls = Class.forName("java.lang.Object");	// 일반 예외 ClassNotFonundException
		Thread.sleep(1000); 	// ms : 1000 , 1초		// 일반 예외
			
	} catch (ClassNotFoundException | InterruptedException e) {
	}	
		// Class.forName : 동적 로딩 - 컴파일시에 체크하지 않고 실행할 때 객체가 존재하는지 확인
			// 실행시 클래스 파일이 존재할 수도 있고 존재하지 않을 수도 있기 때문에 예외 처리를 해야 한다.
	}
}

// 2. Throws를 사용해서 Exception을 미루는 경우
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		
		}
	}
	
	// bcd() 메소드를 호출하는 곳에서 예외를 미루겠다.
	void bcd() throws ClassNotFoundException, InterruptedException  {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}


public class ThrowsException_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
