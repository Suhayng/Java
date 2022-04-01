package Chap17.EX06;

// HashSet 으로 변환
// Member 클래스의 memberid 컬럼을

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {					// DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	
	public Member (int memberid, String memberName) {		// 생성자를 통해서 필드의 값 할당
		this.memberid = memberid;
		this.memberName = memberName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			this.memberid = ((Member)obj).memberid;
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(memberid);
	}
	
	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString() {
			return memberName + "회원님의 아이디는 " + memberid + " 입니다." ;
		}
}

class MemberHashSet {			// MemberArrayList 를 객체화 하면 ArrayList 객체가 생성 된다.
	private Set<Member> hashSet;
		
	public MemberHashSet () {		// 기본 생성자 
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		// Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		hashSet.add(member);		
	}
	
	
	public	void removeMember (int memberid) {
		// iterator 사용해서 remove
		
		Iterator <Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			if(hashSet.equals(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(memberid + " 가 존재 하지 않습니다. ");
	}
	
	public void showAllMember() {
		// iterator
		Iterator <Member> iterator2 = hashSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next() + " ");
		}
		
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class EX_MemberHashSet {
	public static void main(String[] args) {

		MemberHashSet memberhashSet = new MemberHashSet();	// 객체를 생성하는 순간 arrayList 필드가 활성화 
			// 메소드 호출하기 위해서 객체 생성
			// addMember(), addMember2(), removeMember(), showAllMemeber()
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee2 = new Member(1001, "이지원");
		
		memberhashSet.addMember(memberLee);		// 각 객체를 생성해서 ArrayList 에 저장
		memberhashSet.addMember(memberSon);
		memberhashSet.addMember(memberPark);
		memberhashSet.addMember(memberHong);
		memberhashSet.addMember(memberLee2);
		
		memberhashSet.showSize();		// 4개 출력 되야함
		
		// 모든 사용자 정보 출력
	
		memberhashSet.showAllMember();
		
			
		
		
		
	}
}
