package Chap17.EX11;

/*
 	Map<K,V> : Key�� �ߺ� ���� �ʴ´�. <== Set���� �����Ѵ�.
 	
 	HashMap vs LinkedHashMap
 		HashMap<K,V> : �Է°� ����� �ٸ� �� �ִ�. ����� �����ϰ� ���
 		LinkedHashMap<K,V> :  
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {

		Map<Integer, String> lhMap1 = new LinkedHashMap <> ();
		
		// 1. put(K key, V value) : ���� ���� �� 
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
	//	lhMap1.put(1, "������"); 	//Ű�� �ߺ��ؼ� ���� �� �� ����. ���� ���� ��� ������ ���� ���� �ȴ�.
		System.out.println(lhMap1);

		//2. putAll(�ٸ��� ��ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> lhMap2 = new LinkedHashMap();		
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2);
	
		//3. replace(K key, V value) ; key�� ����� ���� value�� ����
		lhMap2.replace(1, "������");
		lhMap2.replace(4, "����");	// key 4�� �������� �ʴ´�. �۵��� �ȵ� (���ܵ� �߻� �ȵ�)
		System.out.println(lhMap2);
		
		//4. replace(K key, V oldvalue, V newvalue) : oldValue�� newValue�� ����
		lhMap2.replace(1, "������", "������");
		lhMap2.replace(2, "�ٴٴ�", "����");	//���� �ȵ� <== key�� value�� ��Ȯ�� ��ġ�ؾ� ������
		System.out.println(lhMap2);

		//5. get(Object key) : Map�� ���� ������ ��, Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println(lhMap2.get(1));	// ���� 1) index�� �ƴ϶� key
		System.out.println(lhMap2.get(2));
		System.out.println(lhMap2.get(3));
		
		//6.containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, True or False
		System.out.println(lhMap2.containsKey(1)); //true
		System.out.println(lhMap2.containsKey(5)); //false
		
		//7. containValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ�� True or False
		System.out.println(lhMap2.containsValue("������")); //true
		System.out.println(lhMap2.containsValue("������")); //false
		
		//8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = lhMap2.keySet();	//lhMap�� ����� ketSet�� ����
		System.out.println(keySet);
		
		//9. Set<Map, Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ����
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); �� ����
		System.out.println(lhMap2.size());//3
		
		//11. remove(Object Key)	// Ű�� �־ Key�� value�� ����
		lhMap2.remove(1);	//1�� ����
		lhMap2.remove(4);	//�������� ����
		System.out.println(lhMap2);
		
		//12. remove(Object key, Object value) : key��  value�� ��Ȯ�ϰ� ��ġ �� �� ����
		lhMap2.remove(2, "���ٶ�");	//����
		lhMap2.remove(3, "�ٴٴ�");	//���� ����
		System.out.println(lhMap2);

		//13. clear() : ��� ����
		lhMap2.clear();
		System.out.println(lhMap2);
	}
}
