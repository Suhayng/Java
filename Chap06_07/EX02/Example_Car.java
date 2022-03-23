package Chap06_07.EX02;


public class Example_Car {

	public static void main(String[] args) {
		// Car Class 를 객체화 해서 5개의 객체를 생성해서 값을 할당 해서 출력 해보세요. 
		
		Car sonata = new Car();   //객체화 ,  
		Car grandeur = new Car();
		
		// 각 변수의 값을 할당하고 출력해 보세요. (메모리를 직접 사용, settor를 통해서 값을 할당)
		 
		//변수의 값을 직접 할당  , 권장 사항은 아니다. 메모리에 원하지 않는 값을 직접 항달. 
		//private 변수명 : 캡슐화 , 직접 변수의 값을 할당하지 못하도록 한다. 
		//setter 를 통해서 값을 부여 : 변수의 입력되는 값을 제어 할수 있다. 
		sonata.company = "현대";   
		sonata.model = "소나타";
		sonata.maxSpeed = 200; 	//  -, 700 값 이상을 넣을수 없도록 제어 
		
		// ==============================================================
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		
		// =======================================================
		
		// setter 를 통해서 값을 할당 : RAM의 값을 부여 할때 사용
		grandeur.setCompany("현대");
		grandeur.setColor("빨강");
		grandeur.setMaxSpeed(300);
		grandeur.setModel("그랜져");
		
		//getter 는 메모의 값을 출력 할때.
		System.out.println( grandeur.getColor());
		System.out.println(grandeur.getModel());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//p.jangwoo@gmail.com 
		
		//[문제]  : 스캐너로 임의의 정수값을 받아서 합계, 평균 ..... >> 

		
		
		
	}

}
