package Ex;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("양의 정수 10개를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		for( int i = 0 ; i < array.length ; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("3의 배수는 : ");
		for( int j = 0 ; j < array.length ; j++) {
			if(array[j] % 3 == 0) {
				System.out.print(array[j] + " ");
			}
		}
		sc.close();
	}
}
