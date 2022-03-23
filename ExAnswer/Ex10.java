package ExAnswer;
public class Ex10 {
	public static void main(String[] args) {

		int a, b; 	// a <== 의 자리를 표현하는 변수,  b는 1의 자리를 포현하는 변수
		
		for ( int i = 1; i < 100; i++) {
			a = i / 10;		// a = 10의 자리를 의미, i를 10으로 나누어서 몫만 가져온다.
			b = i % 10;		// n = 1의 자리 의미, i를 10으로 나누어서 나머지 값만 가진다.
					 
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " : 박수 짝짝");
			} else if ((a==3 || a==6 || a==9) && ( b!=3 || b!=6 || b!=9)) {
				System.out.println(i + " : 박수 짝");
			} else if((a!=3 || a!=6 || a!=9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " 박수 짝");
			}
		}
	}
}
