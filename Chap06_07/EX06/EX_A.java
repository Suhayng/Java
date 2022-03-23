package Chap06_07.EX06;

import Chap06_07.EX05.A;

public class EX_A {

	public static void main(String[] args) {
		
		
		// 다른 패키지의 객체를 사용하는 방법 : 
		   // 1. 전체 클래스이름을 사용하는 방법 
		Chap06_07.EX05.A a  = new Chap06_07.EX05.A() ;    //클래스의 전체이름을 사용 : 패키지명.클래스명 
		
		//a.m = 10 ; // 접근 불가  : default 는 다른 패키지의 클래스에서는 접근이 불가. 
		a.k = 50 ;  //public : 다른 패키지의 클래스에서 접근이 가능 
		a.print2();  //public : 
		
		   // 2. import를 사용해서 접근 하는 방법 
		A aa = new A(); 		//import 후 사용하는 방법 
		aa.k  = 100;
		aa.print2();       // public : 다른 패키지의 클래스에서 접근 가능 
		
		
		
	}

}
