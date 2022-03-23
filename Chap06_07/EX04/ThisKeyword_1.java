package Chap06_07.EX04;

/* 묵시적 this 키워드 자동 추가 */
// 1. 클래스 내부에서 필드, 메소드앞에 자동으로 this 키워드가 붙음. 
      // this 키는 자기 자신의 객체의 필드와 객체의 메소드를 지칭 , 

class A {
	int m ; 
	int n ; 
	
	// A () {}       // 기본 생성자 가 생략됨 ... 
	
	void init ( int a , int b) {
		int c; 				// a, b, c 는 지역 변수 (Stack 영역에 변수명과 값을 가진다. )
		c = 3; 				     // init() 메소드 생성시 에 stack생성되고 메소드가 끝나면 소멸 
		this.m = a;			//this 키를 생략시, 컴파일러가 자동으로 추가
		this.n = b; 		////this 키를 생략시, 컴파일러가 자동으로 추가 
	}
	void work() { 
		this.init (2,3);	//this 키를 생략시, 컴파일러가 자동으로 추가
		System.out.println( this.m  + " , " + this.n );   //this는 생략 가능, 생략시 컴파일러가 자동으로 추가
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
		//2. 객체 생성 
		A a = new A(); 
		
		//3. 메서드 호출 
		a.work();
		
		
	}
}
