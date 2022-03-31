package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
  
  	ArrayList VS LinkedList
  	- ArrayList : ���� ���ؼ� index ���� ������ �ִ�. 
  					����	: �˻� �ӵ��� ������.
  	 				���� : �߰����� ���� �߰�/���� �� ���ϰ� ������ ���� �ɸ���.
  	- LinkedList : �� ���� ���� �յ��� ������� ������ �ִ�. �˻��ÿ� index ��ȣ�� �Ҵ� �ȴ�. 
  					���� : �߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� �ʴ´�.
  					����	: �˻��� ArrayList�� ���� ������.
  	 			   
 */


public class ArrayList_VS_LinkedList {
	public static void main(String[] args) {
		
		// 1. ������ �߰� �ð� ��
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime = 0, endTime =0;
		
		// 1-1. Array List ���� ������ �߰� �ð�
		startTime = System.nanoTime();		// System.nanoTime() : 
		for (int i = 0; i < 100000 ; i++) {
			aList.add(0,i);					// 0 ��° �濡 ����ؼ� 10����° ����, ��� �ڷ� �и��鼭 ���� �߰�
		}
		endTime = System.nanoTime();		
		System.out.println("ArrayList ���� ������ �߰� �ð� " + (endTime - startTime) + "ns");
				// 411396200ns

		// 1-2. LinkedList ���� ������ �߰� �ð� : ArrayList ���� ������.
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList ���� ������ �߰� �ð� " + (endTime - startTime) + "ns");
				// 5675000ns	: 250�� ���� ������.
		
		System.out.println("=======================================");
		
		// 2. �˻��� �� : Array List�� LinkedList ���� ������.
		// 2-1 ArrayList �˻� �ð� : 1265200ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList ���� ������ �߰� �ð� " + (endTime - startTime) + "ns");
				
		// 2-2 LinkedList �˻� �ð� : 4433388700ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList ���� ������ �߰� �ð� " + (endTime - startTime) + "ns");
		
		System.out.println("=======================================");
		
		// 3. ������ ������ ���� �ð� �� : LinkedList �� �ξ� ������.
		// 3-1. ArrayList : 357684500ns
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000; i++) {
			aList.remove(0);	// index 0 ��° �ڸ��� ����, ���� ��ܿ´�.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList ���� ������ ���� �ð� " + (endTime - startTime) + "ns");
		
		
		// 3-2. LinkedList : 3929200ns
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000; i++) {
			linkedlist.remove(0);	// index 0 ��° �ڸ��� ����, ���� ��ܿ´�.
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList ���� ������ ���� �ð� " + (endTime - startTime) + "ns");
		
		
		
	
	}
}
