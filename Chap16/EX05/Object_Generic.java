package Chap16.EX05;

class Apple {		// ��� Ŭ���� , ����� ������ ���� ��ü 
	String name;
	int price;
	
	Apple (String name, int price) {	// ������ 
		this.name = name;
		this.price = price;
	} 
	@Override
	public String toString() {			// ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �޸� �ʵ��� ������ ���
		return "�̸� : " + name + " , ���� : " + price ; 
	}
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}

class Pencil {		// ���� Ŭ���� 
	String name;
	int price;
	
	Pencil (String name, int price) {	// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�.
		this.name = name;
		this.price = price;
	}
	
	public void bcd() {
		System.out.println("bcd() �޼ҵ� ���");
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " , ���� : " + price ; 
	}
}
/*
class Goods {		// Object �� ����ؼ� ��� ��ǰ�� ���� �� �� �ִ�.
	
	private Object object = new Object();	// Object : ��� Ŭ������ Object Ÿ������ ��ȯ 
	// alt + shift + s - getter/setter
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {	// Object Ÿ������ ��ĳ���� ��.
		this.object = object;
	}
	
}
*/

// ���ʸ��� ����ؼ� ��ü�� ���� �� �� �о� ����

// ���ʸ� Ŭ����
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
		
		Goods <Apple> goods1 = new Goods <Apple> ();	// goods1 �� Apple ������ Ÿ���̴�.
		goods1.set(new Apple ("��� 1", 1000));
		System.out.println(goods1.get());				// ���ʸ������� �ٿ� ĳ������ �� �ʿ䰡 ����.
		goods1.get().abc();							 	// �ٿ� ĳ���� ���� Apple ��ü�� abc �޼ҵ� ȣ��	
		
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("����1" , 1000));
		System.out.println(goods2.get());
		goods2.get().bcd();								// ���ʸ������� �ٿ� ĳ������ �� �ʿ䰡 ����.
		
	}
}
