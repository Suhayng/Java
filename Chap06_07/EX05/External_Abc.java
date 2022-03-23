package Chap06_07.EX05;

import Chap06_07.EX06.Bcd;    // ctrl + shif + o : 자동 import 

//import Chap06_07.EX06.Abc;   // Abc class에 접근제한자가 default : 외부패키지에서 접근 불가 

public class External_Abc extends Bcd{   //External_Abc클래스는 Bcd클래스를 상속 설정 
			// 부모 클래스 : Bcd , 자식 클래스: External_Abc 

	public static void main(String[] args) {

		// Abc abc2 = new Abc();  //class 접근 제어자가 default 여서 접근 불가. 
		
		Bcd bcd1 = new Bcd(); 					// 부모 클래스 객체 
		External_Abc ext = new External_Abc(); // 자식 클래스 
		
		// 다른 패키지에서 필드 호출 : 1. import (public : 클래스 접근 지정자  ) , 
								//2. 객체 생성, 3. 접근 지정자 확인후 접근 ( 필드, 메소드 ) 
		
		bcd1.a= 1000; //public   : 다른 패키지에서 접근 가능 
		// bcd1.b = 2000; 	//protected  : 다른 패키지에서 상속 관계에 있을 때 접근 가능 
		ext.b = 2000 ; 	 //자식 클래스에서 부모 클래스의 protected 를 패른 패키지에서 접근 (상속 관계)
		
			

	}

}
