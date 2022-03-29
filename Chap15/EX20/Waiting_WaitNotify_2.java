package Chap15.EX20;

class DataBox{
	boolean isEmpty = true;	// 기본값 세팅
	int data ; //공유 필드 
	
	synchronized void inputData (int data) {	//동기화 메소드 
		if (isEmpty) {	// false 일 때 wait(); 동기화 블럭이나 동기화 메소드에서 WAITING 상태로 전환 
						// data 필드의 값이 비어 있지 않을 때 잠시 대기 t2 쓰레드가 처리하도록 
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = false;	// data 필드의 값을 넣고 t2 가 값을 읽을 수 있도록 false로 기본 셋팅 
		this.data = data; 
		System.out.println("입력 데이터" + data);   //data : 매개변수 값으로 들어온 데이터 
		notify();
	}
	synchronized void outputData () {			//동기화 메소드 
		if(isEmpty) {
			try {wait();} catch (InterruptedException e) {}	// Waiting 상태로 진입
		}
		isEmpty = true;
		System.out.println("출력 데이터" + data);   // data : 메모리의 data , this 생략되어 있음. 
		notify();			// inputData() 메소드의 wait()된 쓰레드를 깨워준다.
	}
}

public class Waiting_WaitNotify_2 {
	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		//첫번째 쓰레드 : 공유 객체에 값을 넣는 쓰레드 
		Thread t1 = new Thread() {          //익명 내부 클래스 
			@Override
			public void run() {
				for (int i = 1 ; i < 9 ; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		//두번째 쓰레드 : 공유 객체로 부터 값을 읽어 오는 메소드 
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i=1 ; i < 9 ; i++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
