package Chap17.EX10;

/*
 	Map<K,V> : K <= Key, V <= Value �������� �����͸� ���� 
 		- Key �� �ߺ� �� �� ����. <== Set���� ����		index�� �ƴϴ�. index�� 0���� �Ҵ�, 
 		- Value�� �ߺ��� ���� ���� �� �ִ�.
 		
 		- Hashtable : ����� �����ϰ� ���. ���� ������ ȯ�濡 ����, ��� �޼ҵ尡 ����ȭ �Ǿ� ���� �ʴ�.
 		- HashTable : ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 �����ϴ�.
 					  ��� �޼ҵ�� Hashtable�� ����
 */


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableMethod {
	public static void main(String[] args) {

		Map<Integer, String> hTable1 = new Hashtable <> ();
		
		// 1. put(K key, V value) : ���� ���� �� 
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
	//	hTable1.put(1, "������"); 	//Ű�� �ߺ��ؼ� ���� �� �� ����. ���� ���� ��� ������ ���� ���� �ȴ�.
		System.out.println(hTable1);

		//2. putAll(�ٸ��� ��ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hTable2 = new Hashtable();		
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
	
		//3. replace(K key, V value) ; key�� ����� ���� value�� ����
		hTable2.replace(1, "������");
		hTable2.replace(4, "����");	// key 4�� �������� �ʴ´�. �۵��� �ȵ� (���ܵ� �߻� �ȵ�)
		System.out.println(hTable2);
		
		//4. replace(K key, V oldvalue, V newvalue) : oldValue�� newValue�� ����
		hTable2.replace(1, "������", "������");
		hTable2.replace(2, "�ٴٴ�", "����");	//���� �ȵ� <== key�� value�� ��Ȯ�� ��ġ�ؾ� ������
		System.out.println(hTable2);

		//5. get(Object key) : Map�� ���� ������ ��, Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println(hTable2.get(1));	// ���� 1) index�� �ƴ϶� key
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		//6.containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, True or False
		System.out.println(hTable2.containsKey(1)); //true
		System.out.println(hTable2.containsKey(5)); //false
		
		//7. containValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ�� True or False
		System.out.println(hTable2.containsValue("������")); //true
		System.out.println(hTable2.containsValue("������")); //false
		
		//8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = hTable2.keySet();	//hTable�� ����� ketSet�� ����
		System.out.println(keySet);
		
		//9. Set<Map, Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ����
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); �� ����
		System.out.println(hTable2.size());//3
		
		//11. remove(Object Key)	// Ű�� �־ Key�� value�� ����
		hTable2.remove(1);	//1�� ����
		hTable2.remove(4);	//�������� ����
		System.out.println(hTable2);
		
		//12. remove(Object key, Object value) : key��  value�� ��Ȯ�ϰ� ��ġ �� �� ����
		hTable2.remove(2, "���ٶ�");	//����
		hTable2.remove(3, "�ٴٴ�");	//���� ����
		System.out.println(hTable2);

		//13. clear() : ��� ����
		hTable2.clear();
		System.out.println(hTable2);
	}
}
