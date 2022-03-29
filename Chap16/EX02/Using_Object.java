package Chap16.EX02;
/*
 	- Object 는 모든 객체를 저장 할 수 있다.
 	- 상품을 저장하는 클래스에 Object 타입으로 저장하면 모든 객체를 담을 수 있다.
	- Object 의 장점 : 모든 객체를 담을 수 있다.( casting )
			   단점 : 매번 다운 캐스팅을 해서 출력 해야 한다.
			   		 약한 타입 체크 : 실행시 ClassCastException 이 발생될 수 있다.
*/

class Apple {		// 사과 클래스 , 사과의 정보를 담은 객체 
	String name;
	int price;
	
	Apple (String name, int price) {	// 생성자 
		this.name = name;
		this.price = price;
	} 
	@Override
	public String toString() {			// 객체 자체를 출력시 객체의 주소가 아니라 메모리 필드의 정보를 출력
		return "이름 : " + name + " , 가격 : " + price ; 
	}
}

class Pencil {		// 연필 클래스 
	String name;
	int price;
	
	Pencil (String name, int price) {	// 생성자를 통해서 필드의 값 할당.
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름 : " + name + " , 가격 : " + price ; 
	}
}

class Goods {		// Object 를 사용해서 모든 상품을 저장 할 수 있다.
	
	private Object object = new Object();	// Object : 모든 클래스는 Object 타입으로 변환 
	// alt + shift + s - getter/setter
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {	// Object 타입으로 업캐스팅 됨.
		this.object = object;
	}
	
}

public class Using_Object {
	public static void main(String[] args) {

		// 1. Apple 을 저장 후 출력. Object 
		Goods goods1 = new Goods();
		goods1.setObject(new Apple ("사과 3" , 4000));		// Setter 로 값을 할당
		System.out.println((Apple)goods1.getObject());		// Getter 로 객체를 출력 : Object ===> Apple (다운캐스팅) 
		//()
		
		// 2. Pencil 을 저장 후 출력. Object 		
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil ("연필 3" , 3000));		// Setter 로 값을 할당
		System.out.println((Pencil)goods2.getObject());		// Getter 로 객체를 출력 : Object ===> Pencil (다운캐스팅) 
		
		// 3. 잘못된 캐스팅을 할 수 있다. ( 약한 타입 체크 ) : Object 의 문제점. 
		Goods goods3 = new Goods();
		goods3.setObject(new Apple ("사과 4", 5000));
		System.out.println((Pencil) goods3.getObject()); 	// 약한 타입 체크 : 실행시 오류 발생
		
		
	}
}
