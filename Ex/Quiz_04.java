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
	
	
		Student1 s1 = new Student1 (1111, "ȫ�浿", 90, 80);
		Student1 s2 = new Student1 (1212, "������", 95, 80);
		Student1 s3 = new Student1 (1313, "��Ŀ��", 70, 90);
		Student1 s4 = new Student1 (1111, "ȫ�浿", 85, 85);
	
		
		
		//studentID �� ���� ��� ���� �л��̴�. ��� ���
		
		System.out.println(s1.equals(s4));
		
		if (s1.equals(s4)) {
			System.out.println("s1�� s4�� ���� �л��Դϴ�.");
		} else {
			System.out.println("s1�� s4�� �ٸ� �л��Դϴ�.");
		}
		
	}
}
