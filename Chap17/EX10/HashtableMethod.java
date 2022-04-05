package Chap17.EX10;

/*
 	Map<K,V> : K <= Key, V <= Value 형식으로 데이터를 저장 
 		- Key 는 중복 될 수 없다. <== Set으로 관리		index가 아니다. index는 0부터 할당, 
 		- Value는 중복된 값을 넣을 수 있다.
 		
 		- Hashtable : 출력이 랜덤하게 출력. 단일 쓰레드 환경에 적합, 모든 메소드가 동기화 되어 있지 않다.
 		- HashTable : 모든 메소드가 동기화 되어 있다. 멀티쓰레드 환경에 적합하다.
 					  모든 메소드는 Hashtable과 동일
 */


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableMethod {
	public static void main(String[] args) {

		Map<Integer, String> hTable1 = new Hashtable <> ();
		
		// 1. put(K key, V value) : 값을 넣을 때 
		hTable1.put(2, "나다라");
		hTable1.put(1, "가나다");
		hTable1.put(3, "다라마");
	//	hTable1.put(1, "가가가"); 	//키는 중복해서 저장 될 수 없다. 값을 넣을 경우 기존의 값이 수정 된다.
		System.out.println(hTable1);

		//2. putAll(다른맵 객체) : 다른 맵을 복사해서 사용.
		Map<Integer, String> hTable2 = new Hashtable();		
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
	
		//3. replace(K key, V value) ; key에 저장된 값을 value로 수정
		hTable2.replace(1, "가가가");
		hTable2.replace(4, "라라라");	// key 4는 존재하지 않는다. 작동이 안됨 (예외도 발생 안됨)
		System.out.println(hTable2);
		
		//4. replace(K key, V oldvalue, V newvalue) : oldValue를 newValue로 수정
		hTable2.replace(1, "가가가", "나나나");
		hTable2.replace(2, "다다다", "라라라");	//동작 안됨 <== key와 value가 정확히 일치해야 수정됨
		System.out.println(hTable2);

		//5. get(Object key) : Map의 값을 가져올 때, Key를 넣어줘야 Key에 할당된 Value를 출력
		System.out.println(hTable2.get(1));	// 주의 1) index가 아니라 key
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		//6.containsKey(Object key) : 맵에 해당 키가 존재하는지 확인, True or False
		System.out.println(hTable2.containsKey(1)); //true
		System.out.println(hTable2.containsKey(5)); //false
		
		//7. containValue(Object value) : 맵에 해당 값이 존재하는지 확인 True or False
		System.out.println(hTable2.containsValue("나나나")); //true
		System.out.println(hTable2.containsValue("하하하")); //false
		
		//8. Set<K> keySet() : 키만 추출
		Set<Integer> keySet = hTable2.keySet();	//hTable의 저장된 ketSet을 추출
		System.out.println(keySet);
		
		//9. Set<Map, Entry<K,V>> entrySet() : 키와 값의 셋(Set)을 추출
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); 총 개수
		System.out.println(hTable2.size());//3
		
		//11. remove(Object Key)	// 키를 넣어서 Key와 value를 삭제
		hTable2.remove(1);	//1번 삭제
		hTable2.remove(4);	//동작하지 않음
		System.out.println(hTable2);
		
		//12. remove(Object key, Object value) : key와  value가 정확하게 일치 할 때 삭제
		hTable2.remove(2, "나다라");	//삭제
		hTable2.remove(3, "다다다");	//동작 안함
		System.out.println(hTable2);

		//13. clear() : 모두 삭제
		hTable2.clear();
		System.out.println(hTable2);
	}
}
