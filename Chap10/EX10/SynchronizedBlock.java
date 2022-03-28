package Chap15.EX10;

//동기화 : 여러 쓰레드가 공유된 필드에 접근할때 하나의 쓰레드 작업시 다른 쓰레드가 접근하지 못하도록 설정 
  // 메소드 동기화, 블락동기화 

// 블락 동기화 : 주의 : 메소드 내부의 일부분만 동기화 한다. 
//    - 구문 형식 : synchronized (임의의 객체) { } 
//                              this : 자신의 객체, new 밈의의 객체 

class A{}
class B{}
class C{}

class  MyData{   //쓰레드가 공유하는 객체 필드 생성
	int data = 3; 
	
	public void plusData () {  
		
		synchronized (new Object()) {	//블락 동기화 : 메소드의 일부분만 동기화 , this : 자신의 객체 
								//this : 자신의 객체를 뜻하고, 동기화 블록에 접근 하는 키이다. 
								//모든 쓰레드는 Key를 가져야 동기화 블럭을 접근 할 수 있다. 
								//Key는 임의의 객체를 키로 사용 할 수 있다. 
			int mydata = data; 
			try {Thread.sleep(2000);} catch (InterruptedException e) {}	
			data = mydata + 1 ; 
		}
	}
}
class PlusThread extends Thread{   //1씩 증가하면서 두개의 쓰레드 
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


public class SynchronizedBlock {

	public static void main(String[] args) {
		//공유 객체 생성 
		MyData myData = new MyData(); 
		
		//1. PlusThread 1
		Thread plusThread1 = new PlusThread(myData); 
		plusThread1.setName("plusThread1");
		plusThread1.start(); 
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//1. PlusThread 2
		Thread plusThread2 = new PlusThread(myData); 
		plusThread2.setName("plusThread2");
		plusThread2.start(); 
	}

}
