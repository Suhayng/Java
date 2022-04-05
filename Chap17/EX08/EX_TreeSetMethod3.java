package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// ���� ���� Ȯ��!



/*
	�̸��� ���̸� �Է½� �̸��� ���� �������� ����ϵ��� �����ϴ�. TreeSet�� namer Į����
 	1. comparable<E> �� compartTo() �޼ҵ� ������
 		 : ������ ��ü ������ �ʿ�
 	2. comparator<E> �� compare() ����
 		 : ������ ��ü�� ���� ���� ����
*/

class Abc {
	String name;	// ���� �÷�. �������� ���� : �� ~ ��, 
					// ȫ�浿, �̼���, ������ ==> set: ������, �̼���, ȫ�浿 ������
	int age;		// ����
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age;
	}
}

class Abc_T implements Comparable<Abc_T> {
	String name;
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	@Override
	public int compareTo(Abc_T o) {
		if(this.name != o.name) {
			return -1;
		}else if(this.name == o.name) {
			return 0;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age;
	}
}

public class EX_TreeSetMethod3 {
	public static void main(String[] args) {
		TreeSet<Abc_T> treeSet = new TreeSet<>();
		
		treeSet.add(new Abc_T("ȫ�浿", 30));
		treeSet.add(new Abc_T("�̼���", 40));
		treeSet.add(new Abc_T("������", 50));
		
		
		System.out.println(treeSet);
		System.out.println();
		
		TreeSet<Abc_T> treeSet2 = new TreeSet<Abc_T>(new Comparator<Abc_T>() {
			@Override
			public int compare(Abc_T o1, Abc_T o2) {
				if(o1.name != o2.name) {
					return -1;
				}else if(o1.name == o2.name) {
					return 0;
				}else {
					return 1;
				}
				
			}
		});
		
		Abc_T Abc1 = new Abc_T("ȫ�浿", 30);
		Abc_T Abc2 = new Abc_T("�̼���", 40);
		Abc_T Abc3 = new Abc_T("������", 50);
		
		treeSet2.add(Abc1);
		treeSet2.add(Abc2);
		treeSet2.add(Abc3);
		
		System.out.println(treeSet2);
	}
}
