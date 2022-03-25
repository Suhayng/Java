package Chap15.EX05;

// 객체 생성 없이 익명 객체를 사용해서 thread 생성 <== 제일 많이 사용한다.

public class CreateAndStartThread_4 {
	public static void main(String[] args) {
		// 1. 자막 번호 출력 - thread
		Thread thread1 = new Thread( new Runnable() {
			public void run() {
				// 1) 자막 번호 출력
				String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
				
				try {Thread.sleep(10);} catch (InterruptedException e1) {}	// 0.01초 딜레이
				
				for (int i = 0; i < strArray.length; i++) {
					System.out.println(" - 자막 번호 " + strArray[i] );
					try {Thread.sleep(200);} catch (InterruptedException e) {}	// 0.2초 딜레이
				}};});	
		
		
		// 2. 비디오 프레임 출력 - thread
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				int[] intArray = {1,2,3,4,5};
				for(int i = 0; i < intArray.length; i++) {
					System.out.print("(비디오 프레임)" + intArray[i]);
					try {Thread.sleep(200);} catch (InterruptedException e) {}	// 0.2초 딜레이
				}};});
	
		// 3. Thread 시작 
		thread1.start();
		thread2.start();
	
	}
}
