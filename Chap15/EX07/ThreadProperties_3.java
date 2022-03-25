package Chap15.EX07;

/*
  * �Ϲ� ������ : setDaemon(false) default off : ������ �����尡 ����Ǵ��� �ڽ��� ���� ��� ��ġ�� �����Ѵ�. 
  * ���� ������ : setDaemon(true) , �����带 start �� �� ����, ���� ������ �Ұ�
	 - ������ �����尡 ����Ǵ� ������ ���� 
	 - �Ϲ������� �ٸ� �������� �۾��� ���� ���� ������
	 - ���� ������ ������ �Ϲ� ������ ����� �� ������ �ܿ��� �Ϲ� ������� ����
	 - ������ �÷��� ( �޸��� ������ �ʴ� ��ü�� ������ �÷��Ͱ� �ڵ����� ��ü�� ���� ) 
			- ���μ����� ���� ������ �ڵ� ����, ȭ�� �ڵ� ����
	 - ���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����ϸ� �۾��� �����ϰ� �ٽ� ��� ���¿� ����.
*/

class MyThread extends Thread {	// thread �� �۵� ��ų Ŭ����
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "���󾲷���": "�Ϲݾ�����"));
		for (int i = 0; i < 6 ; i++) {
			System.out.println(getName() + " : " + i + " ��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3 {
	public static void main(String[] args) {
		/*
		// 1. �Ϲ� Thread
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); 	// ����Ʈ (default)
		
		thread1.setName("thread1");
		thread1.start();
		*/
		
		// 2. Daemon Thread : ������ Thread �� ���� �Ǵ� ������ ����.
		Thread thread2 = new MyThread();
		thread2.setDaemon(true); 	// ����Ʈ (default)
		
		thread2.setName("thread1");
		thread2.start();
		
		// 2. 3.5�� �Ŀ� main Thread �� ����
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread ����");
	}
}

