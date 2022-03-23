package ExAnswer;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		
		/*
		int n = (int)(Math.random() * 3);		// * 3 --> n은 0, 1, 2만 출력함.
			// Math.random() : 0.000000xxx ~ 0.999999xxx
		System.out.println(n);
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String uSelect, comSelect ; 			// uSelect : 당신이 낸 값(스캐너로 인풋) 
											// comSelct : 컴퓨터가 낸 값(난수 발생기(Math.random())으로 인풋)
		
		int n ; 		// 컴퓨터가 낸 값 (0 , 1 , 2), 0 : 가위, 1 : 바위, 2 : 보
		
		System.out.println("컴퓨터와 \'가위 바위 보\' 게임을 합니다. ");
		
		do {
			System.out.println("가위 바위 보 !! >>> ");
			uSelect = sc.next();					// 당신이 내는 값 : 인풋
			if ( uSelect.equals("그만")) 
				break;								// '그만' : do while 문을 빠져 나온다.
			
			n = (int)(Math.random() * 3 );			// 컴퓨터가 내는 값 : 0, 1, 2
			comSelect = str[n];						// 컴퓨터가 내는 값 0 : 가위, 1 : 바위 , 2 : 보
			
			// 사용자가 가위일 때
			if ( uSelect.equals("가위" )) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 비겼습니다. " );
				} else if (comSelect.equals("바위")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 컴퓨터가 이겼습니다. ");
				} else if (comSelect.equals("보")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 당신이 이겼습니다. ");
				}
			}	
			// 사용자가 바위일 때
			 else if (uSelect.equals("바위")) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 당신이 이겼습니다. " );
				} else if (comSelect.equals("바위")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 비겼습니다. ");
				} else if (comSelect.equals("보")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 컴퓨터가 이겼습니다. ");
				}
			 }	
			// 사용자가 보일 때
			 else if (uSelect.equals("보")) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 컴퓨터가 이겼습니다. " );
				} else if (comSelect.equals("바위")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 당신이 이겼습니다. ");
				} else if (comSelect.equals("보")) {
					System.out.println("사용자 = " + uSelect + " , 컴퓨터 = " + comSelect + " 비겼습니다. ");
				}
			}
			
		}while (true);
		
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
