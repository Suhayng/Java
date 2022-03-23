package Chap06_07.EX06;

import Chap06_07.EX05.C;   //ctrl + shift + o 
						//class의 접근 제한자가 public 

public class EX_C {

	public static void main(String[] args) {

		
		// 다른 클래스에 존재함 / public 만 접근 / model , color 메모리로 접근 불가 
		// model과 color는 setter 를 public 통해서 할당후 출력 
		
		C c = new C(); // 다른 패키지 이므로 import 
		
		
		//company , model, color 는 다른 패키지에서 접근 불가, setter를 통해서 메모리 값을 할당하도록 구성
		c.maxSpeed = 300 ; // 다른 패키지의 클래스에서는 public , protected (상속 설정) 
		
		//setter 를 통해서 메모리의 값을 부여. 
		c.setModel("에쿠스");
		c.setColor("검은색");
		c.setMaxSpeed(300);	
		
		c.print();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
