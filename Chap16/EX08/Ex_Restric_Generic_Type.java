package Chap16.EX08;

// 답안 확인 하기!
// 제너릭 클래스를 생성 해서, 타입 제한 (Apple, Strawberry, Banana) , pencil을 타입으로 접근할 수 없도록 설정
abstract class Fruit {
	public abstract void Print ();	// 추상 메소드 
}

class Apple extends Fruit {
	String name;
	int price;
	Apple (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "가격 : " + price;
	}

	@Override
	public void Print() {
		
	}

}

class Strawberry extends Fruit {
	String name;
	int price;
	Strawberry (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "가격 : " + price;
	}


	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}}
class Banana extends Fruit {
	String name;
	int price;
	Banana (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "가격 : " + price;
	}


	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}
}
class Pencil {
	String name;
	int price;
	Pencil (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "가격 : " + price;
	}

}

class AA <T extends Fruit> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}



public class Ex_Restric_Generic_Type <T extends Fruit>{
	
		private T fruit;
		
		public T getFruit( ) {
			return fruit;
		}
		
		public void setFruit(T fruit) {
			this.fruit = fruit;
		}
		
		public String toString() {
			return fruit.toString();
		}
		
		public void print() {
			fruit.Print();
		}
		
		
	
}
