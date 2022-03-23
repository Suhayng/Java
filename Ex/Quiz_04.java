package Ex;

class Student1 {
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student1 (int studentID, String name, int kor, int eng) {
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student1) obj).studentID) {
			return true;
		} else {
			return false;
		}
	}
}

public class Quiz_04 {
	public static void main(String[] args) {
	
	
		Student1 s1 = new Student1 (1111, "홍길동", 90, 80);
		Student1 s2 = new Student1 (1212, "김지원", 95, 80);
		Student1 s3 = new Student1 (1313, "이커피", 70, 90);
		Student1 s4 = new Student1 (1111, "홍길동", 85, 85);
	
		
		
		//studentID 가 같은 경우 같은 학생이다. 라고 출력
		
		System.out.println(s1.equals(s4));
		
		if (s1.equals(s4)) {
			System.out.println("s1과 s4는 같은 학생입니다.");
		} else {
			System.out.println("s1과 s4는 다른 학생입니다.");
		}
		
	}
}
