package Chap10.EX01;

class Student_sub extends Student {
	//Student_sub는 Student 를 상속 받고 있다. Student의 필드와 메소드를 상속 받는다. 
	//Student는 Person을 상속 받고 있다. Student는 Person의 필드와 메소드를 상속 받고 있다. 
	
	//Student_sub는 Person의 필드와 메소드와 Student 의 필드와 메소드를 모두 상속 받는다. 
	
	String sub1; 

	void sub1() {
		System.out.println("Student_sub1클래스 입니다.부모의 필드와 메소드를 물려 받습니다. ");
	}
}


class Student extends Person {  //대학생 클래스 , Person : 부모, Student 자식 
		// 자식클래스는 부모 클래스의 필드, 메소드, 인너클래스를 그대로 상속 받는다. 

	int studentID;
	void goToScool() {
		System.out.println("자식 클래스의 Student  메소드 goToScool 호출");
	}


}
class Worker extends Person {    //직장인 클래스 
	int workerID; //사번 
	void goToWork() {
		System.out.println("직장인 클래스의 메소드 호출 ");
	}
}


public class Person {   // 상속 : 부모 클래스의 ( 필드, 메소드, 내부클래스) 를 자식클래스에게 상속 
	String name ; 		// 상속의 잇점 : 1. 중복된 코드의 제거(코드의 재사용)		
	int age ;                       //2.  코드가 간결해짐.  3. 다형성 (메소드 오버라이딩) 
									//다형성 : 하나의 메소드 이름으로 여러형식으로 출력 
	void eat() {
		
		 System.out.println( "부모 클래스 의 eat () 메소드");
	}
	void sleep()  { 
		System.out.println(" 부모 클래스의 sleep () 메소드 ");
	}

	

