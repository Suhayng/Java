package Chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// java.lang 패키지의 클래스들은 import가 필요 하지 않다.

/*
  	컬렉션 : 동일한 자료형을 저장한다. 방의 크기가 동적으로 변화.
  	배열 : 동일한 자료형을 저장한다. 방의 크기가 고정되어 있다. 배열 생성시 방의 크기를 지정,
  		  방의 크기는 수정 불가.
  	
 	List<E> : 인터페이스 , 제네릭 인터페이스 , 다양한 데이터 타입을 사용 가능하다.
 		- 공통적 특징 : 인덱스(index-방번호)를 가지고 있다(검색이 빠르다). 방의 크기는 동적으로 변화한다.
 		
 		- ArrayList<E> : 싱글 쓰레드 환경에서 사용. 검색은 빠르나 값을 추가하거나 삭제시 느리다.
 		- Vector<E> : 멀티 쓰레드 환경에서 사용. 모든 메소드가 동기화 되어 있다.
 		- LinkedList<E> : 검색은 느리나 값을 추가나 삭제할 때 빠르다.
*/
public class ArrayList_1 {
	public static void main(String[] args) {
		// 1. 배열
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		System.out.println(array.length); 	//7
		array[2] = null;
		array[5] = null;
		System.out.println(array.length); 	//7
		
			// 1) Arrays.toString(배열 변수)
		System.out.println(Arrays.toString(array));	// Arrays.toString(배열 변수)  
		System.out.println(array); // 주소
		
			// 2) for 문 사용해서 출력
		for (int i = 0; i < array.length; i++) {
			if (i == array.length-1) {			// 마지막 방 번호에서는 , 를 출력하지 마라.
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");				
			}
		}
		System.out.println();
		System.out.println("==============================");
		
			// 3) Enhanced For 문을 사용해서 출력
		for (String k : array) {
			System.out.print(k + ", ");
		}
		System.out.println();
		System.out.println("==============================");		
		
		
		// 2. List : 인터페이스, 객체 생성을 할 수 없음. 타입은 지정 가능
		List<String> aList = new ArrayList<String>(); 
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		// List 에서 방의 개수 출력 : aList.size();	<<== List 	,   length() : 배열
		System.out.println(aList.size());	// 방의 크기 : 0
		
		// List에 값 할당하기 : aList.add("값 할당"); 제일 마지막에 값을 추가함.
		aList.add("가"); aList.add("나"); aList.add("다"); aList.add("라"); aList.add("마");
		aList.add("바"); aList.add("사");
		
		// List에 저장된 데이터의 개수 구하기 : aList.size();
		System.out.println(aList.size()); 	// 7
		
		// List에 저장된 값을 제거 : aList.remove("삭제할 내용")
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size()); 	// 5
		
		// List는 index 를 가지고 있다. (1. For 문 출력)
		for(int i = 0; i < aList.size(); i++) { 	// aList.size() : 방의 개수 출력
			System.out.print(aList.get(i) + ",");
		}
		
		
		
		System.out.println("=======================");
		// (2. Enhanced for 문 출력) 
		
		
		// (3. 객체의 toString()을 호출해서 출력)
		System.out.println(aList);			// List는 toString 메소드가 재정의 되어 있음
		System.out.println(aList.toString());
		
		
		
	}
}
