package Chap06_07.EX04;

// Aaa 클래스는 여러개의 생성자를 사용할 경우 this(); 없이 사용한 경우 : 중복된 값을 매번 입력 
class Aaa {   
	int m1, m2, m3, m4 ; 	//필드 4개 선언 
	Aaa() {		//생성자 : 매개 변수가 없는 생성자 
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaa(int a){ 
		m1 = a;  m2 = 2; m3 = 3; m4 = 4;
	}
	Aaa( int a, int b){
		m1 = a; m2 = b ;  m3 = 3; m4 = 4;
	}
	void print () {			// 각 메모리의 값읅 출력 .... 
		System.out.print( m1 + " ");
		System.out.print( m2 + " ");
		System.out.print( m3 + " ");
		System.out.print( m4 + " ");
		System.out.println( );
	}	
}

//Bbb 클래스는 여러개의 생성자를 사용할 경우 this(); 를 사용한 경우 : 중복된 값 제거 
class Bbb {
	int m1, m2, m3, m4 ;  //필드 4개 선언 
	Bbb (){
		m1 = 1; m2 = 2; m3 = 3; m4 = 4; 	// 초기값 할당
	}
	Bbb (int a){
		this(); 		//인풋 값이 없는 생성자 호출 
		m1 = a; 
	}
	Bbb(int a, int b){
		this(a); 	// 매개변수 1개인 생성자 호출 
		m2 = b;     
	}
	
	void print () {			// 각 메모리의 값읅 출력 .... 
		System.out.print( m1 + " ");
		System.out.print( m2 + " ");
		System.out.print( m3 + " ");
		System.out.print( m4 + " ");
		System.out.println( );
	}
	
	
}


public class ThisMethod_2 {
	public static void main(String[] args) {
		// 1. 세가지 객채 생성 ( this 미사용) 
		Aaa aaa1 = new Aaa();  // 매개 변수가 없는 생성자 호출 
		Aaa aaa2 = new Aaa(10); // 매개변수가 하나인 생성자 호출
		Aaa aaa3  = new Aaa(10,20);	// 매개 변수가 2개인 생성자 호출 
		aaa1.print();
		aaa2.print();
		aaa3.print();
		System.out.println("===================");	
		
		Bbb bbb1 = new Bbb(); 			//기본 생성자 호출
		Bbb bbb2 = new Bbb(10);			//
		Bbb bbb3 = new Bbb(10,20);
		
		bbb1.print();   // 1, 2, 3, 4
		bbb2.print();   // 10, 2, 3, 4 
		bbb3.print();
		
		
	}

}
