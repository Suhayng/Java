package Chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/*
  	TreeMap<K,V> : 저장시 Key를 기준으로 오름차순 정렬되어 저장됨
  				   출력시에 오름차순 정렬되어 출력
  				   Key에 일반 객체를 저장할 때 Comparable<E> compareTo()를 재정의, Comparator<E> compare()를 재정의	<== 객체 수정 및 재컴파일
  				   						Comparator<E> compare()를 재정의 <== 객체를 수정없이 사용
  
    Map<K,V> <== SortedMap<K,V> (정렬 메소드 정의) <== NavigableMap<K,V> (검색 메소드 정의) <= TreeMap<K,V>
    	TreeMap 을 사용할 때는 타입을 TreeMap 으로 지정해서 검색, 정렬의 메소드를 사용할 수 있다.
 */										

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		// TreeMap<K,V> 은 Map<K,V> 메소드를 모두 사용. 추가적으로 Sortedmap, NavigableMap 의 추가적인 메소드를 사용
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		for (int i = 20; i > 0; i -=2 ) {
			treeMap.put(i, i+ " 번째 데이터 ");
		}
		System.out.println(treeMap);	// Key, Value : Key를 기준으로 오름차순 정렬
		
		// 1. firstKey() : 제일 첫번째 값을 출력
		System.out.println(treeMap.firstKey()); //2
		
		// 2. firstEntry() : entry = Key + Value 쌍
		System.out.println(treeMap.firstEntry());
		
		// 3. lastKey() : 마지막 키
		System.out.println(treeMap.lastKey());
		
		// 4. lastEntry() : 마지막 키와값
		System.out.println(treeMap.lastEntry());
		
		// 5. lowerKey(K key) : 입력 받은 키의 낮은 키값 출력			시작일 때는 포함, 끝일 때는 미포함
		System.out.println(treeMap.lowerKey(10));	//10
		
		// 6. higherKey(K key) : 입력 받은 키의 높은 키값 출력
		System.out.println(treeMap.higherKey(10));
		
		// 7. pollFirstEntry() : 첫번째 키와 값을 끄집어 내어온다.
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		// 8. poolLastEntry() : 마지막번째 키와 값을 끄집어 내어온다.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		// 9. SortedMap<K,V> hashMap(K toKey) : 인풋 받은 키의 head 쪽으로 처리
		SortedMap<Integer, String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
		
		// 10. NavigableMap<K,B> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);	// key 8을 포함하면서 Head 쪽으로 출력	
	
		// 11. SortedMap<K,V> tailMap(K toKey)
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		// 12. NavigableMap<K,V> tailMap(K toKey, boolean)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(14, false);	//시작은 포함이 기본, 끝은 미포함이 기본
		System.out.println(nMap2);
		
		// 13. SortedMap<K,V> subMap (K formKey, k toKey) : 특점 범위의 값을 저장
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);		//시작은 포함이 기본, 끝은 미포함이 기본
		System.out.println(subMap);
	
		// 14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, booleaninclusive)
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		// 15. NavigableSet<K> descendingKeySet() : 현재 키 정렬을 반대로 출력
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
	
		// 16. NavigableMap<K,V> decendingMap() : 현재 정렬을 반대로 정렬
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());
	}
}
