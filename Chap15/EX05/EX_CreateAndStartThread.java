package Chap15.EX05;

/*
  Thread 4개 생성 : 1. Thread를 상속, 2. Runnable 구현, 3-4. 익명 내부 클래스를 생성해서 구현
 
  각 값을 String 배열에 저장 후 아래와 같이 출력하세요.
 
	1		2		3		4
	이름		홍길동	이순신 	신사임당
	나이		40		50		60
	국어		100		90		80
	영어		70		60		100	
	수학		50		70		80
	
 */

class NameThread extends Thread {
	
	@Override
	public void run() {
		String[] nArray = {"이름", "나이", "국어", "영어", "수학"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	};
}

class HongThread implements Runnable {
	@Override
	public void run() {
		String[] hArray = {"홍길동", "40", "100", "70", "50"};
		for (int i = 0; i < hArray.length; i++) {
			System.out.print(hArray[i] + " ");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}





public class EX_CreateAndStartThread {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				String[] leeArray = {"이순신", "50", "90", "60", "70"};
				
				for(int i = 0 ; i < leeArray.length; i++) {
					System.out.print(leeArray[i] + " ");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}};});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				String[] sinArray = {"신사임당", "60", "80", "100", "70"};
			
				
				for(int i = 0 ; i < sinArray.length; i++) {
					System.out.print(sinArray[i] + " ");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}};});
		
	
		Thread name = new NameThread();
		name.start();
		
		Runnable hong = new HongThread();
		Thread thread = new Thread(hong);
		thread.start();
	
		
		thread1.start();
		thread2.start();
				
		
		
	}
}
