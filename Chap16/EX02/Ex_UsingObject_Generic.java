package Chap16.EX02;

// Object�� ����ؼ� 4 ���� ��ü�� �����ϰ� ����غ��� ( 03.29 ���� )
// ���ʸ��� ����ؼ�  4 ���� ��ü�� �����ϰ� ����غ��� v 

class Student {
	String name;
	String id;
	int pass;
	
	Student ( String name, String id, int pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " , ���̵� : " + id + " , ��й�ȣ : " + pass ;
	}
    void abc() {
		// TODO Auto-generated method stub
	}
	
}

class Professor {
	String name;
	int year;
	String email;
	
	Professor ( String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " , �ټӳ�� : " + year + " , �̸��� : " + email ;
	}
	void bcd() {
		// TODO Auto-generated method stub
	}
}

class Tiger {
	String name;
	String run;
	
	Tiger ( String name, String run) {
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " , �޸��� : " + run;
	}
	void cde() {
		// TODO Auto-generated method stub
	}
}

class Banana {
	String name;
	String color;
	int price;
	
	Banana (String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return  "�̸� : " + name + " , ���� : " + color + " , ���� : " + price;
	}
	void def() {
		// TODO Auto-generated method stub
	}
}

class Goodss <T>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}



public class Ex_UsingObject_Generic {
	public static void main(String[] args) {
		Goodss <Student> goods1 = new Goodss <Student> ();
		goods1.set(new Student("����" , "nana" , 1234));
		System.out.println(goods1.get());
		goods1.get().abc();
		
		Goodss <Professor> goods2 = new Goodss <Professor> ();
		goods2.set(new Professor("�ٹ�" , 10 , "baba@naver.com"));
		System.out.println(goods2.get());
		goods2.get().bcd();
		
		Goodss <Tiger> goods3 = new Goodss <Tiger> ();
		goods3.set(new Tiger("ȣ����" , "������ �޸���."));
		System.out.println(goods3.get());
		goods3.get().cde();
		
		Goodss <Banana> goods4 = new Goodss <Banana> ();
		goods4.set(new Banana("�ٳ���" , "�����" , 3000));
		System.out.println(goods4.get());
		goods4.get().def();
		
	}
}