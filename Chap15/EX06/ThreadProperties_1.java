package Chap15.EX06;

public class ThreadProperties_1 {
	public static void main(String[] args) {
		// 1. ��ü �������� (currentThread())	// ������ ��(activeCount())
			// static 
		Thread curThread = Thread.currentThread();	// main Thread
		// Ŭ����(Ÿ��)  ���� ���� = Ŭ������.�޼ҵ��
		System.out.println("���� thread �� �̸� :" + curThread.getName());
		System.out.println("�����ϴ� thread �� : " + Thread.activeCount());
	
		System.out.println("=======================");
		// 2. thread �� �̸� ��� ( �ڵ� ��� ) - JVM Thread�̸��� �ڵ� �Ҵ� - Thread-0,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); 	// thread �̸� ���
			thread.start();
		}
		
		System.out.println("=======================");
		
		// 3. thread �̸� ���� ���� : ��ü��.setName
		for(int i = 0; i < 10 ; i++) {
			Thread thread = new Thread();
			thread.setName(i + "  ��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("=======================");
		
		// 4. thread �� �̸� ��� ( �ڵ� ��� ) - JVM Thread�̸��� �ڵ� �Ҵ� - Thread-0,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); 	// thread �̸� ���
			thread.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 5. thread �� ��� �ϱ�
		System.out.println("�����ϴ� thread �� : " + Thread.activeCount());
		
		
		
	
	
	
	
	
	}
}
