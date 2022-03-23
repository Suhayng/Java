package Chap06_07.EX05;

public class C {	// 다른 패키지에서 import 가능 
	
	// 필드에 부여 되는 접근 제어자 
	private String company = "현대자동차" ; 	// 회사명 
	String model ; 	//모델 , default 
	protected String color;  //색깔
	public int maxSpeed ;    //최대 속도 
	
	public void setModel(String model) {	//public  외부 패키지의 클래스에서 접근 가능 
		this.model = model;
	}
	public void setColor(String color) {	
		this.color = color;			
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;	
	}
	
	
	
	
	
	public void print() { 
		System.out.println( "company : " + company + " model : " + model + " color : " + color
				+ " maxSpeed : " + maxSpeed);
	}

}
