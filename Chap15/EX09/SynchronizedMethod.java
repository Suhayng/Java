package Chap15.EX09;

// 메소드 동기화 : 메소드 전체를 동기화 하는 것
	// key 값이 this 할당됨.

class MyData {	// 쓰레드가 공유하는 객체 필드 생성
	int data = 3 ;	
	
	public synchronized void plusData () {	// 메소드 동기화 : 메소드의 전체를 동기화	
			// 동기화 처리 메소드 : 하나의 쓰레드가 작업이 완료되면 다음 쓰레드가 작없 할 수 있다.   
		int myData = data ;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = myData + 1;
	}
}

class PlusThread extends Thread {		// 1씩 증가하면서 두개의 쓰레드 생성
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과 : " + myData.data);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		// 공유 객체 생성
		MyData myData = new MyData();
		
		// 1. PlusThread (1)
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}

		// 2. PlusThread (2)
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}
}
