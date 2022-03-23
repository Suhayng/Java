package Chap12.EX09;

public class SamsungPhone implements PhoneInterface{

	//인터페이스에서 정의한 메소드를 구현했다. 
	@Override
	public void sendCall() {
		System.out.println("띠리리링 ~~~");	
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다 ~~~ ");
	}
	
	//추가적인  SamgsungPhone 만의 기능을 추가 
	public void flash () {
		System.out.println("전화기에 불이 켜 졌습니다. ");
	}

}
