package Chap15.EX03;

// 2 번째 스레드 
class SMIFileThread extends Thread {	// 자막 파일 처리하는 스레드

	@Override
	public void run() {
		// 1) 자막 번호 출력
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		try {Thread.sleep(10);} catch (InterruptedException e1) {}	// 0.01초 딜레이
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - 자막 번호 " + strArray[i] );
			try {Thread.sleep(200);} catch (InterruptedException e) {}	// 0.2초 딜레이
		}
	}
}

// 3 번째 스레드 
class VideoFileThread extends Thread { 	// 비디오 파일을 처리하는 스레드
	
	@Override
	public void run() {
		// 2) 비디오 프레임 출력
		int[] intArray = {1,2,3,4,5};
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}	// 0.2초 딜레이
		}
	}
}


public class CreatAndThread_2 {
	
// 1. main 스레드	
	public static void main(String[] args) {
		// SMIFileThread 객체 시작
		Thread smi = new SMIFileThread();
		smi.start();
		
		// VideoFileThread 객체 시작
		Thread video = new VideoFileThread();
		video.start(); 
		
		
	}
}
