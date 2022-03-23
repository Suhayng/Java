package Chap02;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		System.out.println("정수값을 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		/*int value1 = sc.nextInt();
		if (value1 % 3 == 0) {
			System.out.println("3의 배수입니다." );			
		}else {
			System.out.println("3의 배수가 아닙니다.");			
		}*/
		
		int value2 = sc.nextInt();
		System.out.println(( value2 % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다."); 
		
		/* int value1 = (value1 % 3 == 0) ? 6 : 9;			// 조건이 거짓이므로 value1에 9가 저장됨.
		System.out.println(value1); */
		
		
		
	}

}


