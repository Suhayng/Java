package Chap06_07.EX04;

//명시적 this 키워드 추가 : 반드시 this key를 사용해야 되는 경우 : 

class Aa {			// this key를 사용하지 않는 경우 : 지역변수로 인식 
	int m ; 
	int n ;
	void init ( int m , int n ) {		
		m = m ; 		// this 키를 사용하지 않는 경우 m <== 지역 변수 m 
		n = n ; 		// this 키를 사용하지 않는 경우 n <== 지역 변수 n 				
	}	
}

class Bb {			// this key를 사용하는 경우 
	int m ; 
	int n ; 
	void init ( int m , int n ) {
		this.m = m ; 		// this 키를 명시적으로 반드시 사용해서  m이 필드의 m 이라고 알려줘야 한다. 
		this.n = n ; 
	}	
}

public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		// 1. 필드의 명과 지역변수의 명이 같은 경우 ( this 키워드를 사용하지 않는 경우 : 지역변수에 저장 )
		 Aa aa  = new Aa();
		 aa.init(2,3); 			// 
		 System.out.println(aa.m);    //0
		 System.out.println(aa.n);    //0 
		// 2.  필드의 명과 지역변수의 명이 같은 경우 ( this 키워드를 사용하는  경우 : 필드 변수에 저장  )
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);    //2
		System.out.println(bb.n);    // 3
		
	}
}
