package Chap17.EX06;

import java.util.Arrays;

/*
 	Set<E> : 방 번호(index)가 없다. 중복된 값을 넣울 수 없다.
 	  - HashSet 	  : 중복된 값을 넣을 수 없다. 값을 꺼내면 순서대로 꺼내지지 않는다.
 	  - LinkedHashSet :	중복된 값을 넣을 수 없다. 출력시 순서대로 출력 된다.  
 	  - TreeSet       : 저장될 때 정렬이 되어서 저장. ascending (오름 차순 정렬 되어 저장됨)
 	  						참고) descending (내림차순 정렬)
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {

		Set<String> hSet1 = new HashSet();		// Set 은 Interface 이므로 타입으로만 저장
	
		// 1. add(E element) : Set 에 값을 추가
		hSet1.add("가"); hSet1.add("나"); hSet1.add("가");	// "가" 중복 저장 안됨
		System.out.println(hSet1);
		System.out.println(hSet1.toString()); 		// toString 메소드가 재정의 되어 있따.
	
		// 2. addAll (다른 set 객체) : 자신의 Set에서 다른 Set에 저장된 값을 추가
		Set<String> hSet2 = new HashSet();
		hSet2.add("나"); hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		// 3. remove (Object o) : 값으로 삭제, ( List 인 경우 방번호로 삭제 )
		hSet2.remove("나");
		System.out.println(hSet2);
		
		// 4. clear() : 모두 삭제
		hSet2.clear();
		System.out.println(hSet2);
		
		// 5. isEmpty() : 비어 있으면 true, 비어 있지 않으면 false
		System.out.println(hSet2.isEmpty());
		
		// 6. contains(Object o) : 값이 Set에 존재하면 true, 존재하지 않으면 false
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("가"); hSet3.add("나"); hSet3.add("다");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("나")); 	// true
		System.out.println(hSet3.contains("라"));	// false
		
		
		// 7. size() : Set에 포함된 값을 개수
		System.out.println(hSet3.size());
		
		System.out.println("==========iterator()를 사용한 출력==========");
		
		
		// 8. iterator() : Set 은 index 를 가지지 않는다. for 문은 방 번호로 값을 출력(사용 불가), enhanced for 문은 사용 가능
					// 순회자, Set 의 값들을 순회 하면서 출력.
					// hasNext() : Set 의 값이 존재 하면 true, 존재 하지 않으면 false
					// next() : 값을 출력하고 다음 값으로 이동
		
		Iterator<String> iterator = hSet3.iterator();
			// 클래스<E> 참조 객체 = Set객체.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		System.out.println();
		
		System.out.println("===========Enhanced for 문을 사용해서 출력=============");
		
		for (String k : hSet3) {
			System.out.print(k + "  ");
		}
		System.out.println();
		
		// 9. toArray() : Set의 값들을 배열로 보낸다. Object 타입으로 리턴, 다운 캐스팅이 필요함
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); 		//  
		for (int i = 0; i < objArray.length ; i++) {
			System.out.print(objArray[i] + "  ");
		}
		System.out.println();
		System.out.println("====================");
		for (Object k : objArray) {							// 다운 캐스팅이 필요하다.
			System.out.print(k + "  ");
		}
		System.out.println();
		
		// 10. toArray(T[] t) : 바로 다운 캐스팅을 한 후
		String[] strArray1 = hSet3.toArray(new String[0]);	// 0 : 방의 크기를 지정합니다.
															// 방의 크기가 실제 값보다 작을 경우 컴파일러가 방의 크기만큼 지정
		System.out.println(Arrays.toString(strArray1));
		
		
		// 11. 실제 Set의 값보다 방의 크기를 크게 했을 경우 Null이 들어 갈 수 있다.
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		//
		Set<Integer> intSet1 = new HashSet();
		
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(10);
		
		// iterator 출력, Enhanced for 문을 사용해서 출력
		
		System.out.println("==========iterator()를 사용한 출력==========");
		
		Iterator <Integer> iterator1 = intSet1.iterator();
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+ " ");
		}
		System.out.println();
		System.out.println("===========Enhanced for 문을 사용해서 출력=============");
		
		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}
		System.out.println();
	
	
	
	
	}
	
}
