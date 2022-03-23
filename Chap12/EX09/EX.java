package Chap12.EX09;

public class EX {
	public static void main(String[] args) {
		//1. SamsungPhone 타입으로 지정
		SamsungPhone s1	= new SamsungPhone(); 
		s1.printLogo(); 	//interface에서 defatlt  메소드가 상속되어 내려온 기능     
		s1.sendCall();		//
		s1.receiveCall();
		s1.flash();
		
		System.out.println("========================");
		
		//2. PhoneInterface 로 업캐스팅 
		PhoneInterface s2 = new SamsungPhone(); 
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		SamsungPhone ss = (SamsungPhone) s2 ;   // s2   :  PhoneInterface   ===> SamsungPhone 로 타입 변환
		ss.flash();   //flash 다운 캐스팅후 출력 
		
		
	}

}

// 토요일 오전 12:00 , Java Program  , 객관식 20 문제 , 60이상 , 일요일 저녁 10시 . 











