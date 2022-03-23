package ExAnswer;
import java.util.Scanner;
public class Ex11_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		
		String name = null;			// 스캐너로 과목의 문자열을 받는 변수
		int i = 0;					// 방 번호를 담는 변수
		
		System.out.println("프로그램을 종료 하려면 \"그만\" 을 입력하세요. ");
		 
		while ( true ) {			// 특정 조건을 만족할 때 까지 계속 루프 돌아감.
			System.out.println("과목 이름 >>> ");
			name = sc.next();		// 스캐너로 과목 이름을 받아서 변수 name 에 할당.
			
			if (name.equals("그만")) {	// 주의 : name은 참조 변수이므로 == 를 사용하지 않고 equals 사용한다.
				break;
			}
			
			// course 의 각방을 돌면서 스캐너로 받은 name 변수의 값이 같을 때 
			for ( i = 0 ; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i] + "점수는 : " + score[i]);
					break;
				}
			
				// 마지막 방까지 갔을 때는 검색이 안된 경우?
				if ( i == course.length -1 ) {		// i 변수가 마지막 방까지 왔을 때 검색이 안된 경우 
					System.out.println("없는 과목 입니다. ");
				}
			
			}
		}
		
		sc.close();
		System.out.println("프로그램을 종료합니다. ");
		
		
		
		
		
		
		
	}
}
