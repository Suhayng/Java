package Chap06_07_Ex01;

class AA {
	String name; 				// 필드(멤버) : 인스턴스화 시켜야 사용 가능 ( Heap 공간에 값이 저장 )
 	int age;
	String email;
	
	public String getName() {	// 메소드(멤버) : 인스턴스화 시켜야 사용 가능
		return name;			// Heap 공간에 주소만 저장, 클래스 영역 내의 메소드 영역에 저장
						// retrun : 메소드를 호출하는 곳으로 변수의 값을 던져준다.
	}
	public void setName(String name) {	// void : 리턴 값이 없다를 알려주는 식별자
		this.name = name;
	}
	public int getAge() {				
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


public class CreatObjecAndUsing {
	public static void main(String[] args) {
		
		AA aa = new AA();		// AA 클래스(설계도), aa(객체)를 생성
		
		// 객체의 메소드 호출
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		// 객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//===============================
		
		// 메소드 호출
		System.out.println("====================");
		
		// setters : 객체의 메모리에 값을 할당 할 때
		aa.setName("홍길동");		// 객체의 변수에 값을 할당
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		// getters : 객체의 메모리의 값을 가지고 올 때
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("================");
		
		AA bb = new AA();
		bb.setName("김유신");
		bb.setAge(50);
		bb.setEmail("bbb@bbb.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("================");
		
		AA cc = new AA();
		cc.setName("신사임당");
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		System.out.println("================");
		
		
	
	
	
	}
}
