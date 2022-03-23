package ExAnswer;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};		// 환산 할 돈의 종류를 배열에 저장
		int money ;			// 스캐너로 인풋 받을 돈을 저장하는 변수
		
		System.out.println("환산할 돈의 금액을 입력하시오 >> ");
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			System.out.printf(" %d 원 짜리 : %d 개 \n" , unit[i], money/unit[i]);
			//System.out.println(unit[i] + " 원 짜리 : " + money / unit[i] + "개");
			money = money - (money / unit[i] ) * unit[i];
							//환산한 돈의 개수(1)	* 50000
		}
		
		
		
		
		
		
	}
}
