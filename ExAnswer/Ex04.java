package ExAnswer;
public class Ex04 {
	public static void main(String[] args) {
		
		int lineCount; 	// 다음 라인으로 개행 변수
		int stopCount; 	// 별을 출력하는 변수
		
		for (lineCount = 0 ; lineCount < 4 ; lineCount++) {
			for (stopCount = 0 ; stopCount <= lineCount ; stopCount++ ) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
