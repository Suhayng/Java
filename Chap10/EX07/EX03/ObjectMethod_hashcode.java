package Chap10.EX07.EX03;

import java.util.HashMap;	
// HashMap : key = 값 으로 저장되는 자료 구조.
	// Key 는 중복 될 수 없다.
	// HashMap의 Key에 객체를 저장할 경우, key에 저장되는 객체가 중복되지 않는 고유한 정보를 저장을 해야한다.
	// Object 클래스의 hashcode()를 사용해서 객체가 key에 저장될 경우 중복되지 않도록 설정할 수 있다. 

class A {
	String name;
	A (String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A) obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name;
	}
}
class B {					// hashCode() + equals() 재정의  <<== 동일한 객체 인식
	String name;
	B (String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B) obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
}


public class ObjectMethod_hashcode {
	public static void main(String[] args) {

		HashMap<Integer, String> hm1 = new HashMap<>(); 	// <Integer <== key, String <== Value >
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");		// 1 : 데이터1 ==> 데이터2
		hm1.put(2, "데이터3");	
		
		System.out.println(hm1); 	// 1 = 데이터1 , 2 = 데이터3
		
		System.out.println("===============");
		
		HashMap<A, String> hm2 = new HashMap<>();			// equals()만 재정의되어 있다.
		hm2.put(new A("첫번째"), "데이터1");					// HashCode() 재정의 안 되어 있다.
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		System.out.println(hm2); 	// HashMap 이 잘못 구현된 경우
		
		System.out.println("===============");
		
		HashMap<B, String> hm3 = new HashMap<>();	// hashCode() + equals() 재정의 ==> 동일 객체
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		
		System.out.println(hm3); 		//HashMap 구현이 제대로 설정된 경우 : Key가 중복 되면 안된다.
				// hm3(HashMap) 는 toString() 메소드가 재정의 되어있다.
		
	//	System.out.println();
		
		
	}
}
