package ExAnswer;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];				// 방의 개수만 선언
		
		System.out.println("양의 정수 10개를 입력하시오 >> ");
		
		for ( int i = 0; i < arr1.length; i++) {	// for 문을 사용해서 각 방에 스캐너에서 던진 값을 저장
			arr1[i] = sc.nextInt();
		}
		
		// 3의 배수만 출력
		System.out.print("3의 배수는 : ");
		for (int i = 0; i < arr1.length; i++) { 	// 배열의 각방의 값을 가지고 와서 
			if ( arr1[i] % 3 == 0) {				// 배열의 방의 값을 가져와서 나머지가 0인 경우
				System.out.print(arr1[i] + " ");
			}
				
		}
		
		
		
	}
}
