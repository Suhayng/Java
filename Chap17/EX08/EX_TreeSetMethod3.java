package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// 공유 파일 확인!



/*
	이름과 나이를 입력시 이름을 오름 차순으로 출력하도록 구현하다. TreeSet에 namer 칼럽을
 	1. comparable<E> 의 compartTo() 메소드 재정의
 		 : 기존의 객체 수정이 필요
 	2. comparator<E> 의 compare() 구현
 		 : 기존의 객체를 수정 없이 구현
*/

class Abc {
	String name;	// 정렬 컬럼. 오름차순 정렬 : 가 ~ 하, 
					// 홍길동, 이순신, 강감찬 ==> set: 강감찬, 이순신, 홍길동 순으로
	int age;		// 나이
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
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
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class EX_TreeSetMethod3 {
	public static void main(String[] args) {
		TreeSet<Abc_T> treeSet = new TreeSet<>();
		
		treeSet.add(new Abc_T("홍길동", 30));
		treeSet.add(new Abc_T("이순신", 40));
		treeSet.add(new Abc_T("강감찬", 50));
		
		
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
		
		Abc_T Abc1 = new Abc_T("홍길동", 30);
		Abc_T Abc2 = new Abc_T("이순신", 40);
		Abc_T Abc3 = new Abc_T("강감찬", 50);
		
		treeSet2.add(Abc1);
		treeSet2.add(Abc2);
		treeSet2.add(Abc3);
		
		System.out.println(treeSet2);
	}
}
