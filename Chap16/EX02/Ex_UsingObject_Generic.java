package Chap16.EX02;

// Object를 사용해서 4 개의 객체를 저장하고 출력해보기 ( 03.29 메일 )
// 제너릭을 사용해서  4 개의 객체를 저장하고 출력해보기 v 

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
		return "이름 : " + name + " , 아이디 : " + id + " , 비밀번호 : " + pass ;
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
		return "이름 : " + name + " , 근속년수 : " + year + " , 이메일 : " + email ;
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
		return "이름 : " + name + " , 달리기 : " + run;
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
		return  "이름 : " + name + " , 색깔 : " + color + " , 가격 : " + price;
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
		goods1.set(new Student("나나" , "nana" , 1234));
		System.out.println(goods1.get());
		goods1.get().abc();
		
		Goodss <Professor> goods2 = new Goodss <Professor> ();
		goods2.set(new Professor("바바" , 10 , "baba@naver.com"));
		System.out.println(goods2.get());
		goods2.get().bcd();
		
		Goodss <Tiger> goods3 = new Goodss <Tiger> ();
		goods3.set(new Tiger("호랑이" , "빠르게 달린다."));
		System.out.println(goods3.get());
		goods3.get().cde();
		
		Goodss <Banana> goods4 = new Goodss <Banana> ();
		goods4.set(new Banana("바나나" , "노란색" , 3000));
		System.out.println(goods4.get());
		goods4.get().def();
		
	}
}