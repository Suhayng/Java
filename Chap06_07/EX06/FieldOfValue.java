package Chap06_07.EX06;

//p.jangwoo@gmail.com  

//객체의 필드에 값을 할당 하는 방식 : 3가지 
  //1. 필드에 직접 값을 부여 하는 방식 							<== 객체를 생성후
  //2. setter 를 통해서 객체에 필드에 값을 부여. ( 컨트롤이 된다)      <== 객체를 생성후 
  //3. 생성자를 통해서 객체의 필드 값을 부여 ( 컨트롤 된다) 			<== 객체를 생성할때 초기값으로 필드에 값을 할당 

class Aa {  //1. 객체 생성후 직접 필드에 값 할당
	String name ;  // 이름 
	int	age ; 		// 나이
	String mail;    // 메일 주소 
	
	void print() {
		System.out.println( "name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Bb{	//2. setter를 통해서 객체의 필드의 값을 할당
	String name ;  // 이름 
	int	age ; 		// 나이
	String mail;    // 메일 주소 

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}



	void print() {
		System.out.println( "name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Cc{	//3. 생성자를 통해서 객체의 필드의 값을 할당
	String name ;  // 이름 
	int	age ; 		// 나이
	String mail;    // 메일 주소 
	
	Cc(String name, int age, String mail) {   // 생서자에서 매개변수 3개를 받아서 
		this.name = name; 
		this.age = age;
		this.mail = mail;
	}
	
	void print() {
		System.out.println( "name : " + name + " age : " + age + " mail : " + mail);
	}
	
}


public class FieldOfValue {

	public static void main(String[] args) {

		//1. 객체의 필드에 직접 값을 할당. 
		Aa aa = new Aa();          //객체를 생성후 
		aa.name = "홍길동"; 
		aa.age = 30;
		aa.mail= "aaa@aaa.com";
		aa.print();
		
		
		//2. 객체의 setter 를 사용해서 필드의 값을 부여 
		Bb bb = new Bb();			// 객체를 생성후 
		bb.setName("김유신");
		bb.setAge(50);
		bb.setMail("bbb@bbb.com");
		bb.print();
		
		
		//3. 생성자를 사용해서 필드의 값을 부여. (객체를  생성할때 필드의 값을 초기화 ) 
		Cc cc = new Cc("세종대왕", 60, "ccc@ccc.com");        // 객체를 생성할때 필드의 값을 부여 
		
		cc.print();
				
				
		

	}

}
