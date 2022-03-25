package Chap15.EX05;

/*
  Thread 4�� ���� : 1. Thread�� ���, 2. Runnable ����, 3-4. �͸� ���� Ŭ������ �����ؼ� ����
 
  �� ���� String �迭�� ���� �� �Ʒ��� ���� ����ϼ���.
 
	1		2		3		4
	�̸�		ȫ�浿	�̼��� 	�Ż��Ӵ�
	����		40		50		60
	����		100		90		80
	����		70		60		100	
	����		50		70		80
	
 */

class NameThread extends Thread {
	
	@Override
	public void run() {
		String[] nArray = {"�̸�", "����", "����", "����", "����"};
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
		String[] hArray = {"ȫ�浿", "40", "100", "70", "50"};
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
				String[] leeArray = {"�̼���", "50", "90", "60", "70"};
				
				for(int i = 0 ; i < leeArray.length; i++) {
					System.out.print(leeArray[i] + " ");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}};});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				String[] sinArray = {"�Ż��Ӵ�", "60", "80", "100", "70"};
			
				
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
