package Chap10.EX07.EX04;

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class String_Ex {
	public static void main(String[] args) {

		String s0 = new String("안녕");	// 
		
		String s1 = "안녕";			// String 은 참조 변수
		
		System.out.println(s0); 	// String 는 객체를 출력할 때 toString() 재정의 되어 있다.
		System.out.println(s1);
		
		A a = new A ("안녕");
		System.out.println(a);
		
	}
}
