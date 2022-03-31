package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
  
  	ArrayList VS LinkedList
  	- ArrayList : 값에 대해서 index 값을 가지고 있다. 
  					장점	: 검색 속도가 빠르다.
  	 				단점 : 중간에서 값을 추가/삭제 시 부하가 굉장히 많이 걸린다.
  	- LinkedList : 각 각의 값은 앞뒤의 연결고리만 가지고 있다. 검색시에 index 번호가 할당 된다. 
  					장점 : 중간에 값을 추가/삭제 시 부하가 걸리지 않는다.
  					단점	: 검색이 ArrayList에 비해 느리다.
  	 			   
 */


public class ArrayList_VS_LinkedList {
	public static void main(String[] args) {
		
		// 1. 데이터 추가 시간 비교
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime = 0, endTime =0;
		
		// 1-1. Array List 에서 데이터 추가 시간
		startTime = System.nanoTime();		// System.nanoTime() : 
		for (int i = 0; i < 100000 ; i++) {
			aList.add(0,i);					// 0 번째 방에 계속해서 10만번째 까지, 계속 뒤로 밀리면서 값이 추가
		}
		endTime = System.nanoTime();		
		System.out.println("ArrayList 에서 데이터 추가 시간 " + (endTime - startTime) + "ns");
				// 411396200ns

		// 1-2. LinkedList 에서 데이터 추가 시간 : ArrayList 보다 빠르다.
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 에서 데이터 추가 시간 " + (endTime - startTime) + "ns");
				// 5675000ns	: 250배 정도 빠르다.
		
		System.out.println("=======================================");
		
		// 2. 검색시 비교 : Array List가 LinkedList 보다 빠르다.
		// 2-1 ArrayList 검색 시간 : 1265200ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 에서 데이터 추가 시간 " + (endTime - startTime) + "ns");
				
		// 2-2 LinkedList 검색 시간 : 4433388700ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 에서 데이터 추가 시간 " + (endTime - startTime) + "ns");
		
		System.out.println("=======================================");
		
		// 3. 데이터 삭제시 실행 시간 비교 : LinkedList 가 훨씬 빠르다.
		// 3-1. ArrayList : 357684500ns
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000; i++) {
			aList.remove(0);	// index 0 번째 자리를 제거, 값이 당겨온다.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 에서 데이터 삭제 시간 " + (endTime - startTime) + "ns");
		
		
		// 3-2. LinkedList : 3929200ns
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000; i++) {
			linkedlist.remove(0);	// index 0 번째 자리를 제거, 값이 당겨온다.
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 에서 데이터 삭제 시간 " + (endTime - startTime) + "ns");
		
		
		
	
	}
}
