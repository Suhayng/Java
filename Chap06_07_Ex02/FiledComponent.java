package Chap06_07_Ex02;

class Abc {
	int m = 3;						// 필드 ( Heap 에 저장), 객체화 시켰을 때 사용 가능
	int n = 4;
	
	void work1() {					// 메소드 (인풋값이 없는 메소드)
		int k = 5;					// 지역 변수 : (Stack 영역에 저장), 메소드 종료시 없어진다.
		System.out.println(k);
		work2(3);					// 다른 메소드 호출 
	}
	
	void work2(int i) {				
	
		int j = 4;					// 지역 변수 (Stack 공간에 변수와 값이 저장
		System.out.println(i + j);
		
		int l;						// 지역 변수이므로 강제 초기화가 되지 않는다. ( Stack)
		//l = 0;					// 지역 변수는 초기값을 반드시 할당!
		//System.out.println(l);	
	
	}	
}

public class FiledComponent {
	public static void main(String[] args) {
	
		// 클래스를 활용해서 객체(abc) 생성
		Abc abc = new Abc();		// abc 객체 생성 
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		// 메소드 호출
		abc.work1();
	
	
	
	
	
	
	
	}
}
