package Chap15.EX06;

public class ThreadProperties_1 {
	public static void main(String[] args) {
		// 1. 객체 가져오기 (currentThread())	// 쓰레드 수(activeCount())
			// static 
		Thread curThread = Thread.currentThread();	// main Thread
		// 클래스(타입)  참조 변수 = 클래스명.메소드명
		System.out.println("현재 thread 의 이름 :" + curThread.getName());
		System.out.println("동작하는 thread 수 : " + Thread.activeCount());
	
		System.out.println("=======================");
		// 2. thread 의 이름 출력 ( 자동 출력 ) - JVM Thread이름을 자동 할당 - Thread-0,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); 	// thread 이름 출력
			thread.start();
		}
		
		System.out.println("=======================");
		
		// 3. thread 이름 직접 지정 : 객체명.setName
		for(int i = 0; i < 10 ; i++) {
			Thread thread = new Thread();
			thread.setName(i + "  번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("=======================");
		
		// 4. thread 의 이름 출력 ( 자동 출력 ) - JVM Thread이름을 자동 할당 - Thread-0,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); 	// thread 이름 출력
			thread.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 5. thread 수 출력 하기
		System.out.println("동작하는 thread 수 : " + Thread.activeCount());
		
		
		
	
	
	
	
	
	}
}
