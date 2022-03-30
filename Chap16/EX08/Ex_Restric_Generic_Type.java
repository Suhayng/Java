package Chap16.EX08;

// ��� Ȯ�� �ϱ�!
// ���ʸ� Ŭ������ ���� �ؼ�, Ÿ�� ���� (Apple, Strawberry, Banana) , pencil�� Ÿ������ ������ �� ������ ����
abstract class Fruit {
	public abstract void Print ();	// �߻� �޼ҵ� 
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
		return "�̸� : " + name + "���� : " + price;
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
		return "�̸� : " + name + "���� : " + price;
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
		return "�̸� : " + name + "���� : " + price;
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
		return "�̸� : " + name + "���� : " + price;
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
