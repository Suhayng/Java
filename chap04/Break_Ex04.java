package chap04;
public class Break_Ex04 {
	public static void main(String[] args) {
		// 1. 단일 loop 가 적용된 곳에서 Break 탈출
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			System.out.println(i);
			break;							// break 를 만나면 해당 구문을 빠져 나온다.
		} //0 
		
		System.out.println("================");
		
		// 2. for 문 내에서 of 조건을 사용해서 break를 넣어서 해당 구문을 빠져 나온다.
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			if ( i == 5 ) {						// i가 5일 때 for 문을 빠져 나온다.
				break;
			}
			System.out.print(i + " " );
		}
		System.out.println();
		System.out.println("================");

		// 3. 다중 loop 문일 때 break 탈출 ( 하나의 반복문만 빠져 나온다. )
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < 5  ; j++) {
				if ( i == 2 ) {
					break;
				}
				System.out.println( i + " , " + j);
			}
		}
		System.out.println("============");
		
		// 4. 다중 loop (반복문) 에서 한꺼번에 탈출 1) 라벨 이름을 사용해서 탈출
		
POST1:		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (i == 2) {
					break POST1;
				}
				
				System.out.println(i + " , " + j);
			}
		}
		System.out.println("==========================");
		
		// 4. 다중 loop (반복문) 에서 한꺼번에 탈출 2) 변수의 조건을 false 로 만들어서 빠져나옴

		for (int i = 0 ; i < 5 ; i ++) {
			for (int j = 0 ; j < 5 ; j++) {
				if ( i == 2) {
					i = 100;
					break ;
				}
				System.out.println( i + " , " + j);
			}
		}
			
		
		
		
		
		
	}
}
