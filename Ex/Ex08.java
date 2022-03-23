package Ex;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};		
	
		System.out.println("금액을 입력하시오 >> ");
		int m = sc.nextInt();
		
		for(int i = 0 ; i < unit.length ; i++) {
			if( m / unit[i] >= 1 ) 
			System.out.println(unit[i] + "원 짜리 : " + m / unit[i] + "개");
			m = m % unit[i];	
			
		}
		sc.close();
	}
}
