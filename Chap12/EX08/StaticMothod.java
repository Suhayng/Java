package Chap12.EX08;


// 인터페이스 내부에 static 키가 들어간 메소드 : 하위 자식에서 구현 없이 바로 호출 

/* 인터페이스 내부 구성 요소 
      1. 필드  :  [public static final]
      2. 메소드 :  [public abstract]       <== 추상 메소드  (구현부가 없은 메소드)
                 [public] default         <== 구현부가 있는 메소드  (Java 1.8 이상에서 새로운 기능)
                 [public] static          <== 구현부가 있고, 객체 생성 없이 호출 (Java 1.8 이상에서 새로운 기능)
 
 */




interface A {
	static void abc () {	//Java 1.8 이상에서 새롭게 추가된 기능 
		System.out.println("A 인터페이스의 정적 메소드 abc()");
	}
}

public class StaticMothod {

	public static void main(String[] args) {
		//1. 정적(static) 메소드 호출 
		A.abc();      // interface 이름으로 바로 호출 가능 
		
	}

}
