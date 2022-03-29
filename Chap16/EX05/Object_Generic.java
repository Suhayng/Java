package Chap16.EX05;

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
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}

class Pencil {		// 연필 클래스 
	String name;
	int price;
	
	Pencil (String name, int price) {	// 생성자를 통해서 필드의 값 할당.
		this.name = name;
		this.price = price;
	}
	
	public void bcd() {
		System.out.println("bcd() 메소드 출력");
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " , 가격 : " + price ; 
	}
}
/*
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
*/

// 제너릭을 사용해서 객체를 저장 후 값 읽어 오기

// 제너릭 클래스
class Goods <T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}


public class Object_Generic {
	public static void main(String[] args) {
		
		Goods <Apple> goods1 = new Goods <Apple> ();	// goods1 는 Apple 데이터 타입이다.
		goods1.set(new Apple ("사과 1", 1000));
		System.out.println(goods1.get());				// 제너릭에서는 다운 캐스팅을 할 필요가 없다.
		goods1.get().abc();							 	// 다운 캐스팅 없이 Apple 객체의 abc 메소드 호출	
		
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("연필1" , 1000));
		System.out.println(goods2.get());
		goods2.get().bcd();								// 제너릭에서는 다운 캐스팅을 할 필요가 없다.
		
	}
}