	public static void main(String[] args) {
		
		//1. person 객체 생성 
		Person p = new Person();
		p.name = "홍길동";
		p.age = 11;
		p.eat();
		p.sleep();
		
		System.out.println("=======================");
		
		
		// 2. Student 객체 생성 
		Student s = new Student();   //Person 클래스를 상속 , Person 클래스의 필드와 메소드를 사용
			//자식 클래스는 부모 클래스의 선언된 필드와 메소드를 사용. 

		//Person 클래스의 필드 
		s.name = "이순신"; 
		s.age = 50; 
		//Student 클래스의 필드 
		s.studentID = 20200310; 	// 
		
		//Person 클래스의 메소드 
		s.eat();
		s.sleep(); 
		
		//Student 클래스의 메소드 
		s.goToScool();
		

		System.out.println("====Worker 클래스 =========");
		
		// 3. worker 객체 생성 
		Worker w = new Worker();  //Person 클래스를 상속 한다. Person 클래스의 필드와 메소드 사용.
		
		//부모 클래스의 필드 : Person 
		w.name = "세종대왕";
		w.age = 60; 
		//자식 클래스의 필드 : Worker 
		w.workerID = 20220310; //사번
		
		//부모 클래스의 메소드 : Person
		w.eat();
		w.sleep();
		
		//자식클래스의 메소드 : Worker 
		w.goToWork();
		
		System.out.println("=====객체 생성시 타입 변환 ===============");
		
		Person p1 = new Person();  // Person()은 Person 이다. (자식은 부모다) 
		Person ps = new Student(); // 업캐스팅 , student는 person 이다. 
		// Student sp = new Person(); //  person은 Student 이다 (x)  
		Person pw = new Worker(); // 업캐스팅 , Worker는 Person 이다. (0)
		// Worker wp = new Person(); // 오류 , person은 직장인 이다 (0)
		
		
		System.out.println("====Person <==Student <==Student_sub=============");
		
		Student_sub sub1 = new Student_sub();  //가능 
		//클래스타입(Type)	  객체명      < 자식 클래스 >
		
			//Person 클래스의 필드와 메소스 사용 가능 
			sub1.name = "신사임당"; 
			sub1.age  = 50 ; 
			sub1.eat();
			sub1.sleep();
			//Student 클래스의 필드와 메소드 
			sub1.studentID = 20220310; 
			sub1.goToScool();
			//Student_sub의 필드와 메소드 
			sub1.sub1 = "자식의 자식 클래스 ";
			sub1.sub1();
			
		Person ps1 = new Student_sub(); //업캐스팅 ; Student_sub객채를 생성시 부모 데이터 타입으로 형변환 
			//Student_sub는 Person 타입으로 업캐스팅 , Person클래스의 맴버만 사용 가능 
		
			//Person 클래스의 필드와 메소드만 접근 
			ps1.name = "BTS"; 
			ps1.age = 30 ; 
			ps1.eat();
			ps1.sleep();
		
		
		Student ss1 = new Student_sub(); //업캐스팅 : student_sub를 Student 타입으로 업캐스팅 
				//person과 student의 필드와 메소드를 사용가능 
			//Parson 의 필드와 메소드
			ss1.name = "SES";
			ss1.age = 30; 
			ss1.eat();
			ss1.sleep();
			//Student 의 필드와 메소드 
			ss1.studentID = 20110310;
			ss1.goToScool();
					
		Student_sub ss2 = new Student_sub(); //Person, Student, Student_sub의 필드와 메소드 모두 사용. 
			//person클래스의 필드와 메소드
			ss2.name = "봄여름가을겨울";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			//Student 클래스의 필드와 메소드 
			ss2.studentID = 20220310;
			ss2.goToScool();
			//Student_sub 의 필드와 메소드 
			ss2.sub1 = "자식의 자식 클래스";
			ss2.sub1(); 
			
		//상속 관계에서 객체 생성시 부모 데이터 타입으로 업캐스팅 가능 . 
			//부모 데이터 타입으로 업캐스팅 된 경우 부모의 필드오 메소드만 사용가능 
		
			// Person   <==  Student    <== Student_sub
			
			Person ps4 = new Student_sub();  
				//Student_sub 객체 생성시 Person 타입으로 업캐스팅 (자동으로 변환)
				//Student_sub는 Person과 Student와 Student_sub 의 모든 필드와 메소드 포함하고 있다. 
				//그중에서 Person클래스의 필드와 메소드만 접근 가능 
			Student ss4 = new Student_sub(); 
				//Student_sub 객체 생성시 Student 타입으로 업캐스팅 
				//Student_sub는 Person과 Student와 Student_sub 의 모든 필드와 메소드 포함하고 있다. 
				//그중에서 Person, Student 클래스의 필드와 메소드만 접근 가능 
			Student_sub ss5 = new Student_sub(); 
				//Student_sub 객체 생성시 Student_sub 타입으로 적굥 
				//Student_sub는 Person과 Student와 Student_sub 의 모든 필드와 메소드 포함하고 있다. 
				//그중에서 Person, Student, Student_sub 클래스의 필드와 메소드만 접근 가능 
			
			//다운 캐스팅 : 부모 데이터 타입으로 업캐스팅 된것을 자식 데이터 타입으로 변환 (수동으로 변환)  
			
			Student ps5 = (Student) ps4; 	// ps4 (Person, Student,Student_sub)의 데이터 타입은 person 
					//ps5는 Person, Student 의  필드와 메소드 접근 가능 
			ps5.name = "다운 캐스팅 ";
			ps5.age = 30 ;
			ps5.studentID = 20220310; 	//Student 필드와 메소드 사용 가능 
			ps5.goToScool();     //Student의 메소드 사용 
			
			Student_sub ps6 = (Student_sub) ps4;  // ps4는 Person 데이터 타입에서  Student_sub 로 다운캐스팅
				//Student_sub로 다운캐스팅됨 (Person, Student, Student_sub 의 필드와 메소드 사용 가능 
			ps6.name = "이용식"; // Person
			ps6.studentID = 20220310; // Student 
			ps6.sub1 = "자식의 자식클래스"; // Student_sub 
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		

	}

}
