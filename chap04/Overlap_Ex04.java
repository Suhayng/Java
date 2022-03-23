package chap04;
public class Overlap_Ex04 {
	public static void main(String[] args) {
		
		// 1. if 문 내의 if 중복
		
		int value1 = 5;
		int value2 = 3;
		
		if (value1 > 5) {
			if (value2 < 2) {
				System.out.println("실행1");
			}else {
				System.out.println("실행2");
			}
		}else {
			System.out.println("실행3");
		}
		
		System.out.println("===================");
		
		// 2. Switch 내의 for 문
		
		int value3 = 1;
		switch (value3) {
		case 1:
			for(int k = 10 ; k > 0 ; k--) {
				System.out.print(k + " ");
			}
			break;
		case 2:
			for (int k = 0 ; k < 10 ; k++) {
				System.out.print(k + " ");
			}
			// default는 생략 되어 있음.
			break;
		}
		
		// 3. for 문 내의 for 문
		
		for (int i = 0 ; i < 3 ; i++) { // 0 부터 2 , 3번
			for (int j = 0 ; j < 5 ; j++) { // 0 부터 4, 5번
				
				if ( i == j ) {
					System.out.println( i + " = " + j);
				}else {
					System.out.println(i + " , " + j);
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
}
