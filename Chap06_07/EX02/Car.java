package Chap06_07.EX02;

public class Car {

	String company ; 
	String model ; 
	String color ; 
	int maxSpeed ;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {	// RAM의 값을 부여할때  setter 
		this.company = company;					//this : 자신의 객체 
	}			// 메소드에 인풋되는 변수명, 인풋된 변수를 받는 변수명, 메모리에 로드할 변수명 (this.
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {	//인풋, 인풋을 받는 변수, 메모리에 로드할 변수 모두 다를때는 
		model = mo;						//this 키우드를 생략 가능 
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	} 
	
	

}
