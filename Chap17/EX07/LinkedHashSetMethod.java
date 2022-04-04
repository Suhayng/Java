package Chap17.EX07;


import java.util.Arrays;

/*
 	LinkedHashSet : ���� ������ �� ���� ���� ��ġ ������ �� ���� ���� ��ġ ������ ������.
 		- HaslinkedSet �� ������ : ��� �޼ҵ尡 �����ϴ�. �ߺ��� ���� �������� �ʴ´�. �� ��ȣ(index) ���� ������ �ʴ´�.
 							�⺻ For ������ ����� �� ����. iterator, Enhanced for ���� ���
 							
		- HaslinkedSet �� ������ : HaslinkedSet �� �Է´�� ��� ���� �ʴ´�. LinkedHashSet �� �Է´�� ��µȴ�. 
*/


/*
 	Set<E> : �� ��ȣ(index)�� ����. �ߺ��� ���� �ֿ� �� ����.
 	  - HaslinkedSet 	  : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
 	  - LinkedHashSet :	�ߺ��� ���� ���� �� ����. ��½� ������� ��� �ȴ�.  
 	  - TreeSet       : ����� �� ������ �Ǿ ����. ascending (���� ���� ���� �Ǿ� �����)
 	  						����) descending (�������� ����)
 */

// ����� ���� Ȯ�� : Ctrl + Shift + L  
// ã��, �ٲٱ� : Ctrl + F

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
	public static void main(String[] args) {

		Set<String> linkedSet1 = new LinkedHashSet();		// Set �� Interface �̹Ƿ� Ÿ�����θ� ����
			// Set�� ���׸� Ÿ�� ������ wrapper Ŭ������ ����� ���, equals(), hashCode() �޼ҵ尡 ������, toString() ������
		
		// 1. add(E element) : Set �� ���� �߰�
		linkedSet1.add("��"); linkedSet1.add("��"); linkedSet1.add("��");	// "��" �ߺ� ���� �ȵ�
		System.out.println(linkedSet1);
		System.out.println(linkedSet1.toString()); 		// toString �޼ҵ尡 ������ �Ǿ� �ֵ�.
	
		System.out.println("=================");
		
		// 2. addAll (�ٸ� set ��ü) : �ڽ��� Set���� �ٸ� Set�� ����� ���� �߰� : �ߺ��� ���� ���ŵ�
		Set<String> linkedSet2 = new LinkedHashSet();
		linkedSet2.add("��"); linkedSet2.add("��");
		
		linkedSet2.addAll(linkedSet1);	
		System.out.println(linkedSet2);	// [��, ��, ��] 	// �Է°� ����� �����ϴ�.
		
		// 3. remove (Object o) : ������ ����, ( List �� ��� ���ȣ�� ���� )
		linkedSet1.remove("��");
		System.out.println(linkedSet1);	// [��, ��]
		
		// 4. clear() : ��� ����
		linkedSet1.clear();
		System.out.println(linkedSet2);
		
		// 5. isEmpty() : ��� ������ true, ��� ���� ������ false
		System.out.println(linkedSet2.isEmpty());
		
		// 6. contains(Object o) : ���� Set�� �����ϸ� true, �������� ������ false
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("��"); linkedSet3.add("��"); linkedSet3.add("��");
		System.out.println(linkedSet3);		// �Է°� ����� �����ϴ�.
		System.out.println(linkedSet3.contains("��")); 	// true
		System.out.println(linkedSet3.contains("��"));	// false
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(linkedSet3.size());
		
		System.out.println("==========iterator()�� ����� ���==========");
		
		
		// 8. iterator() : Set �� index �� ������ �ʴ´�. for ���� �� ��ȣ�� ���� ���(��� �Ұ�), enhanced for ���� ��� ����
					// ��ȸ��, Set �� ������ ��ȸ �ϸ鼭 ���.
					// hasNext() : Set �� ���� ���� �ϸ� true, ���� ���� ������ false
					// next() : ���� ����ϰ� ���� ������ �̵�
		
		Iterator<String> iterator = linkedSet3.iterator();
			// Ŭ����<E> ���� ��ü = Set��ü.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		System.out.println();
		
		System.out.println("===========Enhanced for ���� ����ؼ� ���=============");
		
		for (String k : linkedSet3) {
			System.out.print(k + "  ");
		}
		System.out.println();
		
		// 9. toArray() : Set�� ������ �迭�� ������. Object Ÿ������ ����, �ٿ� ĳ������ �ʿ���
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray)); 		//  
		for (int i = 0; i < objArray.length ; i++) {
			System.out.print(objArray[i] + "  ");
		}
		System.out.println();
		System.out.println("====================");
		for (Object k : objArray) {							// �ٿ� ĳ������ �ʿ��ϴ�.
			System.out.print(k + "  ");
		}
		System.out.println();
		
		// 10. toArray(T[] t) : �ٷ� �ٿ� ĳ������ �� ��
		String[] strArray1 = linkedSet3.toArray(new String[0]);	// 0 : ���� ũ�⸦ �����մϴ�.
															// ���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		
		// 11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ��� Null�� ��� �� �� �ִ�.
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		//
		Set<Integer> intSet1 = new LinkedHashSet();
		
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(10);
		
		// iterator ���, Enhanced for ���� ����ؼ� ���
		
		System.out.println("==========iterator()�� ����� ���==========");
		
		Iterator <Integer> iterator1 = intSet1.iterator();
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+ " ");
		}
		System.out.println();
		System.out.println("===========Enhanced for ���� ����ؼ� ���=============");
		
		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}
		System.out.println();
	
	
	
	
	}
	
}
