package ExAnswer;
public class Ex09 {
	public static void main(String[] args) {
		
		double c = (double) Math.random();		// 난수 발생기 ( 임의의 수를 자동으로 발생시킴 )
			// 0.0000XXX ~ 0.9999XXX  <-- 범위의 임의의 값을 발생시킴.
		System.out.println(c);
		
		int d = (int)(Math.random() * 10);		// 0 ~ 9 까지의 랜덤한 값을 생성
		int e = (int)(Math.random() * 10 + 1);	// 1 ~ 10 까지의 랜덤한 값을 생성
		
		System.out.println("0부터 9까지의 랜덤한 값 : " + d);
		System.out.println("1부터 10까지의 랜덤한 값 : " + e);
		
		// 1부터 100까지의 난수를 발생시킴
		int f = (int) (Math.random() * 100 + 1);
		System.out.println("1부터 100 까지의 랜덤한 값 : " + f);
		
				
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
