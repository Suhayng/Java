package Chap16.EX02;
/*
 	- Object �� ��� ��ü�� ���� �� �� �ִ�.
 	- ��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ� ��� ��ü�� ���� �� �ִ�.
	- Object �� ���� : ��� ��ü�� ���� �� �ִ�.( casting )
			   ���� : �Ź� �ٿ� ĳ������ �ؼ� ��� �ؾ� �Ѵ�.
			   		 ���� Ÿ�� üũ : ����� ClassCastException �� �߻��� �� �ִ�.
*/

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
}

class Pencil {		// ���� Ŭ���� 
	String name;
	int price;
	
	Pencil (String name, int price) {	// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�.
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + " , ���� : " + price ; 
	}
}

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

public class Using_Object {
	public static void main(String[] args) {

		// 1. Apple �� ���� �� ���. Object 
		Goods goods1 = new Goods();
		goods1.setObject(new Apple ("��� 3" , 4000));		// Setter �� ���� �Ҵ�
		System.out.println((Apple)goods1.getObject());		// Getter �� ��ü�� ��� : Object ===> Apple (�ٿ�ĳ����) 
		//()
		
		// 2. Pencil �� ���� �� ���. Object 		
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil ("���� 3" , 3000));		// Setter �� ���� �Ҵ�
		System.out.println((Pencil)goods2.getObject());		// Getter �� ��ü�� ��� : Object ===> Pencil (�ٿ�ĳ����) 
		
		// 3. �߸��� ĳ������ �� �� �ִ�. ( ���� Ÿ�� üũ ) : Object �� ������. 
		Goods goods3 = new Goods();
		goods3.setObject(new Apple ("��� 4", 5000));
		System.out.println((Pencil) goods3.getObject()); 	// ���� Ÿ�� üũ : ����� ���� �߻�
		
		
	}
}
